package com.smart.focus.ceoapi.service.SoapService.SoapApiClass;

import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.smart.focus.ceoapi.common.CommonLib;
import com.smart.focus.ceoapi.common.ConstDef;
import com.smart.focus.ceoapi.common.Log;
import com.smart.focus.ceoapi.wsdl2.material_v2.MaterialByElementsQueryMessageSync;
import com.smart.focus.ceoapi.wsdl2.material_v2.MaterialByElementsQuerySelectionByElements;
import com.smart.focus.ceoapi.wsdl2.material_v2.MaterialByElementsQuerySelectionByInternalID;
import com.smart.focus.ceoapi.wsdl2.material_v2.MaterialByElementsResponseMaterialSync;
import com.smart.focus.ceoapi.wsdl2.material_v2.MaterialByElementsResponseMessageSync;
import com.smart.focus.ceoapi.wsdl2.material_v2.ObjectFactory;
import com.smart.focus.ceoapi.wsdl2.material_v2.ProductInternalID;
import com.smart.focus.ceoapi.wsdl2.material_v2.QueryProcessingConditions;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@SuppressWarnings({ "unchecked" })
public class MaterialV2 extends WebServiceGatewaySupport {
        private String DEFAULT_URI = "https://my429341.businessbydesign.cloud.sap/sap/bc/srt/scs/sap/querymaterialin?sap-vhost=my429341.businessbydesign.cloud.sap";
        private String USER = "_MESSYS";
        private final String PASSWORD = "Welcome2022";
        private final String ACTION_NAMESPACE = "http://sap.com/xi/SAPGlobal20/Global";
        private final String SCAN_PACKAGE = "com.smart.focus.ceoapi.wsdl2.material_v2";

        private final String DEFAULT_URI_TEST = "https://my424816.businessbydesign.cloud.sap/sap/bc/srt/scs/sap/querymaterialin?sap-vhost=my424816.businessbydesign.cloud.sap";
        private final String USER_TEST = "_MESSYS";

        public MaterialV2() {
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

        public JSONArray reqMaterial(String lastDate) {
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
                
                XMLGregorianCalendar xmlGregCal;
                
                try {
                    xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(lastDate + "T15:00:00.1234567Z");
                } catch (DatatypeConfigurationException e) {
                    xmlGregCal = null;
                    e.printStackTrace();
                }
                
                Log.Debug("==============xmlGregCal===>>" + xmlGregCal.toString());
                elements.setSelectionByLastChangeSinceDateTime(xmlGregCal);
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
                        temp.put("단위", material.getBaseMeasureUnitCode());
                        temp.put("구매단위", material.getPurchasing() == null ? material.getBaseMeasureUnitCode()
                                        : material.getPurchasing().getPurchasingMeasureUnitCode());
                        temp.put("표준유효기간", material.getZeperid() == null ? null : material.getZeperid().toString());               
                        temp.put("상품바코드여부", material.getZadcodeyn());               
                        temp.put("바코드", material.getZbarcode());
                        array.add(temp);
                }
                return array;
        }
}
