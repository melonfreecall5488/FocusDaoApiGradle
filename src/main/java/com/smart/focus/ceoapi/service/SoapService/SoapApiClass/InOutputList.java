package com.smart.focus.ceoapi.service.SoapService.SoapApiClass;

import java.util.List;
import javax.xml.bind.JAXBElement;

import com.smart.focus.ceoapi.common.ConstDef;
import com.smart.focus.ceoapi.common.Log;
import com.smart.focus.ceoapi.wsdl2.input_list.ObjectFactory;
import com.smart.focus.ceoapi.wsdl2.input_list.QueryProcessingConditions;
import com.smart.focus.ceoapi.wsdl2.input_list.SiteLogisticsTaskByElementsQueryMessage;
import com.smart.focus.ceoapi.wsdl2.input_list.SiteLogisticsTaskByElementsResponseSync;
import com.smart.focus.ceoapi.wsdl2.input_list.SiteLogisticsTaskResponseMessageSync;
import com.smart.focus.ceoapi.wsdl2.input_list.SiteLogisticsTaskSelectionByElements;
import com.smart.focus.ceoapi.wsdl2.input_list.SiteLogisticsTaskSelectionByProcessingStatusCode;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@SuppressWarnings({ "unchecked" })
public class InOutputList extends WebServiceGatewaySupport {
    private String DEFAULT_URI = "https://my429341.businessbydesign.cloud.sap/sap/bc/srt/scs/sap/querysitelogisticstaskin?sap-vhost=my429341.businessbydesign.cloud.sap";
    private String USER = "_MESSYS";
    private final String PASSWORD = "Welcome2022";
    private final String ACTION_NAMESPACE = "http://sap.com/xi/SAPGlobal20/Global";
    private final String SCAN_PACKAGE = "com.smart.focus.ceoapi.wsdl2.input_list";

    private final String DEFAULT_URI_TEST = "https://my424816.businessbydesign.cloud.sap/sap/bc/srt/scs/sap/querysitelogisticstaskin?sap-vhost=my424816.businessbydesign.cloud.sap";
    private final String USER_TEST = "_MESSYS";

    public InOutputList() {
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

    public List<SiteLogisticsTaskByElementsResponseSync> reqInOutputList(boolean isInList) {
        // 아이디 비번 셋팅
        getWebServiceTemplate().setMessageSender(new CredentialSender(USER, PASSWORD));
        ObjectFactory objectFactory = new ObjectFactory();

        // 조회 정보 입력​
        SiteLogisticsTaskByElementsQueryMessage requestMessage = new SiteLogisticsTaskByElementsQueryMessage();
        QueryProcessingConditions processingConditions = new QueryProcessingConditions();
        processingConditions.setQueryHitsUnlimitedIndicator(true);
        requestMessage.setProcessingConditions(processingConditions);

        SiteLogisticsTaskSelectionByElements element = objectFactory.createSiteLogisticsTaskSelectionByElements();
        SiteLogisticsTaskSelectionByProcessingStatusCode statusCode = objectFactory
                .createSiteLogisticsTaskSelectionByProcessingStatusCode();
        statusCode.setInclusionExclusionCode("I"); // Include : I / Exclude : E​
        statusCode.setIntervalBoundaryTypeCode("1"); // = : 1​
        statusCode.setLowerBoundarySiteLogisticsProcessingStatusCode("1");
        element.getSelectionByProcessingStatusCode().add(statusCode);
        
        //  SiteLogisticsTaskSelectionByProcessTypeCode opType = objectFactory
        //  .createSiteLogisticsTaskSelectionByProcessTypeCode();
        //  opType.setInclusionExclusionCode("I");
        //  opType.setIntervalBoundaryTypeCode("2");
        //  opType.setLowerBoundaryProcessTypeCode("11");
        //  opType.setUpperBoundaryProcessTypeCode("13");
        //  element.setSelectionByProcessTypeCode(opType);
         

        requestMessage.setSiteLogisticsTaskSelectionByElements(element);
        JAXBElement<SiteLogisticsTaskByElementsQueryMessage> req = objectFactory
                .createSiteLogisticsTaskByElementsQuerySync(requestMessage);

        JAXBElement<SiteLogisticsTaskResponseMessageSync> res = (JAXBElement<SiteLogisticsTaskResponseMessageSync>) getWebServiceTemplate()
                .marshalSendAndReceive(req, new SoapActionCallback(ACTION_NAMESPACE));
        int size = res.getValue().getSiteLogisticsTask().size();
        Log.Debug("InOut List size=%d", size);
        List<SiteLogisticsTaskByElementsResponseSync> list = res.getValue().getSiteLogisticsTask();
        return list;
    }
}
