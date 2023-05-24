package com.smart.focus.ceoapi.service.SoapService.SoapApiClass;

import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBElement;

import com.smart.focus.ceoapi.common.ConstDef;
import com.smart.focus.ceoapi.common.Log;
import com.smart.focus.ceoapi.wsdl2.QueryIdentifiedStocksInBNHQA2.IdentifiedStockQueryMessageSync;
import com.smart.focus.ceoapi.wsdl2.QueryIdentifiedStocksInBNHQA2.IdentifiedStockQueryResponse;
import com.smart.focus.ceoapi.wsdl2.QueryIdentifiedStocksInBNHQA2.IdentifiedStockQueryResponseMessage;
import com.smart.focus.ceoapi.wsdl2.QueryIdentifiedStocksInBNHQA2.IdentifiedStockRequestQuery;
import com.smart.focus.ceoapi.wsdl2.QueryIdentifiedStocksInBNHQA2.ObjectFactory;
import com.smart.focus.ceoapi.wsdl2.QueryIdentifiedStocksInBNHQA2.QueryProcessingConditions;
import com.smart.focus.ceoapi.wsdl2.QueryIdentifiedStocksInBNHQA2.SelectionByIdentifier;

import org.json.simple.JSONObject;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@SuppressWarnings({ "unchecked" })
public class QueryIdentifiedStocksIn extends WebServiceGatewaySupport {
    private String DEFAULT_URI = "https://my429341.businessbydesign.cloud.sap/sap/bc/srt/scs/sap/queryidentifiedstocksin?sap-vhost=my429341.businessbydesign.cloud.sap";
    private String USER = "_MESSYS";
    private final String PASSWORD = "Welcome2022";
    private final String ACTION_NAMESPACE = "http://sap.com/xi/SAPGlobal20/Global";
    private final String SCAN_PACKAGE = "com.smart.focus.ceoapi.wsdl2.QueryIdentifiedStocksInBNHQA2";

    private final String DEFAULT_URI_TEST = "https://my424816.businessbydesign.cloud.sap/sap/bc/srt/scs/sap/queryidentifiedstocksin?sap-vhost=my424816.businessbydesign.cloud.sap";
    private final String USER_TEST = "_MESSYS";

    public QueryIdentifiedStocksIn() {
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

    public JSONObject reqSelectStock(List<Map<String, Object>> param) {
        // 아이디 비번 셋팅
        getWebServiceTemplate().setMessageSender(new CredentialSender(USER, PASSWORD));
        ObjectFactory objectFactory = new ObjectFactory();

        // 조회 정보 입력​
        IdentifiedStockRequestQuery identifiedStockRequestQuery = objectFactory.createIdentifiedStockRequestQuery();

        SelectionByIdentifier byIdentifier = new SelectionByIdentifier();
        byIdentifier.setInclusionExclusionCode("I");
        byIdentifier.setIntervalBoundaryTypeCode("1");
        byIdentifier.setLowerBoundaryIdentifier("220131_B119");

        identifiedStockRequestQuery.getSelectionByExternalIdentifiedStockID().add(byIdentifier);

        QueryProcessingConditions conditions = objectFactory.createQueryProcessingConditions();
        conditions.setQueryHitsMaximumNumberValue(1000);
        conditions.setQueryHitsUnlimitedIndicator(false);

        IdentifiedStockQueryMessageSync identifiedStockQueryMessageSync = objectFactory
                .createIdentifiedStockQueryMessageSync();

        identifiedStockQueryMessageSync.setProcessingConditions(conditions);
        identifiedStockQueryMessageSync.setIdentifiedStockSelectionByElements(identifiedStockRequestQuery);

        JAXBElement<IdentifiedStockQueryMessageSync> req = objectFactory
                .createIdentifiedStockQueryMessageSync(identifiedStockQueryMessageSync);

        JAXBElement<IdentifiedStockQueryResponseMessage> res = (JAXBElement<IdentifiedStockQueryResponseMessage>) getWebServiceTemplate()
                .marshalSendAndReceive(req, new SoapActionCallback(ACTION_NAMESPACE));
        int size = res.getValue().getIdentifiedStock().size();
        Log.Debug("size=%d", size);
        List<IdentifiedStockQueryResponse> list = res.getValue().getIdentifiedStock();
        Log.Debug(list.toString());

        int index = 0;
        for (IdentifiedStockQueryResponse item : list) {
            String result = item.getIdentifiedStockID().getValue();
            Log.Debug(">>>>>> getIdentifiedStockID[%d] , [MESSAGE : %s]", index, result);
            String result2 = item.getProductID().getValue();
            Log.Debug(">>>>>> getProductID[%d] , [MESSAGE : %s]", index, result2);
            String result3 = item.getExpirationDateTime().toString();
            Log.Debug(">>>>>> getExpirationDateTime[%d] , [MESSAGE : %s]", index, result3);

            index++;
        }

        return null;
    }

}
