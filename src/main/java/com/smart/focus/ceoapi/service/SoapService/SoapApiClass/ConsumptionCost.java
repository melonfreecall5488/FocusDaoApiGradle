package com.smart.focus.ceoapi.service.SoapService.SoapApiClass;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.smart.focus.ceoapi.common.CommonLib;
import com.smart.focus.ceoapi.common.ConstDef;
import com.smart.focus.ceoapi.common.Log;
import com.smart.focus.ceoapi.wsdl2.consumptionCostCEO.ConsumptionCostCBOCreateConfirmationMessageSync;
import com.smart.focus.ceoapi.wsdl2.consumptionCostCEO.ConsumptionCostCBOCreateRequest;
import com.smart.focus.ceoapi.wsdl2.consumptionCostCEO.ConsumptionCostCBOCreateRequestItem;
import com.smart.focus.ceoapi.wsdl2.consumptionCostCEO.ConsumptionCostCBOCreateRequestMessageSync;
import com.smart.focus.ceoapi.wsdl2.consumptionCostCEO.IdentifiedStockID;
import com.smart.focus.ceoapi.wsdl2.consumptionCostCEO.LocationID;
import com.smart.focus.ceoapi.wsdl2.consumptionCostCEO.LogItem;
import com.smart.focus.ceoapi.wsdl2.consumptionCostCEO.ObjectFactory;
import com.smart.focus.ceoapi.wsdl2.consumptionCostCEO.ProductID;
import com.smart.focus.ceoapi.wsdl2.consumptionCostCEO.Quantity;
import com.smart.focus.ceoapi.wsdl2.consumptionCostCEO.SHORTDescription;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@SuppressWarnings({ "unchecked" })
public class ConsumptionCost extends WebServiceGatewaySupport {
    private String DEFAULT_URI = "https://my358019.sapbydesign.com/sap/bc/srt/scs/sap/querycustomerin1?sap-vhost=my358019.sapbydesign.com";
    private String USER = "_BNHSYS";
    private final String PASSWORD = "Welcome2022";
    private final String ACTION_NAMESPACE = "http://sap.com/xi/SAPGlobal20/Global";
    private final String SCAN_PACKAGE = "com.smart.focus.ceoapi.wsdl2.consumptionCostCEO";

    private final String DEFAULT_URI_TEST = "https://my424816.businessbydesign.cloud.sap/sap/bc/srt/scs/sap/yyhxnc1z4y_consumptioncost?sap-vhost=my424816.businessbydesign.cloud.sap";
    private final String USER_TEST = "_CAS_APISYS"; //

    public ConsumptionCost() {
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

    public String reqConsumptionCost(List<Map<String, Object>> noOrderList, Integer inOutType) {
        /*
         * URL url = new URL(DEFAULT_URI); URLConnection connection =
         * url.openConnection(); HttpURLConnection httpConn = (HttpURLConnection)
         * connection;
         */
        // 아이디 비번 셋팅
        getWebServiceTemplate().setMessageSender(new CredentialSender(USER, PASSWORD));
        ObjectFactory objectFactory = new ObjectFactory();

        ConsumptionCostCBOCreateRequestMessageSync requestMessageSync = new ConsumptionCostCBOCreateRequestMessageSync();
        ConsumptionCostCBOCreateRequest request = new ConsumptionCostCBOCreateRequest();
        LocationID locationID = new LocationID();
        Log.Debug(noOrderList.get(0).toString());
        locationID.setValue(noOrderList.get(0).get("사이트").toString()); // 사이트ID
        request.setSiteID(locationID);

        XMLGregorianCalendar xmlGregCal;
        try {
            xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(CommonLib.getToday("yyyy-MM-dd"));
        } catch (DatatypeConfigurationException e) {
            xmlGregCal = null;
            e.printStackTrace();
        }
        request.setCreateDate(xmlGregCal); // 생성일자
        request.setStatusCD("04"); // 상태코드
        request.setAssortment(inOutType % 2 == 0 ? "6" : "12"); // 6 : 출고 ,  12 : 반품
        request.setReasonCD(String.valueOf(inOutType)); // 발생사유

        /******** START LOOP ********/
        for (int i = 0; i < noOrderList.size(); i++) {
            ConsumptionCostCBOCreateRequestItem item = new ConsumptionCostCBOCreateRequestItem();

            item.setItemID(String.valueOf((i))); // 항번 (ITEM 채번)
            ProductID productID = new ProductID();
            productID.setValue(noOrderList.get(i).get("품번").toString()); // 제품 ID
            item.setProductID(productID);

            SHORTDescription description = new SHORTDescription();
            description.setLanguageCode("ko"); // 속성
            description.setValue(noOrderList.get(i).get("품목명").toString()); // 제품내역
            item.setProductDesc(description);

            IdentifiedStockID stockID = new IdentifiedStockID();
            stockID.setValue(noOrderList.get(i).get("동종재고코드").toString()); // 동종재고 ID
            item.setStockID(stockID);

            item.setExpirationDt(noOrderList.get(i).get("유효일").toString()); // 유효기간
            item.setLogisticsAreaID(noOrderList.get(i).get("창고코드").toString()); // 물류영역 ID

            Quantity quantity = new Quantity();
            quantity.setUnitCode("EA"); // 속성
            quantity.setValue(new BigDecimal(noOrderList.get(i).get("수량").toString())); // 처리수량
            item.setProductQuantity(quantity);

            item.setLotNo(noOrderList.get(i).get("로트번호") == null ? "" : noOrderList.get(i).get("로트번호").toString()); // LOT NO

            request.getItem().add(item);
        }
        /******** END LOOP ********/

        requestMessageSync.setConsumptionCostCBO(request);

        JAXBElement<ConsumptionCostCBOCreateRequestMessageSync> req = objectFactory
                .createConsumptionCostCBOCreateRequestSync(requestMessageSync);

        JAXBElement<ConsumptionCostCBOCreateConfirmationMessageSync> res = (JAXBElement<ConsumptionCostCBOCreateConfirmationMessageSync>) getWebServiceTemplate()
                .marshalSendAndReceive(req, new SoapActionCallback(ACTION_NAMESPACE));
        Log.Debug(res.getValue().getLog().toString());

        List<LogItem> result = res.getValue().getLog().getItem();

        int index = 0;
        String resultMsg = "";
        for (LogItem item : result) {
            if (index == 0) {
                if (!item.getSeverityCode().toString().equals("3")) {
                    resultMsg = "success";
                }
            }
            Log.Debug(">>>>>> 세트구성[%d] , [MESSAGE : %s], TYPE=%d", index, resultMsg, inOutType);
            index++;
        }

        /*
         * RESPONSE END
         * 1 - Success
         * 2 - Warning
         * 3 - Error
         */

        return resultMsg;
    }
    
    public String reqOthersOutByPickingOrder(List<Map<String, Object>> noOrderList, Integer inOutType) {
        /*
         * URL url = new URL(DEFAULT_URI); URLConnection connection =
         * url.openConnection(); HttpURLConnection httpConn = (HttpURLConnection)
         * connection;
         */
        // 아이디 비번 셋팅
        getWebServiceTemplate().setMessageSender(new CredentialSender(USER, PASSWORD));
        ObjectFactory objectFactory = new ObjectFactory();

        ConsumptionCostCBOCreateRequestMessageSync requestMessageSync = new ConsumptionCostCBOCreateRequestMessageSync();
        ConsumptionCostCBOCreateRequest request = new ConsumptionCostCBOCreateRequest();
        LocationID locationID = new LocationID();
        Log.Debug(noOrderList.get(0).toString());
        locationID.setValue(noOrderList.get(0).get("사이트").toString()); // 사이트ID
        request.setSiteID(locationID);

        XMLGregorianCalendar xmlGregCal;
        try {
            xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(CommonLib.getToday("yyyy-MM-dd"));
        } catch (DatatypeConfigurationException e) {
            xmlGregCal = null;
            e.printStackTrace();
        }
        request.setCreateDate(xmlGregCal); // 생성일자
        request.setStatusCD("04"); // 상태코드
        request.setAssortment(inOutType % 2 == 0 ? "6" : "12"); // 6 : 출고 , 12 : 반품
        request.setReasonCD(String.valueOf(inOutType)); // 발생사유

        /******** START LOOP ********/
        for (int i = 0; i < noOrderList.size(); i++) {
            ConsumptionCostCBOCreateRequestItem item = new ConsumptionCostCBOCreateRequestItem();

            item.setItemID(String.valueOf((i))); // 항번 (ITEM 채번)
            ProductID productID = new ProductID();
            productID.setValue(noOrderList.get(i).get("cdITem").toString()); // 제품 ID
            item.setProductID(productID);

            SHORTDescription description = new SHORTDescription();
            description.setLanguageCode("ko"); // 속성
            description.setValue(noOrderList.get(i).get("nmItem").toString()); // 제품내역
            item.setProductDesc(description);

            IdentifiedStockID stockID = new IdentifiedStockID();
            stockID.setValue(noOrderList.get(i).get("cdIdentstock").toString()); // 동종재고 ID
            item.setStockID(stockID);
            String[] split = noOrderList.get(i).get("cdIdentstock").toString().split("_");
            if (split.length == 2) {
                item.setExpirationDt(CommonLib.hyphenYMD(split[0])); // 유효기간
                item.setLotNo(split[1]); // LOT
            } else {
                item.setExpirationDt(""); // 유효기간
                item.setLotNo(""); // LOT
            }
            item.setLogisticsAreaID(noOrderList.get(i).get("장소코드").toString()); // 물류영역 ID

            Quantity quantity = new Quantity();
            quantity.setUnitCode("EA"); // 속성
            quantity.setValue(new BigDecimal(noOrderList.get(i).get("수량").toString())); // 처리수량
            item.setProductQuantity(quantity);

            request.getItem().add(item);
        }
        /******** END LOOP ********/

        requestMessageSync.setConsumptionCostCBO(request);

        JAXBElement<ConsumptionCostCBOCreateRequestMessageSync> req = objectFactory
                .createConsumptionCostCBOCreateRequestSync(requestMessageSync);

        JAXBElement<ConsumptionCostCBOCreateConfirmationMessageSync> res = (JAXBElement<ConsumptionCostCBOCreateConfirmationMessageSync>) getWebServiceTemplate()
                .marshalSendAndReceive(req, new SoapActionCallback(ACTION_NAMESPACE));
        Log.Debug(res.getValue().getLog().toString());

        List<LogItem> result = res.getValue().getLog().getItem();

        int index = 0;
        String resultMsg = "";
        for (LogItem item : result) {
            if (index == 0) {
                if (!item.getSeverityCode().toString().equals("3")) {
                    resultMsg = "success";
                }
            }
            Log.Debug(">>>>>> 세트구성[%d] , [MESSAGE : %s], TYPE=%d", index, resultMsg, inOutType);
            index++;
        }

        /*
         * RESPONSE END
         * 1 - Success
         * 2 - Warning
         * 3 - Error
         */

        return resultMsg;
    }
}
