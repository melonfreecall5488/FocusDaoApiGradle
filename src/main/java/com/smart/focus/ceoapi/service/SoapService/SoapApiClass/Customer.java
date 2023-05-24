package com.smart.focus.ceoapi.service.SoapService.SoapApiClass;

import java.util.List;
import javax.xml.bind.JAXBElement;

import com.smart.focus.ceoapi.common.ConstDef;
import com.smart.focus.ceoapi.common.Log;
import com.smart.focus.ceoapi.wsdl2.customer.CustomerByElementsQueryMessageSync;
import com.smart.focus.ceoapi.wsdl2.customer.CustomerReponseCustomer;
import com.smart.focus.ceoapi.wsdl2.customer.CustomerResponseMessageSync;
import com.smart.focus.ceoapi.wsdl2.customer.CustomerSelectionByElements;
import com.smart.focus.ceoapi.wsdl2.customer.CustomerSelectionByInternalID;
import com.smart.focus.ceoapi.wsdl2.customer.ObjectFactory;
import com.smart.focus.ceoapi.wsdl2.customer.QueryProcessingConditions;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@SuppressWarnings({ "unchecked" })
public class Customer extends WebServiceGatewaySupport {
    private String DEFAULT_URI = "https://my358019.sapbydesign.com/sap/bc/srt/scs/sap/querycustomerin1?sap-vhost=my358019.sapbydesign.com";
    private String USER = "_BNHSYS";
    private final String PASSWORD = "Welcome2022";
    private final String ACTION_NAMESPACE = "http://sap.com/xi/SAPGlobal20/Global";
    private final String SCAN_PACKAGE = "com.smart.focus.ceoapi.wsdl2.customer";

    private final String DEFAULT_URI_TEST = "https://my424816.businessbydesign.cloud.sap/sap/bc/srt/scs/sap/querycustomerin1?sap-vhost=my424816.businessbydesign.cloud.sap";
    private final String USER_TEST = "_MESSYS"; // "_BNHQASYS"

    public Customer() {
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

    public JSONArray reqCustomer() {
        /*
         * URL url = new URL(DEFAULT_URI); URLConnection connection =
         * url.openConnection(); HttpURLConnection httpConn = (HttpURLConnection)
         * connection;
         */
        // 아이디 비번 셋팅
        getWebServiceTemplate().setMessageSender(new CredentialSender(USER, PASSWORD));
        ObjectFactory objectFactory = new ObjectFactory();

        // 조회 정보 입력​
        CustomerByElementsQueryMessageSync requestMessage = new CustomerByElementsQueryMessageSync();
        QueryProcessingConditions processingConditions = new QueryProcessingConditions();
        processingConditions.setQueryHitsUnlimitedIndicator(true);
        requestMessage.setProcessingConditions(processingConditions);

        CustomerSelectionByElements customerSelectionByElements = objectFactory.createCustomerSelectionByElements();
        CustomerSelectionByInternalID customerSelectionByInternalID = objectFactory
                .createCustomerSelectionByInternalID();
        customerSelectionByInternalID.setInclusionExclusionCode("I"); // Include : I / Exclude : E​
        customerSelectionByInternalID.setIntervalBoundaryTypeCode("1"); // = : 1​
        customerSelectionByInternalID.setLowerBoundaryInternalID("*");

        customerSelectionByElements.getSelectionByInternalID().add(customerSelectionByInternalID);
        requestMessage.setCustomerSelectionByElements(customerSelectionByElements);
        JAXBElement<CustomerByElementsQueryMessageSync> req = objectFactory
                .createCustomerByElementsQuerySync(requestMessage);

        JAXBElement<CustomerResponseMessageSync> res = (JAXBElement<CustomerResponseMessageSync>) getWebServiceTemplate()
                .marshalSendAndReceive(req, new SoapActionCallback(ACTION_NAMESPACE));
        int customerSize = res.getValue().getCustomer().size();
        Log.Debug("customer size=%d", customerSize);
        List<CustomerReponseCustomer> customerList = res.getValue().getCustomer();

        JSONArray array = new JSONArray();
        for (CustomerReponseCustomer customer : customerList) {
            JSONObject temp = new JSONObject();
            temp.put("거래처코드", customer.getInternalID());
            temp.put("거래처명", customer.getOrganisation() == null ? "" : customer.getOrganisation().getFirstLineName());
            temp.put("거래처구분코드", "발주사");
            // List<CustomerReponseCustomerAddressInformation> address =
            // customer.getAddressInformation();
            // if (address != null && address.size() > 0)
            // temp.put("주소", address.get(0).getAddress().getPostalAddress().getStreetName()
            // == null ? ""
            // :
            // customer.getAddressInformation().get(0).getAddress().getPostalAddress().getStreetName());
            // else
            temp.put("주소", "");

            array.add(temp);
        }

        return array;
    }
}
