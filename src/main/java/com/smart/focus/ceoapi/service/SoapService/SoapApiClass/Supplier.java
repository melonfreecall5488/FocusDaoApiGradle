package com.smart.focus.ceoapi.service.SoapService.SoapApiClass;

import java.util.List;
import javax.xml.bind.JAXBElement;

import com.smart.focus.ceoapi.common.ConstDef;
import com.smart.focus.ceoapi.common.Log;
import com.smart.focus.ceoapi.wsdl2.supplier.ObjectFactory;
import com.smart.focus.ceoapi.wsdl2.supplier.QueryProcessingConditions;
import com.smart.focus.ceoapi.wsdl2.supplier.SelectionByName;
import com.smart.focus.ceoapi.wsdl2.supplier.SupplierByElementsQueryMessageSync;
import com.smart.focus.ceoapi.wsdl2.supplier.SupplierByElementsQuerySelectionByElements;
import com.smart.focus.ceoapi.wsdl2.supplier.SupplierByElementsReponseSupplierTelephone;
import com.smart.focus.ceoapi.wsdl2.supplier.SupplierByElementsResponseMessage;
import com.smart.focus.ceoapi.wsdl2.supplier.SupplierByElementsResponseSupplierAddressInformation;
import com.smart.focus.ceoapi.wsdl2.supplier.SupplierByElementsResponseSupplierContactPerson;
import com.smart.focus.ceoapi.wsdl2.supplier.SupplierByElementsResponseSupplierSync;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@SuppressWarnings({ "unchecked" })
public class Supplier extends WebServiceGatewaySupport {
    private String DEFAULT_URI = "https://my358019.sapbydesign.com/sap/bc/srt/scs/sap/querysupplierin1?sap-vhost=my358019.sapbydesign.com";
    private String USER = "_BNHSYS";
    private final String PASSWORD = "Welcome2022";
    private final String ACTION_NAMESPACE = "http://sap.com/xi/SAPGlobal20/Global";
    private final String SCAN_PACKAGE = "com.smart.focus.ceoapi.wsdl2.supplier";

    private final String DEFAULT_URI_TEST = "https://my424816.businessbydesign.cloud.sap/sap/bc/srt/scs/sap/querysupplierin1?sap-vhost=my424816.businessbydesign.cloud.sap";
    private final String USER_TEST = "_MESSYS";

    public Supplier() {
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

    public JSONArray reqSupplier() {
        // 아이디 비번 셋팅
        getWebServiceTemplate().setMessageSender(new CredentialSender(USER, PASSWORD));
        ObjectFactory objectFactory = new ObjectFactory();

        // 조회 정보 입력​
        SupplierByElementsQueryMessageSync requestMessage = new SupplierByElementsQueryMessageSync();
        QueryProcessingConditions processingConditions = new QueryProcessingConditions();
        processingConditions.setQueryHitsUnlimitedIndicator(true);
        requestMessage.setProcessingConditions(processingConditions);

        SupplierByElementsQuerySelectionByElements elements = objectFactory
                .createSupplierByElementsQuerySelectionByElements();
        SelectionByName name = objectFactory.createSelectionByName();
        name.setInclusionExclusionCode("I");
        name.setIntervalBoundaryTypeCode("1");
        name.setLowerBoundaryName("*");
        elements.getSelectionByBusinessPartnerName().add(name);
        requestMessage.setSupplierSelectionByElements(elements);

        JAXBElement<SupplierByElementsQueryMessageSync> req = objectFactory
                .createSupplierByElementsQuerySync(requestMessage);
        JAXBElement<SupplierByElementsResponseMessage> res = (JAXBElement<SupplierByElementsResponseMessage>) getWebServiceTemplate()
                .marshalSendAndReceive(req, new SoapActionCallback(ACTION_NAMESPACE));
        int size = res.getValue().getSupplier().size();
        Log.Debug("size=%d", size);
        List<SupplierByElementsResponseSupplierSync> list = res.getValue().getSupplier();

        JSONArray array = new JSONArray();
        for (SupplierByElementsResponseSupplierSync item : list) {
            JSONObject temp = new JSONObject();
            temp.put("거래처코드", item.getInternalID());
            temp.put("거래처구분코드", "협력사");
            temp.put("거래처명", item.getFirstLineName());
            List<SupplierByElementsResponseSupplierAddressInformation> address = item.getAddressInformation();
            if (address != null && address.size() > 0)
                temp.put("주소", item.getAddressInformation() == null ? ""
                        : item.getAddressInformation().get(0).getAddress().getPostalAddress().getStreetName());
            else
                temp.put("주소", "");

            List<SupplierByElementsResponseSupplierContactPerson> person = item.getContactPerson();
            if (person != null && person.size() > 0) {
                String fName = person.get(0).getFamilyName();
                String lName = person.get(0).getGivenName();
                temp.put("담당자", fName + lName);
                List<SupplierByElementsReponseSupplierTelephone> tel = person.get(0).getWorkplaceTelephone();
                if (tel != null && tel.size() > 0)
                    temp.put("담당자연락처", person.get(0).getWorkplaceTelephone().get(0).getFormattedNumberDescription());
                else
                    temp.put("담당자연락처", "");
            } else {
                temp.put("담당자", "");
                temp.put("담당자연락처", "");
            }
            array.add(temp);
        }

        return array;
    }
}
