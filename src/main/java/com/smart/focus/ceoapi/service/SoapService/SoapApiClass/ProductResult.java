package com.smart.focus.ceoapi.service.SoapService.SoapApiClass;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBElement;

import com.smart.focus.ceoapi.common.ConstDef;
import com.smart.focus.ceoapi.common.Log;
import com.smart.focus.ceoapi.wsdl2.product_result.BusinessDocumentBasicMessageHeader;
import com.smart.focus.ceoapi.wsdl2.product_result.BusinessTransactionDocumentID;
import com.smart.focus.ceoapi.wsdl2.product_result.IdentifiedStockID;
import com.smart.focus.ceoapi.wsdl2.product_result.MaterialOutputManageBundleResponse;
import com.smart.focus.ceoapi.wsdl2.product_result.ObjectFactory;
import com.smart.focus.ceoapi.wsdl2.product_result.ProdLotMaintainRequestBundleMaterialSyncV1;
import com.smart.focus.ceoapi.wsdl2.product_result.ProdLotMaintainRequestBundleMessageSyncV1;
import com.smart.focus.ceoapi.wsdl2.product_result.ProductionLotBundleMaintainConfirmationMessageSync;
import com.smart.focus.ceoapi.wsdl2.product_result.ProductionLotBundleMaintainConfirmations;
import com.smart.focus.ceoapi.wsdl2.product_result.ProductionLotManageConfirmationGroup;
import com.smart.focus.ceoapi.wsdl2.product_result.ProductionLotManageReportingPoint;
import com.smart.focus.ceoapi.wsdl2.product_result.ProductionTaskManageResponseMDT;
import com.smart.focus.ceoapi.wsdl2.product_result.Quantity;
import com.smart.focus.ceoapi.wsdl2.product_result.UUID;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@SuppressWarnings({ "unchecked" })
public class ProductResult extends WebServiceGatewaySupport {
    // private final String DEFAULT_URI =
    private String DEFAULT_URI = "https://my358019.sapbydesign.com/sap/bc/srt/scs/sap/manageproductionlotsin?sap-vhost=my358019.sapbydesign.com";
    private String USER = "_BNHSYS";
    private final String PASSWORD = "Welcome2022";
    private final String ACTION_NAMESPACE = "http://sap.com/xi/SAPGlobal20/Global";
    private final String SCAN_PACKAGE = "com.smart.focus.ceoapi.wsdl2.product_result";

    private final String DEFAULT_URI_TEST = "https:// my424816.businessbydesign.cloud.sap/sap/bc/srt/scs/sap/manageproductionlotsin?sap-vhost=my424816.businessbydesign.cloud.sap";
    private final String USER_TEST = "_MESSYS";

    public ProductResult() {
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

    public String reqProductSend(List<Map<String, Object>> inList) {
        /*
         * URL url = new URL(DEFAULT_URI); URLConnection connection =
         * url.openConnection(); HttpURLConnection httpConn = (HttpURLConnection)
         * connection;
         */
        // 아이디 비번 셋팅
        getWebServiceTemplate().setMessageSender(new CredentialSender(USER, PASSWORD));
        ObjectFactory objectFactory = new ObjectFactory();

        // 조회 정보 입력​
        ProdLotMaintainRequestBundleMessageSyncV1 requestMessage = new ProdLotMaintainRequestBundleMessageSyncV1();
        BusinessDocumentBasicMessageHeader mHeader = objectFactory.createBusinessDocumentBasicMessageHeader();
        requestMessage.setBasicMessageHeader(mHeader);

        ProdLotMaintainRequestBundleMaterialSyncV1 productLot = objectFactory
                .createProdLotMaintainRequestBundleMaterialSyncV1();

        BusinessTransactionDocumentID id = objectFactory.createBusinessTransactionDocumentID();
        id.setValue(inList.get(0).get("productionlotid").toString());
        productLot.setProductionLotID(id);

        ProductionLotManageConfirmationGroup cGroup = objectFactory.createProductionLotManageConfirmationGroup();
        UUID gUuid = new UUID();
        gUuid.setValue(inList.get(0).get("confirmationgroupuuid").toString());
        cGroup.setConfirmationGroupUUID(gUuid);

        ProductionTaskManageResponseMDT pMdt = objectFactory.createProductionTaskManageResponseMDT();
        UUID pUuid = new UUID();
        pUuid.setValue(inList.get(0).get("produciontaskuuid").toString());
        pMdt.setProducionTaskUUID(pUuid);
        cGroup.getProductionTask().add(pMdt);
        // 무조건 완료처리 해도 되는지 확인
        // pMdt.setConfirmationCompletedRequiredIndicator(true);

        // Material Output section start
        for (int i = 0; i < inList.size(); i++) {

            MaterialOutputManageBundleResponse mOutput = objectFactory.createMaterialOutputManageBundleResponse();
            if (i == 0) {
                mOutput.setActionCode("02");
                UUID mOUuid = new UUID();
                mOUuid.setValue(inList.get(i).get("materialoutputuuid").toString());
                mOutput.setMaterialOutputUUID(mOUuid);
            } else {
                mOutput.setActionCode("02");
            }

            IdentifiedStockID sOId = objectFactory.createIdentifiedStockID();
            String stockId = (String) inList.get(i).get("동종재고코드");
            Log.Debug("OUT UUID=%s 완제품 입고 동종재고 ID = %s", inList.get(i).get("materialoutputuuid").toString(), stockId);
            if (stockId != null) {
                sOId.setValue(stockId);
                mOutput.setIdentifiedStockID(sOId);
            }

            Quantity oQty = new Quantity();

            Double inputQty = Double.parseDouble(inList.get(i).get("수량").toString());
            // int planQty = Integer.parseInt(inList.get(i).get("계획수량").toString());
            // if(inputQty < planQty ){
            // mOutput.setConfirmationFinished(true);
            // }
            oQty.setValue(BigDecimal.valueOf(inputQty));
            mOutput.setConfirmedQuantity(oQty);

            String location = (String) inList.get(i).get("장소위치코드");
            if (location != null)
                mOutput.setTargetLogisticsAreaID(location.toString());
            if (inList.size() > 1 && i < inList.size() - 1) {
                mOutput.setSplitIndicator(true);
            } else {
                mOutput.setSplitIndicator(false);
            }
            cGroup.getMaterialOutput().add(mOutput);
        }

        // Material Output section end

        ProductionLotManageReportingPoint rPoint = objectFactory.createProductionLotManageReportingPoint();
        UUID rpUuid = new UUID();
        rpUuid.setValue(inList.get(0).get("reportingpointuuid").toString());
        rPoint.setReportingPointUUID(rpUuid);

        Quantity rQty = new Quantity();
        rQty.setValue(BigDecimal.valueOf(0));
        rPoint.setConfirmedQuantity(rQty);
        rPoint.setConfirmedScrap(rQty);

        cGroup.getReportingPoint().add(rPoint);

        productLot.getConfirmationGroup().add(cGroup);

        requestMessage.getProductionLot().add(productLot);

        JAXBElement<ProdLotMaintainRequestBundleMessageSyncV1> req = objectFactory
                .createProductionLotsBundleMaintainRequestSyncV1(requestMessage);

        JAXBElement<ProductionLotBundleMaintainConfirmationMessageSync> res = (JAXBElement<ProductionLotBundleMaintainConfirmationMessageSync>) getWebServiceTemplate()
                .marshalSendAndReceive(req, new SoapActionCallback(ACTION_NAMESPACE));
        // int size = res.getValue().getProductionLotResponse().size();
        // Log.Debug("size=%d", size);
        List<ProductionLotBundleMaintainConfirmations> list = res.getValue().getProductionLotResponse();
        Log.Debug(list.toString());

        int index = 0;
        String resultMsg = "";
        for (ProductionLotBundleMaintainConfirmations item : list) {
            if (index == 0) {
                resultMsg = item.getProductionLotLog().get(0).getNote();
            }
            Log.Debug(">>>>>> 생산전송[%d] , [MESSAGE : %s]", index, resultMsg);
            index++;
        }

        return resultMsg;

    }
}
