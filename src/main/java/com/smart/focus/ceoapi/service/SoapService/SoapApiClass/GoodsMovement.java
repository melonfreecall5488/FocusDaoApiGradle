package com.smart.focus.ceoapi.service.SoapService.SoapApiClass;



import com.smart.focus.ceoapi.common.CommonLib;
import com.smart.focus.ceoapi.common.ConstDef;
import com.smart.focus.ceoapi.common.Log;
import com.smart.focus.ceoapi.wsdl2.goodsMovementCEO.GoodsMovementCBOCreateConfirmationMessageSync;
import com.smart.focus.ceoapi.wsdl2.goodsMovementCEO.GoodsMovementCBOCreateRequest;
import com.smart.focus.ceoapi.wsdl2.goodsMovementCEO.GoodsMovementCBOCreateRequestItem;
import com.smart.focus.ceoapi.wsdl2.goodsMovementCEO.GoodsMovementCBOCreateRequestMessageSync;
import com.smart.focus.ceoapi.wsdl2.goodsMovementCEO.IdentifiedStockID;
import com.smart.focus.ceoapi.wsdl2.goodsMovementCEO.LocationID;
import com.smart.focus.ceoapi.wsdl2.goodsMovementCEO.LogItem;
import com.smart.focus.ceoapi.wsdl2.goodsMovementCEO.ObjectFactory;
import com.smart.focus.ceoapi.wsdl2.goodsMovementCEO.ProductID;
import com.smart.focus.ceoapi.wsdl2.goodsMovementCEO.Quantity;
import com.smart.focus.ceoapi.wsdl2.goodsMovementCEO.SHORTDescription;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.json.simple.JSONArray;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@SuppressWarnings({ "unchecked" })
public class GoodsMovement extends WebServiceGatewaySupport {
    private String DEFAULT_URI = "https://my358019.sapbydesign.com/sap/bc/srt/scs/sap/querycustomerin1?sap-vhost=my358019.sapbydesign.com";
    private String USER = "_BNHSYS";
    private final String PASSWORD = "Welcome2022";
    private final String ACTION_NAMESPACE = "http://sap.com/xi/SAPGlobal20/Global";
    private final String SCAN_PACKAGE = "com.smart.focus.ceoapi.wsdl2.goodsMovementCEO";

    private final String DEFAULT_URI_TEST = "https://my424816.businessbydesign.cloud.sap/sap/bc/srt/scs/sap/yyhxnc1z4y_goodsmovementceo?sap-vhost=my424816.businessbydesign.cloud.sap";
    private final String USER_TEST = "_CAS_APISYS";

    public GoodsMovement() {
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

    public String reqGoodsMovement(List<Map<String, Object>> assigWblList, Map<String, Object> siteInfo) {
        /*
         * URL url = new URL(DEFAULT_URI); URLConnection connection =
         * url.openConnection(); HttpURLConnection httpConn = (HttpURLConnection)
         * connection;
         */
        // 아이디 비번 셋팅
        getWebServiceTemplate().setMessageSender(new CredentialSender(USER, PASSWORD));
      
        GoodsMovementCBOCreateRequestMessageSync requestMessageSync = new GoodsMovementCBOCreateRequestMessageSync();
        ObjectFactory objectFactory = new ObjectFactory();

        GoodsMovementCBOCreateRequest request = new GoodsMovementCBOCreateRequest();

        request.setTransitNO(assigWblList.get(0).get("ASSIG_WBL").toString());   // 운송장번호
        request.setShopID(assigWblList.get(0).get("DS_CD_STORE").toString());    // 매장ID
        request.setShopNM(assigWblList.get(0).get("DS_NM_STORE").toString());    // 매장명

        LocationID locationID = new LocationID();
        locationID.setValue(siteInfo.get("사이트").toString());           // 사이트 ID
        request.setSiteID(locationID);

        XMLGregorianCalendar xmlGregCal;
        try {
            xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(CommonLib.getToday("yyyy-MM-dd"));
        } catch (DatatypeConfigurationException e) {
            xmlGregCal = null;
            e.printStackTrace();
        }
        request.setCreateDate(xmlGregCal);

        request.setStatusCD("04");      // 상태코드

        /**** START LOOP ****/
        for (int i = 0; i < assigWblList.size(); i++) {
            
            GoodsMovementCBOCreateRequestItem item = new GoodsMovementCBOCreateRequestItem();
            
            item.setItemID(String.valueOf(i));       // 항번 (ITEM 채번)

            ProductID productID = new ProductID();
            productID.setValue(assigWblList.get(i).get("CD_ITEM").toString()); // 제품 ID
            item.setProductID(productID);
            
            SHORTDescription description = new SHORTDescription();
            description.setLanguageCode("KO");                                  // 제품내역 속성
            description.setValue(assigWblList.get(i).get("NM_ITEM").toString());  // 제품내역 
            item.setProductDesc(description);

            item.setSourceAreaID(siteInfo.get("장소코드").toString());  // 소스 물류영역 ID

            IdentifiedStockID identifiedStockID = new IdentifiedStockID();
            identifiedStockID.setValue(assigWblList.get(i).get("CD_IDENTSTOCK").toString());        // 동종재고 ID 
            item.setStockID(identifiedStockID);
            item.setTargetAreaID(assigWblList.get(i).get("CD_WAREHOUSE").toString());  // 대상물류영역 ID

            Quantity quantity = new Quantity();
            quantity.setUnitCode(assigWblList.get(i).get("단위").toString());             // 수량 속성
            quantity.setValue(new BigDecimal(assigWblList.get(i).get("QT_PACK").toString()));   // 수량 이동
            item.setMoveQuantity(quantity);        

            request.getItem().add(item);
        }
        /***** END LOOP *****/

        requestMessageSync.setGoodsMovementCBO(request);

        JAXBElement<GoodsMovementCBOCreateRequestMessageSync> req = objectFactory
            .createGoodsMovementCBOCreateRequestSync(requestMessageSync);

        JAXBElement<GoodsMovementCBOCreateConfirmationMessageSync> res = (JAXBElement<GoodsMovementCBOCreateConfirmationMessageSync>) getWebServiceTemplate()
            .marshalSendAndReceive(req, new SoapActionCallback(ACTION_NAMESPACE));
        Log.Debug(res.getValue().getLog().toString());
        
        List<LogItem> result = res.getValue().getLog().getItem();
        int index = 0;
        String resultMsg = "";
        for (LogItem logItem : result) {
                if (index == 0) {
                    if (!logItem.getSeverityCode().toString().equals("3")) {
                            resultMsg = "success";
                    }
                }
                Log.Debug(">>>>>> 매장이동[%d] , [MESSAGE : %s]", index, resultMsg);
                index++;
        }
        return resultMsg;
        
    }
}
