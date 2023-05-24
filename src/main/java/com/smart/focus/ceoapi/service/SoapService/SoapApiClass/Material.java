package com.smart.focus.ceoapi.service.SoapService.SoapApiClass;

import java.util.List;
import javax.xml.bind.JAXBElement;

import com.smart.focus.ceoapi.common.ConstDef;
import com.smart.focus.ceoapi.common.Log;
import com.smart.focus.ceoapi.wsdl2.material.MaterialByElementsQueryMessageSync;
import com.smart.focus.ceoapi.wsdl2.material.MaterialByElementsQuerySelectionByElements;
import com.smart.focus.ceoapi.wsdl2.material.MaterialByElementsQuerySelectionByInternalID;
import com.smart.focus.ceoapi.wsdl2.material.MaterialByElementsResponseMaterialSync;
import com.smart.focus.ceoapi.wsdl2.material.MaterialByElementsResponseMessageSync;
import com.smart.focus.ceoapi.wsdl2.material.ObjectFactory;
import com.smart.focus.ceoapi.wsdl2.material.ProductInternalID;
import com.smart.focus.ceoapi.wsdl2.material.QueryProcessingConditions;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@SuppressWarnings({ "unchecked" })
public class Material extends WebServiceGatewaySupport {
        private String DEFAULT_URI = "https://my358019.sapbydesign.com/sap/bc/srt/scs/sap/querymaterialin?sap-vhost=my358019.sapbydesign.com";
        private String USER = "_BNHSYS";
        private final String PASSWORD = "Welcome2022";
        private final String ACTION_NAMESPACE = "http://sap.com/xi/SAPGlobal20/Global";
        private final String SCAN_PACKAGE = "com.smart.focus.ceoapi.wsdl2.material";

        private final String DEFAULT_URI_TEST = "https://my424816.businessbydesign.cloud.sap/sap/bc/srt/scs/sap/querymaterialin?sap-vhost=my424816.businessbydesign.cloud.sap";
        private final String USER_TEST = "_MESSYS";

        public Material() {
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

        public JSONArray reqMaterial() {
                /*
                 * URL url = new URL(DEFAULT_URI);
                 * URLConnection connection = url.openConnection();
                 * HttpURLConnection httpConn = (HttpURLConnection) connection;
                 */
                // 아이디 비번 셋팅
                getWebServiceTemplate().setMessageSender(new CredentialSender(USER, PASSWORD));
                ObjectFactory objectFactory = new ObjectFactory();

                // 조회 정보 입력​
                MaterialByElementsQueryMessageSync requestMessage = new MaterialByElementsQueryMessageSync();
                QueryProcessingConditions processingConditions = new QueryProcessingConditions();
                processingConditions.setQueryHitsUnlimitedIndicator(true);
                requestMessage.setProcessingConditions(processingConditions);

                MaterialByElementsQuerySelectionByElements elements = objectFactory
                                .createMaterialByElementsQuerySelectionByElements();
                MaterialByElementsQuerySelectionByInternalID selectionByInternalID = objectFactory
                                .createMaterialByElementsQuerySelectionByInternalID();
                selectionByInternalID.setInclusionExclusionCode("I"); // Include : I / Exclude : E​
                selectionByInternalID.setIntervalBoundaryTypeCode("1"); // = : 1​
                ProductInternalID pId = new ProductInternalID();
                pId.setValue("*");
                selectionByInternalID.setLowerBoundaryInternalID(pId);

                elements.getSelectionByInternalID().add(selectionByInternalID);
                requestMessage.setMaterialSelectionByElements(elements);
                JAXBElement<MaterialByElementsQueryMessageSync> req = objectFactory
                                .createMaterialByElementsQuerySync(requestMessage);

                JAXBElement<MaterialByElementsResponseMessageSync> res = (JAXBElement<MaterialByElementsResponseMessageSync>) getWebServiceTemplate()
                                .marshalSendAndReceive(req, new SoapActionCallback(ACTION_NAMESPACE));
                int size = res.getValue().getMaterial().size();
                Log.Debug("품목정보 size=%d", size);
                List<MaterialByElementsResponseMaterialSync> list = res.getValue().getMaterial();

                JSONArray array = new JSONArray();
                for (MaterialByElementsResponseMaterialSync material : list) {
                        JSONObject temp = new JSONObject();
                        temp.put("품번", material.getInternalID().getValue());
                        temp.put("품명", material.getDescription() == null ? null
                                        : material.getDescription().get(0).getDescription().getValue());
                        temp.put("품목유형", material.getProductCategoryID());
                        temp.put("단위", material.getBaseMeasureUnitCode());
                        temp.put("구매단위", material.getPurchasing() == null ? material.getBaseMeasureUnitCode()
                                        : material.getPurchasing().getPurchasingMeasureUnitCode());
                        array.add(temp);
                }
                return array;
        }
}
