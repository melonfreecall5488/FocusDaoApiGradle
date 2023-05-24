package com.smart.focus.ceoapi.service.SoapService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.smart.focus.ceoapi.common.CommonLib;
import com.smart.focus.ceoapi.common.ConstDef;
import com.smart.focus.ceoapi.common.Log;
import com.smart.focus.ceoapi.service.SpProcServiceImpl;
import com.smart.focus.ceoapi.service.SoapService.SoapApiClass.ConsumptionCost;
// import com.smart.focus.ceoapi.service.SoapService.SoapApiClass.Customer;
import com.smart.focus.ceoapi.service.SoapService.SoapApiClass.CustomerV2;
import com.smart.focus.ceoapi.service.SoapService.SoapApiClass.GoodsMovement;
// import com.smart.focus.ceoapi.service.SoapService.SoapApiClass.Supplier;
import com.smart.focus.ceoapi.service.SoapService.SoapApiClass.SupplierV2;
import com.smart.focus.ceoapi.service.SoapService.SoapApiClass.InOutputList;
import com.smart.focus.ceoapi.service.SoapService.SoapApiClass.InputSend;
import com.smart.focus.ceoapi.service.SoapService.SoapApiClass.ManageIdentifiedStocksIn;
import com.smart.focus.ceoapi.service.SoapService.SoapApiClass.Material;
import com.smart.focus.ceoapi.service.SoapService.SoapApiClass.MaterialV2;
import com.smart.focus.ceoapi.service.SoapService.SoapApiClass.OutputSend;
import com.smart.focus.ceoapi.service.SoapService.SoapApiClass.OutputSendCBO;
import com.smart.focus.ceoapi.service.SoapService.SoapApiClass.ProductOrder;
import com.smart.focus.ceoapi.service.SoapService.SoapApiClass.ProductResult;
import com.smart.focus.ceoapi.service.SoapService.SoapApiClass.QueryIdentifiedStocksIn;
import com.smart.focus.ceoapi.wsdl2.input_list.SiteLogisticsLotMaterialInput;
import com.smart.focus.ceoapi.wsdl2.input_list.SiteLogisticsLotMaterialOutput;
import com.smart.focus.ceoapi.wsdl2.input_list.SiteLogisticsTaskByElementsResponseSync;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings({ "unchecked" })
public class SoapService {
    @Autowired
    private SpProcServiceImpl storeProcService;

    // SAP 입고, 반송입고, 출하, 불량출고 전체 조회
    public JSONArray reqInputList() {
        InOutputList inOutList = new InOutputList();

        List<SiteLogisticsTaskByElementsResponseSync> list = inOutList.reqInOutputList(true); // true: 입고 false: 출고
        JSONArray array = saveInOutList(list);
        Log.Trace("The end reqInputList");
        return array;
    }

    public JSONArray saveInOutList(List<SiteLogisticsTaskByElementsResponseSync> list) {
        JSONArray array = new JSONArray();
        Integer op11 = 0, op13 = 0, op21 = 0, op23=0 , others=0;
               
        for (SiteLogisticsTaskByElementsResponseSync item : list) {
            List<SiteLogisticsLotMaterialOutput> inOutputList = item.getSiteLogisticsTaskReferencedObject()
                    .getSiteLogisticsLotOperationActivity().getMaterialOutput();
            int opType = Integer.parseInt(item.getOperationTypeCode().getValue());
            if (opType == 11)
                op11++;
            else if (opType == 13)
                op13++;
            else if (opType == 21)
                op21++;
            else if (opType == 23)
                op23++;
            else
                others++;

            if (opType != 11 && opType != 12 && opType != 23 && opType != 24)
                continue;
            for (SiteLogisticsLotMaterialOutput inOut : inOutputList) {
                JSONObject temp = new JSONObject();
                temp.put("siteLogisticsTaskId",
                        item.getSiteLogisticsTaskID() == null ? "" : item.getSiteLogisticsTaskID().getValue());
                temp.put("operationActivityUuid",
                        item.getSiteLogisticsTaskReferencedObject().getSiteLogisticsLotOperationActivity()
                                .getSiteLogisticsLotOperationActivityUUID() == null
                                        ? ""
                                        : item.getSiteLogisticsTaskReferencedObject()
                                                .getSiteLogisticsLotOperationActivity()
                                                .getSiteLogisticsLotOperationActivityUUID().getValue());
                temp.put("발주번호", inOut.getSiteLogisticsLotMaterialOutputUUID() == null ? ""
                        : inOut.getSiteLogisticsLotMaterialOutputUUID().getValue());
                temp.put("matrialOutpuUuid", inOut.getSiteLogisticsLotMaterialOutputUUID() == null ? ""
                        : inOut.getSiteLogisticsLotMaterialOutputUUID().getValue());
                Log.Debug(inOut.getSiteLogisticsLotMaterialOutputUUID() == null ? ""
                        : inOut.getSiteLogisticsLotMaterialOutputUUID().getValue());
                temp.put("sourceLogisticsAreaId", inOut.getTargetLogisticsAreaID());
                temp.put("identifiedStockId",
                        inOut.getIdentifiedStockID() == null ? "" : inOut.getIdentifiedStockID().getValue());
                temp.put("품번", inOut.getProductID() == null ? "" : inOut.getProductID().getValue());
                temp.put("품명", inOut.getProductDescription() == null ? "" : inOut.getProductDescription().getValue());
                temp.put("오더수량", inOut.getPlanQuantity() == null ? 0 : inOut.getPlanQuantity().getValue().intValue());
                temp.put("잔량", inOut.getOpenQuantity() == null ? 0 : inOut.getOpenQuantity().getValue().intValue());
                temp.put("TotalConfirmedQuantity", inOut.getTotalConfirmedQuantity() == null ? 0
                        : inOut.getTotalConfirmedQuantity().getValue().intValue());
                temp.put("logisticUnitUuid", inOut.getLogisticPackageOutput() == null ? ""
                        : inOut.getLogisticPackageOutput().getLogisticUnitUUID().getValue());
                temp.put("logisticUnitTotalConfirmedQuantity",
                        inOut.getLogisticPackageOutput() == null ? 0
                                : inOut.getLogisticPackageOutput().getLogisticUnitTotalConfirmedQuantity().getValue()
                                        .intValue());
                temp.put("logisticUnitOpenQuantity", inOut.getLogisticPackageOutput() == null ? 0
                        : inOut.getLogisticPackageOutput().getLogisticUnitOpenQuantity().getValue().intValue());
                temp.put("logisticUnitPlanQuantity", inOut.getLogisticPackageOutput() == null ? 0
                        : inOut.getLogisticPackageOutput().getLogisticUnitPlanQuantity().getValue().intValue());
                temp.put("materialDeviationStatusCode", inOut.getMaterialDeviationStatusCode());
                temp.put("lineItemId", inOut.getLineItemID());
                temp.put("operationType", item.getOperationTypeCode().getValue());
                array.add(temp);
            }
        }
        Log.Debug("11=%s 13=%s 21=%s 23=%s others=%s", op11.toString(), op13.toString(), op21.toString(),
                op23.toString(), others.toString());
        // material output save
        JSONObject sendParam = new JSONObject();
        sendParam.put("proc", "spSavePurchaseOrderOut");
        sendParam.put("db", ConstDef.DATA_BASE);
        sendParam.put("ps", array);
        storeProcService.update(sendParam);

        // input uuid update
        array.clear();
        for (SiteLogisticsTaskByElementsResponseSync item : list) {
            List<SiteLogisticsLotMaterialInput> inOutputList = item.getSiteLogisticsTaskReferencedObject()
                    .getSiteLogisticsLotOperationActivity().getMaterialInput();
            int opType = Integer.parseInt(item.getOperationTypeCode().getValue());
            if (opType != 11 && opType != 12 && opType != 23 && opType != 24)
                continue;
            for (SiteLogisticsLotMaterialInput inOut : inOutputList) {
                JSONObject temp = new JSONObject();
                // inOut.get
                temp.put("siteLogisticsTaskId",
                        item.getSiteLogisticsTaskID() == null ? "" : item.getSiteLogisticsTaskID().getValue());
                temp.put("operationActivityUuid",
                        item.getSiteLogisticsTaskReferencedObject().getSiteLogisticsLotOperationActivity()
                                .getSiteLogisticsLotOperationActivityUUID() == null
                                        ? ""
                                        : item.getSiteLogisticsTaskReferencedObject()
                                                .getSiteLogisticsLotOperationActivity()
                                                .getSiteLogisticsLotOperationActivityUUID().getValue());
                temp.put("품번", inOut.getProductID() == null ? "" : inOut.getProductID().getValue());
                temp.put("matrialInputUuid", inOut.getSiteLogisticsLotMaterialInputUUID() == null ? ""
                        : inOut.getSiteLogisticsLotMaterialInputUUID().getValue());
                array.add(temp);
            }
        }
        sendParam.clear();
        sendParam.put("proc", "spUpdatePurchaseOrderInUuidByTackAndActivityUuid");
        sendParam.put("db", ConstDef.DATA_BASE);
        sendParam.put("ps", array);
        storeProcService.update(sendParam);
        return array;
    }

    // 발주사 조회
    public JSONArray reqCustomer() {
        CustomerV2 customer = new CustomerV2();
        JSONArray array = customer.reqCustomer();
        JSONObject sendParam = new JSONObject();
        sendParam.put("table", "발주사정보");
        sendParam.put("db", ConstDef.DATA_BASE);
        sendParam.put("ps", array);
        JSONArray pk = new JSONArray();
        pk.add("거래처코드");
        sendParam.put("pk", pk);
        storeProcService.insertOrupdateRuntimeSql(sendParam);
        Log.Trace("The end reqCustomer");
        return array;
    }

    // 품목정보 조회
    public JSONArray reqMaterial() {
        Material material = new Material();
        JSONArray array = material.reqMaterial();
        JSONObject sendParam = new JSONObject();
        sendParam.put("table", "품목정보");
        sendParam.put("db", ConstDef.DATA_BASE);
        sendParam.put("ps", array);
        JSONArray pk = new JSONArray();
        pk.add("품번");
        sendParam.put("pk", pk);
        storeProcService.insertOrupdateRuntimeSql(sendParam);
        Log.Trace("The end reqMaterial");
        return array;
    }
    // NEW 품목정보 조회
    public JSONArray reqMaterialV2() {
        String sql = String.format("SELECT MAX(updatetime) AS updatetime FROM %s.품목정보", ConstDef.DATA_BASE);
        String date = "1900-01-01";
        List<Map<String, Object>> result = storeProcService.runSqlSelect(sql);
        if (result.get(0).get("updatetime") != null) {
            date = CommonLib.calDateFromString(result.get(0).get("updatetime").toString(), "yyyy-MM-dd HH:mm:ss", -1, "yyyy-MM-dd");
        }
        MaterialV2 material = new MaterialV2();
        JSONArray array = material.reqMaterial(date);
        JSONObject sendParam = new JSONObject();
        sendParam.put("table", "품목정보");
        sendParam.put("db", ConstDef.DATA_BASE);
        sendParam.put("ps", array);
        JSONArray pk = new JSONArray();
        pk.add("품번");
        sendParam.put("pk", pk);
        storeProcService.insertOrupdateRuntimeSql(sendParam);
        Log.Trace("The end reqMaterial");
        return array;
    }

    // 공급업체 조회
    public JSONArray reqSupplier() {
        // Supplier supplier = new Supplier(); // 기존 버전
        SupplierV2 supplier = new SupplierV2();
        JSONArray array = supplier.reqSupplier();
        JSONObject sendParam = new JSONObject();
        sendParam.put("table", "거래처정보");
        sendParam.put("db", ConstDef.DATA_BASE);
        sendParam.put("ps", array);
        JSONArray pk = new JSONArray();
        pk.add("거래처코드");
        sendParam.put("pk", pk);
        storeProcService.insertOrupdateRuntimeSql(sendParam);
        Log.Trace("The end reqSupplier");
        return array;
    }

    // 완제품 입고 계획 조회
    public JSONArray reqProductOrder() {
        ProductOrder order = new ProductOrder();
        JSONArray array = order.reqOrder();
        JSONObject sendParam = new JSONObject();
        sendParam.put("table", "생산지시");
        sendParam.put("db", ConstDef.DATA_BASE);
        sendParam.put("ps", array);
        JSONArray pk = new JSONArray();
        pk.add("productionlotid");
        pk.add("materialoutputuuid");
        sendParam.put("pk", pk);
        storeProcService.insertOrupdateRuntimeSql(sendParam);
        Log.Trace("The end reqProductOrder");
        return array;

    }

    // 상품 자재 입고
    public void sendToSapInputResult() {
        String sql = String.format(
                "SELECT siteLogisticsTaskId as taskId,matrialOutpuUuid FROM %s.구매발주서OUT WHERE TASK_INPUT_END = TRUE AND SAP_UPDATED = FALSE  AND (operationType = '11' OR operationType = '12')  GROUP BY siteLogisticsTaskId,matrialOutpuUuid;",
                ConstDef.DATA_BASE);
        List<Map<String, Object>> taskIdList = storeProcService.runSqlSelect(sql);
        Log.Trace("입고구매품 SAP 전송 size=%d", taskIdList.size());

        if (taskIdList.size() > 0) {
            InputSend send = new InputSend();
            for (int i = 0; i < taskIdList.size(); i++) {
                JSONObject sendParam = new JSONObject();
                JSONObject ps = new JSONObject();
                ps.put("inOutType", ConstDef.상품입고);
                ps.put("outPutUuid", taskIdList.get(i).get("matrialOutpuUuid").toString());
                Log.Debug(ps.get("outPutUuid").toString());
                sendParam.put("proc", "spFindAllInOutResultByOutPutUuid");
                sendParam.put("db", ConstDef.DATA_BASE);
                sendParam.put("ps", ps);
                List<Map<String, Object>> inList = storeProcService.select(sendParam);
                Log.Debug(inList.toString());
                Log.Debug(sendParam.toJSONString());
                // list 만큼 동종재고 생성
                for (int j = 0; j < inList.size(); j++) {
                    String iCode = (String) inList.get(j).get("동종재고코드");
                    String pCode = (String) inList.get(j).get("품번");
                    Log.Debug("동종제고생성= %s", iCode);
                    if (iCode != null) {
                        // call create iCode
                        stockCheck(iCode, pCode);
                    }
                }
                try {
                    String result = send.reqInputSend(inList);
                    if (result.toLowerCase().indexOf("success") >= 0) {
                        sql = String.format(
                                "update %s.구매발주서OUT set  SAP_UPDATED = true, MESSAGE='%s'  where siteLogisticsTaskId = '%s' AND matrialOutpuUuid = '%s' ;",
                                ConstDef.DATA_BASE, result, taskIdList.get(i).get("taskId").toString(),
                                taskIdList.get(i).get("matrialOutpuUuid").toString());
                    } else {
                        sql = String.format("update %s.구매발주서OUT set MESSAGE='%s'  where siteLogisticsTaskId = '%s' AND matrialOutpuUuid = '%s' ;",
                                ConstDef.DATA_BASE, result, taskIdList.get(i).get("taskId").toString(),
                                ConstDef.DATA_BASE, result, taskIdList.get(i).get("matrialOutpuUuid").toString());
                    }
                    storeProcService.directCallSql(sql);
                } catch (Exception e) {
                    Log.Error(e.getMessage());
                    sql = String.format("update %s.구매발주서OUT set MESSAGE='%s'  where siteLogisticsTaskId = '%s' AND matrialOutpuUuid = '%s' ;",
                            ConstDef.DATA_BASE, "Exception 발생", taskIdList.get(i).get("taskId").toString(),
                            taskIdList.get(i).get("matrialOutpuUuid").toString());
                    storeProcService.directCallSql(sql);

                }
            }
        }
    }

    // 판매품 반송 입고결과 전송 : InputSend 사용
    public void sendToSapOutputReturnResult() {
        Log.Trace("판매 반송품 입고 결과 SAP 전송 (개발중)----");

        String sql = String.format(
                "SELECT DISTINCT siteLogisticsTaskId as taskId FROM %s.출고반품리스트 WHERE 반품완료 = TRUE AND SAP_UPDATED = FALSE;",
                ConstDef.DATA_BASE);
        List<Map<String, Object>> taskIdList = storeProcService.runSqlSelect(sql);
        Log.Trace("판매품 반송 SAP 전송 size=%d", taskIdList.size());
        Log.Debug(taskIdList.toString());

        if (taskIdList.size() > 0) {
            InputSend send = new InputSend();
            for (int i = 0; i < taskIdList.size(); i++) {
                sql = String.format("SELECT * FROM %s.출고반품리스트 WHERE siteLogisticsTaskId = '%s';", ConstDef.DATA_BASE,
                        taskIdList.get(i).get("taskId").toString());
                List<Map<String, Object>> inList = storeProcService.runSqlSelect(sql); // list 만큼 동종재고 생성
                for (int j = 0; j < inList.size(); j++) {
                    String iCode = (String) inList.get(j).get("동종재고코드");
                    String pCode = (String) inList.get(j).get("품번");
                    if (iCode != null) { // call create iCode
                        stockCheck(iCode, pCode);
                    }
                }
                try {
                    String result = send.reqInputSendReturn(inList);
                    if (result.toLowerCase().indexOf("success") >= 0) {
                        sql = String.format(
                                "update %s.출고반품리스트 set  SAP_UPDATED = true, MESSAGE='%s'  where siteLogisticsTaskId = '%s';",
                                ConstDef.DATA_BASE, result, taskIdList.get(i).get("taskId").toString());
                    } else {
                        sql = String.format("update %s.출고반품리스트 set MESSAGE='%s'  where siteLogisticsTaskId = '%s';",
                                ConstDef.DATA_BASE, result, taskIdList.get(i).get("taskId").toString());
                    }
                    storeProcService.directCallSql(sql);
                } catch (Exception e) {
                    Log.Error(e.getMessage());
                    sql = String.format("update %s.출고반품리스트 set MESSAGE='%s'  where siteLogisticsTaskId = '%s';",
                            ConstDef.DATA_BASE, "Exception 발생", taskIdList.get(i).get("taskId").toString());
                    storeProcService.directCallSql(sql);

                }
            }
        }

    }

    // 불량품 반송
    public void sendToSapOutputResult() {
        String sql = String.format(
                "SELECT siteLogisticsTaskId as taskId,matrialOutpuUuid FROM %s.구매발주서OUT WHERE TASK_INPUT_END = TRUE AND SAP_UPDATED = FALSE  AND (operationType = '23' OR operationType = '24')  GROUP BY siteLogisticsTaskId,matrialOutpuUuid;",
                ConstDef.DATA_BASE);
        List<Map<String, Object>> taskIdList = storeProcService.runSqlSelect(sql);
        Log.Trace("불량자재 반품 SAP 전송 size=%d", taskIdList.size());
        Log.Debug(taskIdList.toString());

        if (taskIdList.size() > 0) {
            OutputSend send = new OutputSend(storeProcService);
            for (int i = 0; i < taskIdList.size(); i++) {
                JSONObject sendParam = new JSONObject();
                JSONObject ps = new JSONObject();
                ps.put("inOutType", ConstDef.불량품출고);
                ps.put("outPutUuid", taskIdList.get(i).get("matrialOutpuUuid").toString());
                sendParam.put("proc", "spFindAllInOutResultByOutPutUuid");
                sendParam.put("db", ConstDef.DATA_BASE);
                sendParam.put("ps", ps);
                List<Map<String, Object>> returnList = storeProcService.select(sendParam);
                Log.Debug(returnList.toString());
                try {
                    String result = send.reqOutputSend(returnList);
                    if (result.toLowerCase().indexOf("success") >= 0) {
                        sql = String.format(
                                "update %s.구매발주서OUT set  SAP_UPDATED = true, MESSAGE='%s'  where siteLogisticsTaskId = '%s' AND matrialOutpuUuid = '%s' ;",
                                ConstDef.DATA_BASE, result, taskIdList.get(i).get("taskId").toString(),
                                taskIdList.get(i).get("matrialOutpuUuid").toString());
                    } else {
                        sql = String.format("update %s.구매발주서OUT set MESSAGE='%s'  where siteLogisticsTaskId = '%s' AND matrialOutpuUuid = '%s' ;",
                                ConstDef.DATA_BASE, result, taskIdList.get(i).get("taskId").toString(),
                                ConstDef.DATA_BASE, result, taskIdList.get(i).get("matrialOutpuUuid").toString());
                    }
                    storeProcService.directCallSql(sql);
                } catch (Exception e) {
                    Log.Error(e.getMessage());
                    sql = String.format("update %s.구매발주서OUT set MESSAGE='%s'  where siteLogisticsTaskId = '%s' AND matrialOutpuUuid = '%s' ;",
                            ConstDef.DATA_BASE, "Exception 발생", taskIdList.get(i).get("taskId").toString(),
                            taskIdList.get(i).get("matrialOutpuUuid").toString());
                    storeProcService.directCallSql(sql);
                }
            }
        }
    }

    // 완제품 입고 전송
    public void sendToSapProductResult() {
        String sql = String.format(
                "SELECT ProducionTaskUUID as taskId FROM %s.생산지시 WHERE TASK_INPUT_END=true AND SAP_UPDATED=false GROUP BY ProducionTaskUUID;",
                ConstDef.DATA_BASE);
        List<Map<String, Object>> taskIdList = storeProcService.runSqlSelect(sql);
        Log.Trace("생산지시 SAP 전송 size=%d", taskIdList.size());
        Log.Debug(taskIdList.toString());

        if (taskIdList.size() > 0) {
            ProductResult send = new ProductResult();
            for (int i = 0; i < taskIdList.size(); i++) {
                JSONObject sendParam = new JSONObject();
                JSONObject ps = new JSONObject();
                ps.put("taskId", taskIdList.get(i).get("taskId").toString());
                sendParam.put("proc", "spFindAllProductResultByTaskId");
                sendParam.put("db", ConstDef.DATA_BASE);
                sendParam.put("ps", ps);
                List<Map<String, Object>> inList = storeProcService.select(sendParam);
                // list 만큼 동종재고 생성
                for (int j = 0; j < inList.size(); j++) {
                    String iCode = (String) inList.get(j).get("동종재고코드");
                    String pCode = (String) inList.get(j).get("품번");
                    if (iCode != null) {
                        // call create iCode
                        stockCheck(iCode, pCode);
                    }
                }
                try {
                    String result = send.reqProductSend(inList);
                    if (result.toLowerCase().indexOf("success") >= 0) {
                        sql = String.format(
                                "update %s.생산지시 set  SAP_UPDATED = true, MESSAGE='%s'  where ProducionTaskUUID = '%s';",
                                ConstDef.DATA_BASE, result, taskIdList.get(i).get("taskId").toString());
                    } else {
                        sql = String.format("update %s.생산지시 set MESSAGE='%s'  where ProducionTaskUUID = '%s';",
                                ConstDef.DATA_BASE, result, taskIdList.get(i).get("taskId").toString());
                    }
                    storeProcService.directCallSql(sql);
                } catch (Exception e) {
                    sql = String.format("update %s.생산지시 set MESSAGE='%s'  where ProducionTaskUUID = '%s';",
                            ConstDef.DATA_BASE, "Exception 발생", taskIdList.get(i).get("taskId").toString());
                    storeProcService.directCallSql(sql);
                    Log.Error(e.getMessage());
                }
            }
        }
    }

    // 택배/일반 출하 전송
    public void sendToSapPostPackingListCBO() {
        String sql = String.format(
                "select TYPE_IF as typeIF, NO_SALES as noSales from %s.패킹리스트 where  SAP_UPDATED=false AND 출고확인=true AND (TYPE_IF='%s' OR TYPE_IF='%s') GROUP BY TYPE_IF, NO_SALES;",
                ConstDef.DATA_BASE, ConstDef.POST_PICK, ConstDef.GEN_PICK);
        List<Map<String, Object>> taskIdList = storeProcService.runSqlSelect(sql);
        Log.Trace("패킹리스트 SAP 전송 size=%d", taskIdList.size());
        Log.Debug(taskIdList.toString());

        if (taskIdList.size() > 0) {
            OutputSendCBO send = new OutputSendCBO(storeProcService);
            for (int i = 0; i < taskIdList.size(); i++) {
                JSONObject sendParam = new JSONObject();
                JSONObject ps = new JSONObject();
                ps.put("typeIf", taskIdList.get(i).get("typeIf").toString());
                ps.put("noSales", taskIdList.get(i).get("noSales").toString());
                sendParam.put("proc", "spFindAllPackingResultByTypeIfAndNoSales");
                sendParam.put("db", ConstDef.DATA_BASE);
                sendParam.put("ps", ps);
                List<Map<String, Object>> inList = storeProcService.select(sendParam);
                try {
                    for (int j = 0; j < inList.size(); j++) {
                        String iCode = (String) inList.get(j).get("cdIdentstock");
                        String pCode = (String) inList.get(j).get("cdItem");
                        if (iCode != null) {
                            // call create iCode
                            stockCheck(iCode, pCode);
                        }
                    }
                    String result = send.reqOutputSendPost(inList, taskIdList.get(i).get("typeIf").toString());
                    if (result.toLowerCase().indexOf("success") >= 0) {
                        sql = String.format(
                                "update %s.패킹리스트 set  SAP_UPDATED = true, MESSAGE='%s'  where TYPE_IF='%s' AND NO_SALES='%s';",
                                ConstDef.DATA_BASE, result,
                                taskIdList.get(i).get("typeIf").toString(),
                                taskIdList.get(i).get("noSales").toString()
                                );
                    } else {
                        sql = String.format("update %s.패킹리스트 set MESSAGE='%s'  where TYPE_IF='%s' AND NO_SALES='%s';",
                                ConstDef.DATA_BASE, result,
                                taskIdList.get(i).get("typeIf").toString(),
                                taskIdList.get(i).get("noSales").toString()
                                );
                    }
                    storeProcService.directCallSql(sql);
                } catch (Exception e) {
                    Log.Error(e.getMessage());
                    sql = String.format("update %s.패킹리스트 set MESSAGE='%s' where TYPE_IF='%s' AND NO_SALES = '%s';",
                            ConstDef.DATA_BASE, "Exception 발생",
                            taskIdList.get(i).get("typeIf").toString(),
                            taskIdList.get(i).get("noSales").toString());
                    storeProcService.directCallSql(sql);
                }
            }
        }
    }

    // 일반 출하 전송
    public void sendToSapGenPickingList() {
        String sql = String.format(
                "select DISTINCT SITELOGISTICTASKID as taskId from %s.출하지시서 where 피킹완료=true and SAP_UPDATED=false",
                ConstDef.DATA_BASE);
        List<Map<String, Object>> taskIdList = storeProcService.runSqlSelect(sql);
        Log.Trace("일반 출하 전송 SAP 전송 size=%d", taskIdList.size());
        Log.Debug(taskIdList.toString());

        if (taskIdList.size() > 0) {
            OutputSend send = new OutputSend(storeProcService);
            for (int i = 0; i < taskIdList.size(); i++) {
                JSONObject sendParam = new JSONObject();
                JSONObject ps = new JSONObject();
                ps.put("taskId", taskIdList.get(i).get("taskId").toString());
                sendParam.put("proc", "spFindAllGenPickingResultByTaskId");
                sendParam.put("db", ConstDef.DATA_BASE);
                sendParam.put("ps", ps);
                List<Map<String, Object>> inList = storeProcService.select(sendParam);
                try {
                    // inList.get(0).toString();
                    String result = send.reqOutputSend(inList);
                    if (result.toLowerCase().indexOf("success") >= 0) {
                        sql = String.format(
                                "update %s.출하지시서 set  SAP_UPDATED = true, MESSAGE='%s'  where SITELOGISTICTASKID = '%s';",
                                ConstDef.DATA_BASE, result, taskIdList.get(i).get("taskId").toString());
                    } else {
                        sql = String.format("update %s.출하지시서 set MESSAGE='%s'  where SITELOGISTICTASKID = '%s';",
                                ConstDef.DATA_BASE, result, taskIdList.get(i).get("taskId").toString());
                    }
                    storeProcService.directCallSql(sql);
                } catch (Exception e) {
                    sql = String.format("update %s.출하지시서 set MESSAGE='%s'  where SITELOGISTICTASKID = '%s';",
                            ConstDef.DATA_BASE, "Exception 발생", taskIdList.get(i).get("taskId").toString());
                    storeProcService.directCallSql(sql);
                    Log.Error(e.getMessage());
                }
            }
        }
    }

    // 일반 출하 전송 CBO
    // public void sendToSapGenPickingListCBO() {
    //     String sql = String.format(
    //             "select DISTINCT NO_SALES as noSales from %s.출하지시서 where 피킹완료=true and SAP_UPDATED=false",
    //             ConstDef.DATA_BASE);
    //     List<Map<String, Object>> taskIdList = storeProcService.runSqlSelect(sql);
    //     Log.Trace("일반 출하 전송 SAP 전송 size=%d", taskIdList.size());
    //     Log.Debug(taskIdList.toString());

    //     if (taskIdList.size() > 0) {
    //         OutputSendCBO send = new OutputSendCBO(storeProcService);
    //         for (int i = 0; i < taskIdList.size(); i++) {
    //             JSONObject sendParam = new JSONObject();
    //             JSONObject ps = new JSONObject();
    //             ps.put("noSales", taskIdList.get(i).get("noSales").toString());
    //             sendParam.put("proc", "spFindAllGenPickingResultByNoSales");
    //             sendParam.put("db", ConstDef.DATA_BASE);
    //             sendParam.put("ps", ps);
    //             List<Map<String, Object>> inList = storeProcService.select(sendParam);
    //             try {
    //                 // inList.get(0).toString();
    //                 String result = send.reqOutputSendPost(inList);
    //                 if (result.toLowerCase().indexOf("success") >= 0) {
    //                     sql = String.format(
    //                             "update %s.출하지시서 set  SAP_UPDATED = true, MESSAGE='%s'  where NO_SALES = '%s';",
    //                             ConstDef.DATA_BASE, result, taskIdList.get(i).get("noSales").toString());
    //                 } else {
    //                     sql = String.format("update %s.출하지시서 set MESSAGE='%s'  where NO_SALES = '%s';",
    //                             ConstDef.DATA_BASE, result, taskIdList.get(i).get("noSales").toString());
    //                 }
    //                 storeProcService.directCallSql(sql);
    //             } catch (Exception e) {
    //                 sql = String.format("update %s.출하지시서 set MESSAGE='%s'  where NO_SALES = '%s';",
    //                         ConstDef.DATA_BASE, "Exception 발생", taskIdList.get(i).get("noSales").toString());
    //                 storeProcService.directCallSql(sql);
    //                 Log.Error(e.getMessage());
    //             }
    //         }
    //     }
    // }
    // 세트 구성 및 해체   
    
    public void sapSendSetUnsetPicking(Integer setType) {
        String typeIf = null;
        if (setType == ConstDef.SET_PICKING) {
            typeIf = "01"; //상품구성
        } else {
            typeIf = "02"; // 상품해체
        }

        String sql = String.format(
                "SELECT distinct NO_REQ AS noReq FROM %s.새트상품구성해체 WHERE TYPE_IF='%s' AND 피킹완료=true and SAP_UPDATED_PICK=false",
                ConstDef.DATA_BASE, typeIf);
        Log.Debug(sql);
        List<Map<String, Object>> setEndList = storeProcService.runSqlSelect(sql);
        Log.Trace("세트 구성/해체 피킹 완료 전송 SAP 전송 size=%d", setEndList.size());
        ConsumptionCost consumptionCost = new ConsumptionCost();
        for (int i = 0; i < setEndList.size(); i++) {
            JSONObject sendParam = new JSONObject();
            JSONObject ps = new JSONObject();

            String orderNo = setEndList.get(i).get("noReq").toString();
            ps.put("orderNo", orderNo);
            ps.put("inoutType", setType);
            sendParam.put("proc", "spFindAllNoOrderItemListByOrderNoAndInoutType");
            sendParam.put("db", ConstDef.DATA_BASE);
            sendParam.put("ps", ps);

            List<Map<String, Object>> noOrderList = storeProcService.select(sendParam);
            String result = consumptionCost.reqConsumptionCost(noOrderList, setType);
            try {
                if (result.toLowerCase().indexOf("success") >= 0) {
                    sql = String.format(
                            "update %s.새트상품구성해체 SET SAP_UPDATED_PICK = true WHERE TYPE_IF='%s' AND NO_REQ = '%s';",
                            ConstDef.DATA_BASE, typeIf, orderNo);
                    storeProcService.directCallSql(sql);
                }
            } catch (Exception e) {
                Log.Trace("세트 구성해체 피킹 완료(%s) 전송 실패 orderNo=%d", orderNo);
            }
        }
    }
    
    public void sapSendSetUnsetInput(Integer setType) {
        String typeIf = null;
        if (setType == ConstDef.SET_INPUT) {
            typeIf = "01"; // 상품구성
        } else {
            typeIf = "02"; // 상품해체
        }

        String sql = String.format(
                "SELECT distinct NO_REQ AS noReq FROM %s.새트상품구성해체 WHERE TYPE_IF='%s' AND 구성완료=true and SAP_UPDATED_SET=false",
                ConstDef.DATA_BASE, typeIf);
        Log.Debug(sql);
        List<Map<String, Object>> setEndList = storeProcService.runSqlSelect(sql);
        Log.Trace("세트 구성/해체 입고 완료 SAP 전송 size=%d", setEndList.size());
        ConsumptionCost consumptionCost = new ConsumptionCost();
        for (int i = 0; i < setEndList.size(); i++) {
            JSONObject sendParam = new JSONObject();
            JSONObject ps = new JSONObject();

            String orderNo = setEndList.get(i).get("noReq").toString();
            ps.put("orderNo", orderNo);
            ps.put("inoutType", setType);
            sendParam.put("proc", "spFindAllNoOrderItemListByOrderNoAndInoutType");
            sendParam.put("db", ConstDef.DATA_BASE);
            sendParam.put("ps", ps);

            List<Map<String, Object>> noOrderList = storeProcService.select(sendParam);
            for (int j = 0; j < noOrderList.size(); j++) {
                String iCode = (String) noOrderList.get(j).get("동종재고코드");
                String pCode = (String) noOrderList.get(j).get("품번");
                Log.Debug("동종제고생성= %s", iCode);
                if (iCode != null) {
                    stockCheck(iCode, pCode);
                }
            }
            String result = consumptionCost.reqConsumptionCost(noOrderList, setType);
            try {
                if (result.toLowerCase().indexOf("success") >= 0) {
                    sql = String.format(
                            "update %s.새트상품구성해체 SET SAP_UPDATED_SET = true WHERE TYPE_IF='%s' AND NO_REQ = '%s';",
                            ConstDef.DATA_BASE, typeIf, orderNo);
                    storeProcService.directCallSql(sql);
                }
            } catch (Exception e) {
                Log.Trace("세트 구성해체 입고 완료(%s) 전송 실패 orderNo=%d", orderNo);
            }
        }
    }
    public void sendToSapOthersInOut() {
        String sql = "";
        JSONObject sendParam = new JSONObject();
        JSONObject ps = new JSONObject();
        ps.put("inoutType", ConstDef.OTHERS_OUT);
        sendParam.put("proc", "spFindAllOtherInOutByInoutType");
        sendParam.put("db", ConstDef.DATA_BASE);
        sendParam.put("ps", ps);
        List<Map<String, Object>> taskIdList = storeProcService.select(sendParam);
        Log.Trace("기타출고 SAP 전송 size=%d", taskIdList.size());

        List<Map<String, Object>> sendList = new ArrayList<Map<String, Object>>();
        ConsumptionCost consumptionCost = new ConsumptionCost();
        for (int i = 0; i < taskIdList.size(); i++) {
            sendList.clear();
            sendList.add(taskIdList.get(i));
            String result = consumptionCost.reqConsumptionCost(sendList, ConstDef.OTHERS_OUT);
            try {
                if (result.toLowerCase().indexOf("success") >= 0) {
                    sql = String.format(
                            "update %s.창고수불 set  SAP_UPDATED=true  WHERE SEQ_ID = '%s';",
                            ConstDef.DATA_BASE, sendList.get(0).get("seqId").toString());
                    storeProcService.directCallSql(sql);
                }
            } catch (Exception e) {
                Log.Trace("기타출고  전송 실패 seqId=%s", sendList.get(0).get("seqId").toString());
            }
        }
        ps.clear();
        ps.put("inoutType", ConstDef.OTHERS_IN);
        taskIdList = storeProcService.select(sendParam);
        Log.Trace("기타입고 SAP 전송 size=%d", taskIdList.size());
        Log.Debug(taskIdList.toString());

        for (int i = 0; i < taskIdList.size(); i++) {
            sendList.clear();
            sendList.add(taskIdList.get(i));
            String iCode = (String) sendList.get(0).get("동종재고코드");
            String pCode = (String) sendList.get(0).get("품번");
            Log.Debug("동종제고생성= %s", iCode);
            if (iCode != null) {
                // call create iCode
                stockCheck(iCode, pCode);
            }
            String result = consumptionCost.reqConsumptionCost(sendList, ConstDef.OTHERS_IN);
            try {
                if (result.toLowerCase().indexOf("success") >= 0) {
                    sql = String.format(
                            "update %s.창고수불 set  SAP_UPDATED=true  WHERE SEQ_ID = '%s';",
                            ConstDef.DATA_BASE, sendList.get(0).get("seqId").toString());
                    storeProcService.directCallSql(sql);
                }
            } catch (Exception e) {
                Log.Trace("기타입고  전송 실패 seqId=%s", sendList.get(0).get("seqId").toString());
            }
        }
    }
    
    public void sendToSapOthersOutByPickingOrder() {
        String sql = String.format(
                "select TYPE_IF as typeIF, NO_SALES as noSales from %s.패킹리스트 where 출고확인=true and SAP_UPDATED=false AND TYPE_IF='%s' GROUP BY TYPE_IF, NO_SALES;",
                ConstDef.DATA_BASE, ConstDef.OTEHERS_PICK);
        List<Map<String, Object>> taskIdList = storeProcService.runSqlSelect(sql);
        Log.Trace("기타 패킹리스트 SAP 전송 size=%d", taskIdList.size());
        Log.Debug(taskIdList.toString());
        if (taskIdList.size() > 0) {
            ConsumptionCost consumptionCost = new ConsumptionCost();
            for (int i = 0; i < taskIdList.size(); i++) {
                JSONObject sendParam = new JSONObject();
                JSONObject ps = new JSONObject();
                ps.put("typeIf", taskIdList.get(i).get("typeIf").toString());
                ps.put("noSales", taskIdList.get(i).get("noSales").toString());
                sendParam.put("proc", "spFindAllPackingResultByTypeIfAndNoSales");
                sendParam.put("db", ConstDef.DATA_BASE);
                sendParam.put("ps", ps);
                List<Map<String, Object>> inList = storeProcService.select(sendParam);
                    
                try {
                    String result = consumptionCost.reqConsumptionCost(inList, ConstDef.OTHERS_OUT);
                    if (result.toLowerCase().indexOf("success") >= 0) {
                        sql = String.format(
                                "update %s.패킹리스트 set  SAP_UPDATED = true, MESSAGE='%s'  where TYPE_IF='%s' AND NO_SALES='%s';",
                                ConstDef.DATA_BASE, result,
                                taskIdList.get(i).get("typeIf").toString(),
                                taskIdList.get(i).get("noSales").toString());
                    } else {
                        sql = String.format("update %s.패킹리스트 set MESSAGE='%s'  where TYPE_IF='%s' AND NO_SALES='%s';",
                                ConstDef.DATA_BASE, result,
                                taskIdList.get(i).get("typeIf").toString(),
                                taskIdList.get(i).get("noSales").toString());
                    }
                    storeProcService.directCallSql(sql);
                } catch (Exception e) {
                    Log.Error(e.getMessage());
                    sql = String.format("update %s.패킹리스트 set MESSAGE='%s' where TYPE_IF='%s' AND NO_SALES = '%s';",
                            ConstDef.DATA_BASE, "Exception 발생",
                            taskIdList.get(i).get("typeIf").toString(),
                            taskIdList.get(i).get("noSales").toString());
                    storeProcService.directCallSql(sql);
                }
            }
        }
    }
    public void sendGoodsMovement() {
        String sql = String.format(
                "select DISTINCT ASSIG_WBL as assigWbl from %s.패킹리스트 where 출고확인=true and SAP_UPDATED=false AND TYPE_IF=%s",
                ConstDef.DATA_BASE,ConstDef.STORE_PICK);
        List<Map<String, Object>> goodsList = storeProcService.runSqlSelect(sql);
        Log.Trace("패킹리스트 SAP 전송 size=%d", goodsList.size());
        Log.Debug(goodsList.toString());
        sql = String.format(
                "SELECT 사이트,장소코드 FROM %s.장소정보 WHERE 물류창고=TRUE ORDER BY SEQ_ID ASC",
                ConstDef.DATA_BASE,ConstDef.STORE_PICK);
        List<Map<String, Object>> siteInfoList = storeProcService.runSqlSelect(sql);
        
        if (goodsList.size() > 0) {
            GoodsMovement goodsMovement = new GoodsMovement();
            for (int i = 0; i < goodsList.size(); i++) {
                if (siteInfoList.size() == 0) {
                    Log.Error("패킹 창고정보 없음");
                    sql = String.format("update %s.패킹리스트 set MESSAGE='%s' where ASSIG_WBL = '%s';",
                            ConstDef.DATA_BASE, "창고정보 없음", goodsList.get(0).get("assigWbl").toString());
                    storeProcService.directCallSql(sql);
                    continue;
                }
                sql = String.format(
                        "SELECT A.* , B.단위 FROM %s.패킹리스트 A LEFT JOIN %s.품목정보 B ON A.CD_ITEM=B.품번 WHERE A.ASSIG_WBL=%s",
                        ConstDef.DATA_BASE,ConstDef.DATA_BASE,goodsList.get(i).get("assigWbl").toString());
                List<Map<String, Object>> assigWblList = storeProcService.runSqlSelect(sql);
                Log.Debug(assigWblList.toString());
                try {
                    String result = goodsMovement.reqGoodsMovement(assigWblList, siteInfoList.get(0));
                    if (result.toLowerCase().indexOf("success") >= 0) {
                        sql = String.format(
                                "update %s.패킹리스트 set  SAP_UPDATED = true, MESSAGE='%s'  where ASSIG_WBL = '%s';",
                                ConstDef.DATA_BASE, result, goodsList.get(i).get("assigWbl").toString());
                    } else {
                        sql = String.format("update %s.패킹리스트 set MESSAGE='%s'  where ASSIG_WBL = '%s';",
                                ConstDef.DATA_BASE, result, goodsList.get(i).get("assigWbl").toString());
                    }
                    storeProcService.directCallSql(sql);
                } catch (Exception e) {
                    Log.Error(e.getMessage());
                    sql = String.format("update %s.패킹리스트 set MESSAGE='%s' where ASSIG_WBL = '%s';",
                            ConstDef.DATA_BASE, "Exception 발생", goodsList.get(i).get("assigWbl").toString());
                    storeProcService.directCallSql(sql);
                }
            }
        }
      

    }

    ManageIdentifiedStocksIn manageIdentifiedStocksIn = null;
    QueryIdentifiedStocksIn queryIdentifiedStocksIn = null;

    // 동종재고ID 생성
    public void stockCheck(String iCode, String pCode) {
        if (iCode.length() == 0)
            return;
        if (manageIdentifiedStocksIn == null) {
            manageIdentifiedStocksIn = new ManageIdentifiedStocksIn();
        }
        String[] lotNoSplit = iCode.split("_");
        String lotNo = "";
        if (lotNo.length() == 2) {
            lotNo = lotNoSplit[1];
        }
        manageIdentifiedStocksIn.reqStockCheck(iCode, pCode, lotNo);
    }

    // 동종재고ID 조회
    public void selectStock() {
        if (manageIdentifiedStocksIn == null) {
            queryIdentifiedStocksIn = new QueryIdentifiedStocksIn();
        }
        queryIdentifiedStocksIn.reqSelectStock(null);
    } 
}
