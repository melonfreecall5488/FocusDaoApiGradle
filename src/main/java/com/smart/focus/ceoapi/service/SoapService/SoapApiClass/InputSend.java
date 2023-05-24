package com.smart.focus.ceoapi.service.SoapService.SoapApiClass;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBElement;

import com.smart.focus.ceoapi.common.ConstDef;
import com.smart.focus.ceoapi.common.Log;
import com.smart.focus.ceoapi.wsdl2.input_send.BusinessDocumentBasicMessageHeader;
import com.smart.focus.ceoapi.wsdl2.input_send.BusinessTransactionDocumentID;
import com.smart.focus.ceoapi.wsdl2.input_send.IdentifiedStockID;
import com.smart.focus.ceoapi.wsdl2.input_send.LogisticsDeviationReasonCode;
import com.smart.focus.ceoapi.wsdl2.input_send.ObjectFactory;
import com.smart.focus.ceoapi.wsdl2.input_send.ProductID;
import com.smart.focus.ceoapi.wsdl2.input_send.Quantity;
import com.smart.focus.ceoapi.wsdl2.input_send.SLTMaterialOutputManageBundleRequest;
import com.smart.focus.ceoapi.wsdl2.input_send.SiteLogisticsLotOperationActivityManageBundleRequest;
import com.smart.focus.ceoapi.wsdl2.input_send.SiteLogisticsTaskBundleMaintainResponse;
import com.smart.focus.ceoapi.wsdl2.input_send.SiteLogisticsTaskBundleMaintainResponseMessageSync;
import com.smart.focus.ceoapi.wsdl2.input_send.SiteLogisticsTaskMaintainBundleRequest;
import com.smart.focus.ceoapi.wsdl2.input_send.SiteLogisticsTaskMaintainRequestBundleMessage;
import com.smart.focus.ceoapi.wsdl2.input_send.SiteLogisticsTaskReferenceObjectManageBundleRequest;
import com.smart.focus.ceoapi.wsdl2.input_send.UUID;

import org.json.simple.JSONObject;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@SuppressWarnings({ "unchecked" })
public class InputSend extends WebServiceGatewaySupport {
    private String DEFAULT_URI = "https://my358019.sapbydesign.com/sap/bc/srt/scs/sap/managesitelogisticstaskin?sap-vhost=my358019.sapbydesign.com";
    private String USER = "_BNHSYS";
    private final String PASSWORD = "Welcome2022";
    private final String ACTION_NAMESPACE = "http://sap.com/xi/SAPGlobal20/Global";
    private final String SCAN_PACKAGE = "com.smart.focus.ceoapi.wsdl2.input_send";

    private final String DEFAULT_URI_TEST = "https://my424816.businessbydesign.cloud.sap/sap/bc/srt/scs/sap/managesitelogisticstaskin?sap-vhost=my424816.businessbydesign.cloud.sap";
    private final String USER_TEST = "_MESSYS";

    public InputSend() {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setPackagesToScan(SCAN_PACKAGE);

        if (ConstDef.TEST_BED) {
            this.DEFAULT_URI = this.DEFAULT_URI_TEST;
            this.USER = this.USER_TEST;
        }
        super.setDefaultUri(DEFAULT_URI);
        super.setMarshaller(jaxb2Marshaller);
        super.setUnmarshaller(jaxb2Marshaller);
    }

    public String reqInputSend(List<Map<String, Object>> param) throws Exception {
        // 아이디 비번 셋팅
        getWebServiceTemplate().setMessageSender(new CredentialSender(USER, PASSWORD));
        ObjectFactory objectFactory = new ObjectFactory();

        // 조회 정보 입력​
        SiteLogisticsTaskMaintainRequestBundleMessage requestMessage = new SiteLogisticsTaskMaintainRequestBundleMessage();
        BusinessDocumentBasicMessageHeader bMessage = objectFactory.createBusinessDocumentBasicMessageHeader();
        requestMessage.setBasicMessageHeader(bMessage);
        SiteLogisticsTaskMaintainBundleRequest siteLogi = new SiteLogisticsTaskMaintainBundleRequest();
        // SiteLogisticsTaskMaintainRequestBundleMessage

        BusinessTransactionDocumentID taskId = objectFactory.createBusinessTransactionDocumentID();
        taskId.setValue(param.get(0).get("sitelogisticstaskid").toString());
        siteLogi.setSiteLogisticTaskID(taskId);

        SiteLogisticsTaskReferenceObjectManageBundleRequest referenceReq = objectFactory
                .createSiteLogisticsTaskReferenceObjectManageBundleRequest();

        SiteLogisticsLotOperationActivityManageBundleRequest activeReq = objectFactory
                .createSiteLogisticsLotOperationActivityManageBundleRequest();
        UUID aUid = new UUID();
        aUid.setValue(param.get(0).get("operationactivityuuid").toString());
        activeReq.setOperationActivityUUID(aUid);
        Double toTalInputQty = 0.0;
        for (int i = 0; i < param.size(); i++) {
            SLTMaterialOutputManageBundleRequest outReq = objectFactory.createSLTMaterialOutputManageBundleRequest();
            if (param.get(i).get("동종재고코드") != null) {
                IdentifiedStockID sId = new IdentifiedStockID();
                sId.setValue(param.get(i).get("동종재고코드").toString());
                outReq.setIdentifiedStockID(sId);
            }
            if(i == 0){ 
                // 분할의 경우 최상위 output에서만 matrialoutpuuuid 값을 세팅해주면된다. 
                UUID mUid = new UUID();
                mUid.setValue(param.get(i).get("matrialoutpuuuid").toString());
                outReq.setMaterialOutputUUID(mUid);
            }
            ProductID pid = new ProductID();
            pid.setValue(param.get(i).get("품번").toString()); // 품번
            outReq.setProductID(pid);

            outReq.setTargetLogisticsAreaID(param.get(i).get("장소위치코드").toString());
            Quantity qty = new Quantity();
            Double orderQty = Double.parseDouble(param.get(i).get("오더수량").toString());
            Double inputQty = Double.parseDouble(param.get(i).get("수량").toString());
            toTalInputQty += inputQty;
            if (i == param.size() -1) {
                if (toTalInputQty < orderQty) {
                    LogisticsDeviationReasonCode rCode = new LogisticsDeviationReasonCode();
                    rCode.setValue("011");
                    outReq.setLogisticsDeviationReasonCode(rCode);
                }
            }
            if (i == 0 && param.size() > 1) {
                outReq.setSplitIndicator(true);
            }
            qty.setValue(BigDecimal.valueOf(inputQty));
            outReq.setActualQuantity(qty);
            outReq.getActualQuantity().setUnitCode("EA");
            activeReq.getMaterialOutput().add(outReq);
        }

        referenceReq.getOperationActivity().add(activeReq);
        siteLogi.getReferenceObject().add(referenceReq);
        requestMessage.getSiteLogisticsTask().add(siteLogi);

        JAXBElement<SiteLogisticsTaskMaintainRequestBundleMessage> req = objectFactory
                .createSiteLogisticsTaskBundleMaintainRequestSyncV1(requestMessage);

        JAXBElement<SiteLogisticsTaskBundleMaintainResponseMessageSync> res = (JAXBElement<SiteLogisticsTaskBundleMaintainResponseMessageSync>) getWebServiceTemplate()
                .marshalSendAndReceive(req, new SoapActionCallback(ACTION_NAMESPACE));
        int size = res.getValue().getSiteLogisticsTaskResponse().size();
        Log.Debug("size=%d", size);
        List<SiteLogisticsTaskBundleMaintainResponse> list = res.getValue().getSiteLogisticsTaskResponse();
        Log.Debug(list.toString());

        int index = 0;
        String resultMsg = "";
        String taskSeverityCode = "";
        int taskNoteLastIndex = 0;
        for (SiteLogisticsTaskBundleMaintainResponse item : list) {
            taskNoteLastIndex = item.getSiteLogisticsTaskLog().size() -1;
            resultMsg = item.getSiteLogisticsTaskLog().get(taskNoteLastIndex).getSiteLogisticsTaskNote().toString();
            taskSeverityCode = item.getSiteLogisticsTaskLog().get(taskNoteLastIndex).getSiteLogisticsTaskSeverityCode().toString();
            Log.Debug(">>>>>> 입고전송 [index : %s ] , Res size [%d] , [MESSAGE : %s] , [TaskSeverityCode : %s]",index, list.size(), resultMsg, taskSeverityCode);
            index++;
        }

        return resultMsg;
    }

    public String reqInputSendReturn(List<Map<String, Object>> param) throws Exception {
        // 아이디 비번 셋팅
        getWebServiceTemplate().setMessageSender(new CredentialSender(USER, PASSWORD));
        ObjectFactory objectFactory = new ObjectFactory();

        // 조회 정보 입력​
        SiteLogisticsTaskMaintainRequestBundleMessage requestMessage = new SiteLogisticsTaskMaintainRequestBundleMessage();
        BusinessDocumentBasicMessageHeader bMessage = objectFactory.createBusinessDocumentBasicMessageHeader();
        requestMessage.setBasicMessageHeader(bMessage);
        SiteLogisticsTaskMaintainBundleRequest siteLogi = new SiteLogisticsTaskMaintainBundleRequest();
        // SiteLogisticsTaskMaintainRequestBundleMessage

        BusinessTransactionDocumentID taskId = objectFactory.createBusinessTransactionDocumentID();
        taskId.setValue(param.get(0).get("sitelogisticstaskid").toString());
        siteLogi.setSiteLogisticTaskID(taskId);

        SiteLogisticsTaskReferenceObjectManageBundleRequest referenceReq = objectFactory
                .createSiteLogisticsTaskReferenceObjectManageBundleRequest();

        SiteLogisticsLotOperationActivityManageBundleRequest activeReq = objectFactory
                .createSiteLogisticsLotOperationActivityManageBundleRequest();
        UUID aUid = new UUID();
        aUid.setValue(param.get(0).get("sitelogisticslotoperationactivityuuid").toString());
        activeReq.setOperationActivityUUID(aUid);
        for (int i = 0; i < param.size(); i++) {
            SLTMaterialOutputManageBundleRequest outReq = objectFactory.createSLTMaterialOutputManageBundleRequest();
            if (param.get(i).get("identifiedstockid") != null) {
                IdentifiedStockID sId = new IdentifiedStockID();
                sId.setValue(param.get(i).get("identifiedstockid").toString());
                outReq.setIdentifiedStockID(sId);
            }

            UUID mUid = new UUID();
            mUid.setValue(param.get(i).get("sitelogisticslotmaterialoutputuuid").toString()); // operationActivityUuid
            outReq.setMaterialOutputUUID(mUid);
            ProductID pid = new ProductID();
            pid.setValue(param.get(i).get("productid").toString()); // 품번
            outReq.setProductID(pid);

            String location = (String) param.get(i).get("targetlogisticsareaid");
            outReq.setTargetLogisticsAreaID(location == null ? "" : location.toString());
            Quantity qty = new Quantity();
            Double orderQty = Double.parseDouble(param.get(i).get("planquantity").toString());
            Double inputQty = Double.parseDouble(param.get(i).get("openquantity").toString());
            if (inputQty < orderQty) {
                    LogisticsDeviationReasonCode rCode = new LogisticsDeviationReasonCode();
                    rCode.setValue("011");
                    outReq.setLogisticsDeviationReasonCode(rCode);
            }
            qty.setValue(BigDecimal.valueOf(inputQty));
            outReq.setActualQuantity(qty);
            outReq.getActualQuantity().setUnitCode("EA");
            activeReq.getMaterialOutput().add(outReq);
        }

        referenceReq.getOperationActivity().add(activeReq);
        siteLogi.getReferenceObject().add(referenceReq);
        requestMessage.getSiteLogisticsTask().add(siteLogi);

        JAXBElement<SiteLogisticsTaskMaintainRequestBundleMessage> req = objectFactory
                .createSiteLogisticsTaskBundleMaintainRequestSyncV1(requestMessage);

        JAXBElement<SiteLogisticsTaskBundleMaintainResponseMessageSync> res = (JAXBElement<SiteLogisticsTaskBundleMaintainResponseMessageSync>) getWebServiceTemplate()
                .marshalSendAndReceive(req, new SoapActionCallback(ACTION_NAMESPACE));
        int size = res.getValue().getSiteLogisticsTaskResponse().size();
        Log.Debug("size=%d", size);
        List<SiteLogisticsTaskBundleMaintainResponse> list = res.getValue().getSiteLogisticsTaskResponse();
        Log.Debug(list.toString());

        int index = 0;
        String resultMsg = "";
        for (SiteLogisticsTaskBundleMaintainResponse item : list) {
            if (index == 0) {
                resultMsg = item.getSiteLogisticsTaskLog().get(index).getSiteLogisticsTaskNote().toString();
            }
            Log.Debug(">>>>>> 반품전송[%d] , [MESSAGE : %s]", index, resultMsg);
            index++;
        }

        return resultMsg;
    }

    public JSONObject reqInputSendOld(Map<String, Object> param) {
        // 아이디 비번 셋팅
        getWebServiceTemplate().setMessageSender(new CredentialSender(USER, PASSWORD));
        ObjectFactory objectFactory = new ObjectFactory();

        // 조회 정보 입력​
        SiteLogisticsTaskMaintainRequestBundleMessage requestMessage = new SiteLogisticsTaskMaintainRequestBundleMessage();
        BusinessDocumentBasicMessageHeader bMessage = objectFactory.createBusinessDocumentBasicMessageHeader();
        requestMessage.setBasicMessageHeader(bMessage);
        SiteLogisticsTaskMaintainBundleRequest siteLogi = new SiteLogisticsTaskMaintainBundleRequest();
        // SiteLogisticsTaskMaintainRequestBundleMessage

        BusinessTransactionDocumentID taskId = objectFactory.createBusinessTransactionDocumentID();
        taskId.setValue(param.get("siteLogisticsTaskId").toString());
        siteLogi.setSiteLogisticTaskID(taskId);

        SiteLogisticsTaskReferenceObjectManageBundleRequest referenceReq = objectFactory
                .createSiteLogisticsTaskReferenceObjectManageBundleRequest();

        SiteLogisticsLotOperationActivityManageBundleRequest activeReq = objectFactory
                .createSiteLogisticsLotOperationActivityManageBundleRequest();
        UUID aUid = new UUID();
        aUid.setValue(param.get("operationActivityUuid").toString());
        activeReq.setOperationActivityUUID(aUid);

        SLTMaterialOutputManageBundleRequest outReq = objectFactory.createSLTMaterialOutputManageBundleRequest();
        UUID mUid = new UUID();
        mUid.setValue(param.get("발주번호").toString()); // operationActivityUuid
        outReq.setMaterialOutputUUID(mUid);
        ProductID pid = new ProductID();
        pid.setValue(param.get("품번").toString()); // 품번
        outReq.setProductID(pid);

        // outReq.setTargetLogisticsAreaID(param.get(i).get("sourceLogisticsAreaId")==null?null:param.get(i).get("sourceLogisticsAreaId").toString());
        // // sourceLogisticsAreaId
        outReq.setTargetLogisticsAreaID(param.get("sourceLogisticsAreaId").toString());
        Quantity qty = new Quantity();
        qty.setValue(BigDecimal.valueOf(Integer.parseInt(param.get("오더수량").toString())));
        outReq.getActualQuantity().setUnitCode("EA");
        outReq.setActualQuantity(qty);

        activeReq.getMaterialOutput().add(outReq);

        referenceReq.getOperationActivity().add(activeReq);
        siteLogi.getReferenceObject().add(referenceReq);
        requestMessage.getSiteLogisticsTask().add(siteLogi);

        JAXBElement<SiteLogisticsTaskMaintainRequestBundleMessage> req = objectFactory
                .createSiteLogisticsTaskBundleMaintainRequestSyncV1(requestMessage);

        JAXBElement<SiteLogisticsTaskBundleMaintainResponseMessageSync> res = (JAXBElement<SiteLogisticsTaskBundleMaintainResponseMessageSync>) getWebServiceTemplate()
                .marshalSendAndReceive(req, new SoapActionCallback(ACTION_NAMESPACE));
        int size = res.getValue().getSiteLogisticsTaskResponse().size();
        Log.Debug("size=%d", size);
        List<SiteLogisticsTaskBundleMaintainResponse> list = res.getValue().getSiteLogisticsTaskResponse();
        Log.Debug(list.toString());

        int index = 0;
        for (SiteLogisticsTaskBundleMaintainResponse item : list) {
            String result = item.getSiteLogisticsTaskLog().get(index).getSiteLogisticsTaskNote().toString();
            Log.Debug(">>>>>> 입고전송[%d] , [MESSAGE : %s]", index, result);
            index++;
        }

        return null;
    }
}
