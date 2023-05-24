package com.smart.focus.ceoapi.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.smart.focus.ceoapi.common.CommonLib;
import com.smart.focus.ceoapi.common.ConstDef;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings({ "unchecked" })
public class BomService {

    @Autowired
    private SpProcServiceImpl storeProcService;

    // bom 정전개
    public List<Map<String, Object>> calcRequireMaterial(String productCode, int qty, String title) {
        JSONObject sendParam = new JSONObject();
        JSONObject param = new JSONObject();

        param.put("최상위품번", productCode);
        param.put("대수", qty);
        param.put("title", title);
        param.put("완제품코드", productCode);
        sendParam.put("proc", "spFindAllBomCalcQtyByTopCode");
        sendParam.put("db", ConstDef.DATA_BASE);
        sendParam.put("ps", param);

        List<Map<String, Object>> bomInfoList = storeProcService.select(sendParam);
        String topSeqId = "";
        for (int j = 0; j < bomInfoList.size(); j++) {
            if (bomInfoList.get(j).get("상위품번") == null) {
                bomInfoList.get(j).put("parentSeqId", null);
                topSeqId = bomInfoList.get(j).get("seqId").toString();
                continue;
            }
            Map<String, Object> key = new HashMap<String, Object>();
            key.put("품명", bomInfoList.get(j).get("상위품번"));
            int where = CommonLib.findIndex(bomInfoList, "품번", bomInfoList.get(j).get("상위품번").toString());
            bomInfoList.get(j).put("parentSeqId", bomInfoList.get(where).get("seqId"));
        }
        List<Map<String, Object>> tempBomInfoList = new ArrayList<Map<String, Object>>();
        Map<String, Integer> index = new HashMap<String, Integer>();
        index.put("index", 1);
        this.searchChildBomProduct(bomInfoList, index, tempBomInfoList, title, productCode, "S" + topSeqId);
        for (int j = 0; j < bomInfoList.size(); j++) {
            tempBomInfoList.add(bomInfoList.get(j));
        }
        /*
         * for(int j = 0; j < tempBomInfoList.size(); j++) {
         * Log.Debug("품번=%s SeqId=%s", tempBomInfoList.get(j).get("품번").toString(),
         * tempBomInfoList.get(j).get("seqId").toString());
         * }
         */
        Map<String, Object> saveParam = new HashMap<String, Object>();
        saveParam.put("db", ConstDef.DATA_BASE);

        Map<String, Object> delParam = new HashMap<String, Object>();
        delParam.put("title", title);
        delParam.put("완제품코드", productCode);
        bomInfoList.clear();
        bomInfoList.add(delParam);

        saveParam.put("ps", bomInfoList);
        saveParam.put("proc", "spDeleteReqMaterialByTitleAndPCode");
        storeProcService.updateFromMap(saveParam);

        saveParam.put("proc", "spSaveReqMaterial");
        saveParam.put("ps", tempBomInfoList);
        storeProcService.updateFromMap(saveParam);
        return null;
    }

    public void searchChildBomProduct(List<Map<String, Object>> bomList, Map<String, Integer> index,
            List<Map<String, Object>> tempBomInfoList, String title, String productCode, String indexPrifix) {
        JSONObject sendParam = new JSONObject();
        JSONObject param = new JSONObject();

        sendParam.put("proc", "spFindAllSemiBomCalcQtyByTopCode");
        sendParam.put("db", ConstDef.DATA_BASE);

        param.put("title", title);
        param.put("완제품코드", productCode);

        List<Map<String, Object>> localList = null;
        for (int i = 0; i < bomList.size(); i++) {
            // Log.Debug("상위품번=%s 품목유형=%s", bomList.get(i).get("상위품번"),
            // bomList.get(i).get("품목유형").toString());
            if (bomList.get(i).get("상위품번") != null
                    && !bomList.get(i).get("품목유형").toString().equals(ConstDef.PURCHASE_CODE)) {
                param.put("상위품번", bomList.get(i).get("품번").toString());
                param.put("최상위품번", bomList.get(i).get("상위품번") == null ? "" : bomList.get(i).get("상위품번").toString());
                param.put("대수", Float.parseFloat(bomList.get(i).get("소요량").toString()));
                sendParam.put("ps", param);
                String goodsType = bomList.get(i).get("품목유형").toString();

                localList = storeProcService.select(sendParam);
                for (int j = 0; j < localList.size(); j++) {
                    Integer surfix = (Integer) index.get("index");
                    localList.get(j).put("seqId", indexPrifix + surfix++);
                    index.put("index", surfix);
                    tempBomInfoList.add(localList.get(j));
                }
                for (int j = 0; j < localList.size(); j++) {
                    int where = CommonLib.findIndex(localList, "품번", localList.get(j).get("상위품번").toString());
                    if (where < 0) {
                        localList.get(j).put("parentSeqId", bomList.get(i).get("seqId").toString());
                    } else {
                        localList.get(j).put("parentSeqId", localList.get(where).get("seqId").toString());
                    }
                }
                if (localList.size() > 0) {
                    if (goodsType.equals(ConstDef.ASSY_CODE)) {
                        this.searchChildBomProduct(localList, index, tempBomInfoList, title, productCode,
                                indexPrifix + "S");
                    }
                }
            }
        }
    }

    public void saveTempMrpGroupByDate(String userId, String title, String pCode, String date, int qty) {
        JSONObject sendParam = new JSONObject();
        JSONObject param = new JSONObject();
        JSONArray psArray = new JSONArray();
        sendParam.put("proc", "spSaveTempQty");
        sendParam.put("db", ConstDef.DATA_BASE);

        param.put("title", title);
        param.put("소요일자", date);
        param.put("완제품코드", pCode);
        param.put("대수", qty);
        param.put("createId", userId);
        psArray.add(param);
        sendParam.put("ps", psArray);
        storeProcService.update(sendParam);
    }

    // 필요없음
    public void saveMrpGroupByDate(String userId, String title, String date, int qty) {
        JSONObject sendParam = new JSONObject();
        JSONObject param = new JSONObject();
        JSONArray psArray = new JSONArray();
        // sendParam.put("proc","spSaveTotalQtyByTitle");
        sendParam.put("db", ConstDef.DATA_BASE);

        param.put("title", title);
        param.put("소요일자", date);
        param.put("대수", qty);
        param.put("createId", userId);
        psArray.add(param);
        sendParam.put("ps", psArray);
        // storeProcService.update(sendParam);
        // 라인별(완제품/반제품/다공정품)
        sendParam.put("proc", "spSaveTotalQtyByTitleAndSubPcode");
        storeProcService.update(sendParam);
    }
}
