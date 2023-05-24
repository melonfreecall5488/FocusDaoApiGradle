package com.smart.focus.ceoapi.service.SoapService.SoapApiClass;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBElement;

import com.smart.focus.ceoapi.common.ConstDef;
import com.smart.focus.ceoapi.common.Log;
import com.smart.focus.ceoapi.service.SpProcServiceImpl;
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
import com.smart.focus.ceoapi.wsdl2.input_send.SiteLogisticsTaskMaterialInputManageBundleRequest;
import com.smart.focus.ceoapi.wsdl2.input_send.SiteLogisticsTaskReferenceObjectManageBundleRequest;
import com.smart.focus.ceoapi.wsdl2.input_send.UUID;

import org.json.simple.JSONObject;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@SuppressWarnings({ "unchecked" })
public class OutputSend extends WebServiceGatewaySupport {

      private SpProcServiceImpl storeProcService;

      private String DEFAULT_URI = "https://my358019.sapbydesign.com/sap/bc/srt/scs/sap/managesitelogisticstaskin?sap-vhost=my358019.sapbydesign.com";
      private String USER = "_BNHSYS";
      private final String PASSWORD = "Welcome2022";
      private final String ACTION_NAMESPACE = "http://sap.com/xi/SAPGlobal20/Global";
      private final String SCAN_PACKAGE = "com.smart.focus.ceoapi.wsdl2.input_send";

      private final String DEFAULT_URI_TEST = "https://my424816.businessbydesign.cloud.sap/sap/bc/srt/scs/sap/managesitelogisticstaskin?sap-vhost=my424816.businessbydesign.cloud.sap";
      private final String USER_TEST = "_MESSYS";

      public OutputSend(SpProcServiceImpl storeProcService) {
            this.storeProcService = storeProcService;
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

      // opType 21 번
      public JSONObject reqOutputSendOld(Map<String, Object> inputList, Map<String, Object> outputList) {
            // 아이디 비번 셋팅
            getWebServiceTemplate().setMessageSender(new CredentialSender(USER, PASSWORD));
            ObjectFactory objectFactory = new ObjectFactory();

            // 조회 정보 입력​
            SiteLogisticsTaskMaintainRequestBundleMessage requestMessage = new SiteLogisticsTaskMaintainRequestBundleMessage();

            BusinessDocumentBasicMessageHeader bMessage = objectFactory.createBusinessDocumentBasicMessageHeader();
            requestMessage.setBasicMessageHeader(bMessage);

            SiteLogisticsTaskMaintainBundleRequest request = new SiteLogisticsTaskMaintainBundleRequest();
            // SiteLogisticsTaskMaintainRequestBundleMessage

            BusinessTransactionDocumentID taskId = objectFactory.createBusinessTransactionDocumentID();
            // taskId.setValue("209");
            taskId.setValue(inputList.get("siteLogisticsTaskId").toString());
            request.setSiteLogisticTaskID(taskId);

            SiteLogisticsTaskReferenceObjectManageBundleRequest referenceReq = objectFactory
                        .createSiteLogisticsTaskReferenceObjectManageBundleRequest();

            SiteLogisticsLotOperationActivityManageBundleRequest activeReq = objectFactory
                        .createSiteLogisticsLotOperationActivityManageBundleRequest();
            UUID aUid = new UUID();
            // aUid.setValue("00163ea9-7738-1eec-8bfc-ada684e8f37b");
            aUid.setValue(outputList.get("operationActivityUuid").toString());
            activeReq.setOperationActivityUUID(aUid);

            SiteLogisticsTaskMaterialInputManageBundleRequest inReq = objectFactory
                        .createSiteLogisticsTaskMaterialInputManageBundleRequest();
            UUID inUid = new UUID();
            // inUid.setValue("00163ea9-7738-1edc-8b96-5696651f22ca");
            inUid.setValue(inputList.get("발주번호").toString());
            inReq.setMaterialInputUUID(inUid);
            inReq.setSourceLogisticsAreaID(inputList.get("sourceLogisticsAreaId").toString());
            // inReq.setSplitIndicator(true);

            activeReq.getMaterialInput().add(inReq);

            SLTMaterialOutputManageBundleRequest outReq = objectFactory
                        .createSLTMaterialOutputManageBundleRequest();
            UUID mUid = new UUID();
            // mUid.setValue("00163ea9-7738-1edc-8b96-5696651f42ca");
            mUid.setValue(outputList.get("발주번호").toString());
            outReq.setMaterialOutputUUID(mUid);
            ProductID pid = new ProductID();
            // pid.setValue("303430609039-207");
            pid.setValue(outputList.get("품번").toString());
            outReq.setProductID(pid);

            // outReq.setTargetLogisticsAreaID("100-10-ZZ");

            Quantity qty = new Quantity();
            qty.setValue(BigDecimal.valueOf(Double.parseDouble(outputList.get("오더수량").toString())));
            qty.setUnitCode("EA");
            outReq.setActualQuantity(qty);

            IdentifiedStockID stockId = new IdentifiedStockID();
            stockId.setValue("value");
            outReq.setIdentifiedStockID(null);

            activeReq.getMaterialOutput().add(outReq);

            referenceReq.getOperationActivity().add(activeReq);
            request.getReferenceObject().add(referenceReq);

            requestMessage.getSiteLogisticsTask().add(request);

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
                  Log.Debug(">>>>>> 츨고전송[%d] , [MESSAGE : %s]", index, result);
                  index++;
            }

            return null;
      }

      public String reqOutputSendOld2(List<Map<String, Object>> packingList) {
            // 아이디 비번 셋팅
            getWebServiceTemplate().setMessageSender(new CredentialSender(USER, PASSWORD));
            ObjectFactory objectFactory = new ObjectFactory();

            // 조회 정보 입력​
            SiteLogisticsTaskMaintainRequestBundleMessage requestMessage = new SiteLogisticsTaskMaintainRequestBundleMessage();

            BusinessDocumentBasicMessageHeader bMessage = objectFactory.createBusinessDocumentBasicMessageHeader();
            requestMessage.setBasicMessageHeader(bMessage);

            SiteLogisticsTaskMaintainBundleRequest request = new SiteLogisticsTaskMaintainBundleRequest();
            // SiteLogisticsTaskMaintainRequestBundleMessage

            BusinessTransactionDocumentID taskId = objectFactory.createBusinessTransactionDocumentID();
            // taskId.setValue("209");
            taskId.setValue(packingList.get(0).get("taskId").toString());
            request.setSiteLogisticTaskID(taskId);

            SiteLogisticsTaskReferenceObjectManageBundleRequest referenceReq = objectFactory
                        .createSiteLogisticsTaskReferenceObjectManageBundleRequest();

            SiteLogisticsLotOperationActivityManageBundleRequest activeReq = objectFactory
                        .createSiteLogisticsLotOperationActivityManageBundleRequest();
            UUID aUid = new UUID();
            // aUid.setValue("00163ea9-7738-1eec-8bfc-ada684e8f37b");
            aUid.setValue(packingList.get(0).get("activityUuid").toString());
            activeReq.setOperationActivityUUID(aUid);

            for (int i = 0; i < packingList.size(); i++) {

                  String sql = String.format(
                              "select 동종재고코드, sum(수량) as qty, 장소위치코드 from %s.창고수불 where 발주번호 = '%s' group by 장소위치코드, 동종재고코드;",
                              ConstDef.DATA_BASE,
                              packingList.get(i).get("outUuid").toString());
                  Log.Debug(sql);
                  List<Map<String, Object>> outList = storeProcService.runSqlSelect(sql);
                  for (int j = 0; j < outList.size(); j++) {
                        if (j == 0) {
                              SiteLogisticsTaskMaterialInputManageBundleRequest inReq = objectFactory
                                          .createSiteLogisticsTaskMaterialInputManageBundleRequest();
                              UUID inUid = new UUID();
                              inUid.setValue(packingList.get(i).get("inUuid").toString());
                              inReq.setMaterialInputUUID(inUid);
                              // inReq.setSourceLogisticsAreaID(packingList.get(i).get("sourceArea").toString());
                              // // 100-10-F-01
                              String temp = (String) outList.get(j).get("장소위치코드");
                              inReq.setSourceLogisticsAreaID(temp == null ? "100-10-F-01" : temp.toString());
                              activeReq.getMaterialInput().add(inReq);
                        }
                        // splitIndicator 추가 21.11.12
                        SLTMaterialOutputManageBundleRequest outReq = objectFactory
                                    .createSLTMaterialOutputManageBundleRequest();

                        UUID mUid = new UUID();
                        mUid.setValue(packingList.get(i).get("outUuid").toString());
                        if (j == 0) {
                              outReq.setMaterialOutputUUID(mUid);
                        }
                        ProductID pid = new ProductID();
                        pid.setValue(packingList.get(i).get("품번").toString());
                        outReq.setProductID(pid);

                        Quantity qty = new Quantity();
                        qty.setValue(BigDecimal
                                    .valueOf(Double.parseDouble(outList.get(j).get("qty").toString())));
                        qty.setUnitCode("EA");
                        outReq.setActualQuantity(qty);

                        IdentifiedStockID stockId = new IdentifiedStockID();
                        String iStockId = (String) outList.get(j).get("동종재고코드");
                        if (iStockId != null) {
                              stockId.setValue(iStockId == null ? "" : iStockId.toString());
                              outReq.setIdentifiedStockID(stockId);
                        }
                        if (outList.size() > 1 && j < outList.size() - 1) {
                              outReq.setSplitIndicator(true);
                        }
                        if (outList.size() > 1) {
                              String temp = (String) outList.get(j).get("장소위치코드");
                              outReq.setSourceLogisticsAreaIDPostSplit(temp == null ? "100-10-F-01" : temp.toString());
                        }
                        activeReq.getMaterialOutput().add(outReq);
                  }
            }

            referenceReq.getOperationActivity().add(activeReq);
            request.getReferenceObject().add(referenceReq);

            requestMessage.getSiteLogisticsTask().add(request);

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
                        resultMsg = item.getSiteLogisticsTaskLog().get(index).getSiteLogisticsTaskNote()
                                    .toString();
                  }
                  Log.Debug(">>>>>> 츨고전송[%d] , [MESSAGE : %s]", index, resultMsg);
                  index++;
            }

            return resultMsg;
      }


      public String reqOutputSend(List<Map<String, Object>> returnList) {
            // 아이디 비번 셋팅
            getWebServiceTemplate().setMessageSender(new CredentialSender(USER, PASSWORD));
            ObjectFactory objectFactory = new ObjectFactory();

            // 조회 정보 입력​
            SiteLogisticsTaskMaintainRequestBundleMessage requestMessage = new SiteLogisticsTaskMaintainRequestBundleMessage();
            BusinessDocumentBasicMessageHeader bMessage = objectFactory.createBusinessDocumentBasicMessageHeader();
            requestMessage.setBasicMessageHeader(bMessage);

            SiteLogisticsTaskMaintainBundleRequest request = new SiteLogisticsTaskMaintainBundleRequest();

            BusinessTransactionDocumentID taskId = objectFactory.createBusinessTransactionDocumentID();
            
            taskId.setValue(returnList.get(0).get("sitelogisticstaskid").toString());
            request.setSiteLogisticTaskID(taskId);

            SiteLogisticsTaskReferenceObjectManageBundleRequest referenceReq = objectFactory
                        .createSiteLogisticsTaskReferenceObjectManageBundleRequest();

            SiteLogisticsLotOperationActivityManageBundleRequest activeReq = objectFactory
                        .createSiteLogisticsLotOperationActivityManageBundleRequest();
            UUID aUid = new UUID();

            aUid.setValue(returnList.get(0).get("operationactivityuuid").toString());
            activeReq.setOperationActivityUUID(aUid);
            Double toTalInputQty = 0.0;
            for (int i = 0; i < returnList.size(); i++) {
                  SiteLogisticsTaskMaterialInputManageBundleRequest inReq = objectFactory
                                          .createSiteLogisticsTaskMaterialInputManageBundleRequest();
                  UUID inUid = new UUID();
                  inUid.setValue(returnList.get(i).get("matrialinputuuid").toString());
                  inReq.setMaterialInputUUID(inUid);
                  inReq.setSourceLogisticsAreaID(returnList.get(i).get("장소위치코드").toString());
                  activeReq.getMaterialInput().add(inReq);
                  
                  SLTMaterialOutputManageBundleRequest outReq = objectFactory
                              .createSLTMaterialOutputManageBundleRequest();

                  UUID mUid = new UUID();
                  mUid.setValue(returnList.get(i).get("matrialoutpuuuid").toString());
                  outReq.setMaterialOutputUUID(mUid);
                  ProductID pid = new ProductID();
                  pid.setValue(returnList.get(i).get("품번").toString());
                  outReq.setProductID(pid);

                  Quantity qty = new Quantity();
                  Double orderQty = Double.parseDouble(returnList.get(i).get("오더수량").toString());
                  Double inputQty = Double.parseDouble(returnList.get(i).get("수량").toString());
                  qty.setValue(BigDecimal
                              .valueOf(inputQty));
                  qty.setUnitCode("EA");
                  outReq.setActualQuantity(qty);
                  toTalInputQty += inputQty;
                  if (returnList.get(i).get("동종재고코드") != null) {
                        IdentifiedStockID sId = new IdentifiedStockID();
                        sId.setValue(returnList.get(i).get("동종재고코드").toString());
                        outReq.setIdentifiedStockID(sId);
                  }
                  if (i == returnList.size() -1) {
                        if (toTalInputQty < orderQty) {
                            LogisticsDeviationReasonCode rCode = new LogisticsDeviationReasonCode();
                            rCode.setValue("011");
                            outReq.setLogisticsDeviationReasonCode(rCode);
                        }
                    }
                  if (i == 0 && returnList.size() > 1) {
                        outReq.setSplitIndicator(true);
                  }
                  activeReq.getMaterialOutput().add(outReq);

            }

            referenceReq.getOperationActivity().add(activeReq);
            request.getReferenceObject().add(referenceReq);

            requestMessage.getSiteLogisticsTask().add(request);

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
                        resultMsg = item.getSiteLogisticsTaskLog().get(index).getSiteLogisticsTaskNote()
                                    .toString();
                  }
                  Log.Debug(">>>>>> 츨고전송[%d] , [MESSAGE : %s]", index, resultMsg);
                  index++;
            }

            return resultMsg;
      }

      public String reqOutputSendPost(List<Map<String, Object>> packingList) {
            // 아이디 비번 셋팅
            getWebServiceTemplate().setMessageSender(new CredentialSender(USER, PASSWORD));
            ObjectFactory objectFactory = new ObjectFactory();

            // 조회 정보 입력​
            SiteLogisticsTaskMaintainRequestBundleMessage requestMessage = new SiteLogisticsTaskMaintainRequestBundleMessage();

            BusinessDocumentBasicMessageHeader bMessage = objectFactory.createBusinessDocumentBasicMessageHeader();
            requestMessage.setBasicMessageHeader(bMessage);

            SiteLogisticsTaskMaintainBundleRequest request = new SiteLogisticsTaskMaintainBundleRequest();
            // SiteLogisticsTaskMaintainRequestBundleMessage

            BusinessTransactionDocumentID taskId = objectFactory.createBusinessTransactionDocumentID();
            // taskId.setValue("209");
            taskId.setValue(packingList.get(0).get("taskId").toString());
            request.setSiteLogisticTaskID(taskId);

            SiteLogisticsTaskReferenceObjectManageBundleRequest referenceReq = objectFactory
                        .createSiteLogisticsTaskReferenceObjectManageBundleRequest();

            SiteLogisticsLotOperationActivityManageBundleRequest activeReq = objectFactory
                        .createSiteLogisticsLotOperationActivityManageBundleRequest();
            UUID aUid = new UUID();
            // aUid.setValue("00163ea9-7738-1eec-8bfc-ada684e8f37b");
            aUid.setValue(packingList.get(0).get("activityUuid").toString());
            activeReq.setOperationActivityUUID(aUid);

            for (int i = 0; i < packingList.size(); i++) {
                  SiteLogisticsTaskMaterialInputManageBundleRequest inReq = objectFactory
                              .createSiteLogisticsTaskMaterialInputManageBundleRequest();
                  UUID inUid = new UUID();
                  inUid.setValue(packingList.get(i).get("inUuid").toString());
                  inReq.setMaterialInputUUID(inUid);
                  // inReq.setSourceLogisticsAreaID(packingList.get(i).get("sourceArea").toString());
                  inReq.setSourceLogisticsAreaID("100-10-F-01");
                  activeReq.getMaterialInput().add(inReq);

                  SLTMaterialOutputManageBundleRequest outReq = objectFactory
                              .createSLTMaterialOutputManageBundleRequest();
                  UUID mUid = new UUID();
                  mUid.setValue(packingList.get(i).get("outUuid").toString());
                  outReq.setMaterialOutputUUID(mUid);
                  ProductID pid = new ProductID();
                  pid.setValue(packingList.get(i).get("품번").toString());
                  outReq.setProductID(pid);
                  Quantity qty = new Quantity();
                  Double packingQty = Double.parseDouble(packingList.get(i).get("수량").toString());
                  qty.setValue(BigDecimal.valueOf(packingQty));
                  qty.setUnitCode("EA");
                  outReq.setActualQuantity(qty);
                  IdentifiedStockID stockId = new IdentifiedStockID();
                  String iStockId = (String) packingList.get(i).get("cdIdentstock");
                  Log.Debug("cdIdentstock = %s", iStockId);
                  if (iStockId != null) {
                        stockId.setValue(iStockId == null ? "" : iStockId.toString());
                        outReq.setIdentifiedStockID(stockId);
                  }
                  activeReq.getMaterialOutput().add(outReq);

            }

            referenceReq.getOperationActivity().add(activeReq);
            request.getReferenceObject().add(referenceReq);

            requestMessage.getSiteLogisticsTask().add(request);

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
                        resultMsg = item.getSiteLogisticsTaskLog().get(index).getSiteLogisticsTaskNote()
                                    .toString();
                  }
                  Log.Debug(">>>>>> 츨고전송[%d] , [MESSAGE : %s]", index, resultMsg);
                  index++;
            }

            return resultMsg;
      }
}
