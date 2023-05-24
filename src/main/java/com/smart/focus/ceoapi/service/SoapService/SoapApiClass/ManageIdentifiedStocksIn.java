package com.smart.focus.ceoapi.service.SoapService.SoapApiClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.smart.focus.ceoapi.common.ConstDef;
import com.smart.focus.ceoapi.common.Log;
import com.smart.focus.ceoapi.wsdl2.ManageIdentifiedStocksInBNHQA2.BusinessDocumentBasicMessageHeader;
import com.smart.focus.ceoapi.wsdl2.ManageIdentifiedStocksInBNHQA2.IdentifiedStockID;
import com.smart.focus.ceoapi.wsdl2.ManageIdentifiedStocksInBNHQA2.IdentifiedStocksDescriptionRequestBundle;
import com.smart.focus.ceoapi.wsdl2.ManageIdentifiedStocksInBNHQA2.ManageIdentifiedStockRequestMessage;
import com.smart.focus.ceoapi.wsdl2.ManageIdentifiedStocksInBNHQA2.ManageIdentifiedStockResponseMessage;
import com.smart.focus.ceoapi.wsdl2.ManageIdentifiedStocksInBNHQA2.ManageIdentifiedStocksRequest;
import com.smart.focus.ceoapi.wsdl2.ManageIdentifiedStocksInBNHQA2.ManageIdentifiedStocksResponse;
import com.smart.focus.ceoapi.wsdl2.ManageIdentifiedStocksInBNHQA2.ObjectFactory;
import com.smart.focus.ceoapi.wsdl2.ManageIdentifiedStocksInBNHQA2.ProductID;
import com.smart.focus.ceoapi.wsdl2.ManageIdentifiedStocksInBNHQA2.SHORTDescription;

import org.json.simple.JSONObject;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@SuppressWarnings({ "unchecked" })
public class ManageIdentifiedStocksIn extends WebServiceGatewaySupport {
    private String DEFAULT_URI = "https://my429341.businessbydesign.cloud.sap/sap/bc/srt/scs/sap/manageidentifiedstocksin?sap-vhost=my429341.businessbydesign.cloud.sap";
    private String USER = "_MESSYS";
    private final String PASSWORD = "Welcome2022";
    private final String ACTION_NAMESPACE = "http://sap.com/xi/SAPGlobal20/Global";
    private final String SCAN_PACKAGE = "com.smart.focus.ceoapi.wsdl2.ManageIdentifiedStocksInBNHQA2";

    private final String DEFAULT_URI_TEST = "https://my424816.businessbydesign.cloud.sap/sap/bc/srt/scs/sap/manageidentifiedstocksin?sap-vhost=my424816.businessbydesign.cloud.sap";
    private final String USER_TEST = "_MESSYS";

    public ManageIdentifiedStocksIn() {
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

    public JSONObject reqStockCheck(String iCdoe, String pCode, String lotNo) {
        // 아이디 비번 셋팅
        getWebServiceTemplate().setMessageSender(new CredentialSender(USER, PASSWORD));
        ObjectFactory objectFactory = new ObjectFactory();

        // 조회 정보 입력​

        // <glob:IdentifiedStockMaintainRequestMessage>
        ManageIdentifiedStockRequestMessage requestMessage = new ManageIdentifiedStockRequestMessage();
        // <BasicMessageHeader>
        BusinessDocumentBasicMessageHeader bMessage = objectFactory.createBusinessDocumentBasicMessageHeader();
        requestMessage.setBasicMessageHeader(bMessage);
        // <IdentifiedStockMaintainBundle actionCode="01"
        // activateIdentifiedStockIndicator="true" >
        ManageIdentifiedStocksRequest stockBundle = objectFactory.createManageIdentifiedStocksRequest();
        stockBundle.setActionCode("01");
        stockBundle.setActivateIdentifiedStockIndicator(true);

        IdentifiedStockID sId = new IdentifiedStockID();
        sId.setValue(iCdoe);
        stockBundle.setIdentifiedStockID(sId);

        ProductID pid = new ProductID();
        pid.setValue(pCode);
        stockBundle.setProductID(pid);

        String strDate = iCdoe.split("_")[0];

        try {
            strDate = AddDate(strDate, 0, 0, -1);

        } catch (Exception e1) {
            e1.printStackTrace();
        }

        XMLGregorianCalendar xmlGregCal;
        // 고정값 YYYY-MM-DDT14:59:59.1234567Z
        // YYYY-MM-DD -> IdentifiedStockID 999999_A999 -> 앞 6자리 2099-99-99 ->
        // 2099-99-99T15:00:00.1234567Z
        try {
            xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(strDate + "T15:00:00.1234567Z");
        } catch (DatatypeConfigurationException e) {
            xmlGregCal = null;
            e.printStackTrace();
        }
        Log.Debug("==============xmlGregCal====>>" + xmlGregCal.toString());
        stockBundle.setExpirationDateTime(xmlGregCal);

        IdentifiedStocksDescriptionRequestBundle stocksDescriptionRequest = new IdentifiedStocksDescriptionRequestBundle();
        stocksDescriptionRequest.setActionCode("01");

        SHORTDescription description = new SHORTDescription();
        description.setLanguageCode("KO");
        description.setValue(lotNo);

        stocksDescriptionRequest.setDescription(description);

        stockBundle.getDescription().add(stocksDescriptionRequest);

        requestMessage.getIdentifiedStockMaintainBundle().add(stockBundle);

        JAXBElement<ManageIdentifiedStockRequestMessage> req = objectFactory
                .createIdentifiedStockMaintainRequestMessage(requestMessage);

        JAXBElement<ManageIdentifiedStockResponseMessage> res = (JAXBElement<ManageIdentifiedStockResponseMessage>) getWebServiceTemplate()
                .marshalSendAndReceive(req, new SoapActionCallback(ACTION_NAMESPACE));

        // Log.Debug("size=%d", size);
        List<ManageIdentifiedStocksResponse> list = res.getValue().getIdentifiedStockResponse();
        Log.Debug(list.toString());

        int index = 0;
        for (ManageIdentifiedStocksResponse item : list) {
            String result = item.getChangeStateID().toString();
            Log.Debug(">>>>>> getChangeStateID[%d] , [MESSAGE : %s]", index, result);
            String result2 = item.getIdentifiedStockID().getValue();
            Log.Debug(">>>>>> getIdentifiedStockID[%d] , [MESSAGE : %s]", index, result2);
            String result3 = item.getIdentifiedStockUUID().getValue();
            Log.Debug(">>>>>> getIdentifiedStockUUID[%d] , [MESSAGE : %s]", index, result3);

            index++;
        }

        // referenceReq.getOperationActivity().add(activeReq);
        // siteLogi.getReferenceObject().add(referenceReq);
        // requestMessage.getSiteLogisticsTask().add(siteLogi);

        // JAXBElement<ManageIdentifiedStockRequestMessage> req =
        // objectFactory.createSiteLogisticsTaskBundleMaintainRequestSyncV1(requestMessage);

        // JAXBElement<SiteLogisticsTaskBundleMaintainResponseMessageSync> res =
        // (JAXBElement<SiteLogisticsTaskBundleMaintainResponseMessageSync>)
        // getWebServiceTemplate().marshalSendAndReceive(req, new
        // SoapActionCallback(ACTION_NAMESPACE));
        // int size = res.getValue().getSiteLogisticsTaskResponse().size();
        // Log.Debug("size=%d", size);
        // List<SiteLogisticsTaskBundleMaintainResponse> list =
        // res.getValue().getSiteLogisticsTaskResponse();
        // Log.Debug(list.toString());

        // int index = 0;
        // for(SiteLogisticsTaskBundleMaintainResponse item : list){
        // String result =
        // item.getSiteLogisticsTaskLog().get(index).getSiteLogisticsTaskNote().toString();
        // Log.Debug(">>>>>> 입고전송[%d] , [MESSAGE : %s]",index, result);
        // index++;
        // }

        return null;
    }

    private String AddDate(String strDate, int year, int month, int day) throws Exception {
        SimpleDateFormat dtFormat = new SimpleDateFormat("yyyyMMdd");
        Calendar cal = Calendar.getInstance();
        Date dt = dtFormat.parse(strDate);
        cal.setTime(dt);
        cal.add(Calendar.YEAR, year);
        cal.add(Calendar.MONTH, month);
        cal.add(Calendar.DATE, day);
        strDate = dtFormat.format(cal.getTime());

        SimpleDateFormat newDtFormat = new SimpleDateFormat("yyyy-MM-dd");
        // String 타입을 Date 타입으로 변환
        Date formatDate = dtFormat.parse(strDate); // Date타입의 변수를 새롭게 지정한 포맷으로 변환
        String strNewDtFormat = newDtFormat.format(formatDate);
        return strNewDtFormat;
    }

}
