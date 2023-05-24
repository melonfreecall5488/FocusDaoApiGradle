package com.smart.focus.ceoapi.service.SoapService.SoapApiClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.JAXBElement;

import com.smart.focus.ceoapi.common.ConstDef;
import com.smart.focus.ceoapi.common.Log;

import com.smart.focus.ceoapi.wsdl2.product_order.MaterialOutputResponse;
import com.smart.focus.ceoapi.wsdl2.product_order.ObjectFactory;
import com.smart.focus.ceoapi.wsdl2.product_order.ProductionLotByElementsQueryMessage;
import com.smart.focus.ceoapi.wsdl2.product_order.ProductionLotByElementsResponseSync;
import com.smart.focus.ceoapi.wsdl2.product_order.ProductionLotResponseMessageSync;
import com.smart.focus.ceoapi.wsdl2.product_order.ProductionLotSelectionByElements;
import com.smart.focus.ceoapi.wsdl2.product_order.ProductionLotSelectionByLifeCycleStatusCode;
import com.smart.focus.ceoapi.wsdl2.product_order.QueryProcessingConditions;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@SuppressWarnings({ "unchecked" })
public class ProductOrder extends WebServiceGatewaySupport {
        // private final String DEFAULT_URI =
        // "https://my358019.sapbydesign.com/sap/bc/srt/scs/sap/queryproductionlotisiin?sap-vhost=my358019.sapbydesign.com;
        private String DEFAULT_URI = "https://my358019.sapbydesign.com/sap/bc/srt/scs/sap/queryproductionlotisiin?sap-vhost=my358019.sapbydesign.com";
        private String USER = "_BNHSYS";
        private final String PASSWORD = "Welcome2022";
        private final String ACTION_NAMESPACE = "http://sap.com/xi/SAPGlobal20/Global";
        private final String SCAN_PACKAGE = "com.smart.focus.ceoapi.wsdl2.product_order";

        private final String DEFAULT_URI_TEST = "https://my424816.businessbydesign.cloud.sap/sap/bc/srt/scs/sap/queryproductionlotisiin?sap-vhost=my424816.businessbydesign.cloud.sap";
        private final String USER_TEST = "_MESSYS";

        public ProductOrder() {
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

        public JSONArray reqOrder() {
                /*
                 * URL url = new URL(DEFAULT_URI);
                 * URLConnection connection = url.openConnection();
                 * HttpURLConnection httpConn = (HttpURLConnection) connection;
                 */
                // 아이디 비번 셋팅
                getWebServiceTemplate().setMessageSender(new CredentialSender(USER, PASSWORD));
                ObjectFactory objectFactory = new ObjectFactory();

                // 조회 정보 입력​
                ProductionLotByElementsQueryMessage requestMessage = new ProductionLotByElementsQueryMessage();
                QueryProcessingConditions processingConditions = new QueryProcessingConditions();
                processingConditions.setQueryHitsUnlimitedIndicator(true);
                requestMessage.setProcessingConditions(processingConditions);

                ProductionLotSelectionByElements elements = objectFactory.createProductionLotSelectionByElements();

                ProductionLotSelectionByLifeCycleStatusCode selectionByInternalID = objectFactory
                                .createProductionLotSelectionByLifeCycleStatusCode();
                selectionByInternalID.setInclusionExclusionCode("I"); // Include : I / Exclude : E​
                selectionByInternalID.setIntervalBoundaryTypeCode("3"); // = : 1​
                selectionByInternalID.setLowerBoundaryLifeCycleStatusCode("1");
                selectionByInternalID.setUpperBoundaryLifeCycleStatusCode("2");

                elements.getSelectionByProductionLotStatusCode().add(selectionByInternalID);
                requestMessage.setProductionLotSelectionByElements(elements);
                JAXBElement<ProductionLotByElementsQueryMessage> req = objectFactory
                                .createProductionLotByElementsQuerySync(requestMessage);

                JAXBElement<ProductionLotResponseMessageSync> res = (JAXBElement<ProductionLotResponseMessageSync>) getWebServiceTemplate()
                                .marshalSendAndReceive(req, new SoapActionCallback(ACTION_NAMESPACE));
                int size = res.getValue().getProductionLot().size();
                Log.Debug("완제품 size=%d", size);
                List<ProductionLotByElementsResponseSync> list = res.getValue().getProductionLot();

                JSONArray array = new JSONArray();
                for (ProductionLotByElementsResponseSync item : list) {
                        JSONObject temp = new JSONObject();
                        List<MaterialOutputResponse> mOutList = item.getConfirmationGroup().get(0).getMaterialOutput();
                        for (MaterialOutputResponse mItem : mOutList) {
                                temp.put("productionlotid", item.getProductionLotID().getValue());
                                temp.put("lifecyclestatuscode",
                                                item.getProductionOrderStatus().getLifeCycleStatusCode());
                                temp.put("confirmationgroupuuid",
                                                item.getConfirmationGroup().get(0).getConfirmationGroupUUID()
                                                                .getValue());
                                temp.put("produciontaskuuid",
                                                item.getConfirmationGroup().get(0).getProductionTask().get(0)
                                                                .getProducionTaskUUID().getValue());
                                temp.put("activityuuid",
                                                item.getConfirmationGroup().get(0).getActivity().get(0)
                                                                .getActivityUUID().getValue());
                                // temp.put("MaterialInputUUID",
                                // item.getConfirmationGroup().get(0).getMaterialInput().get(0).getMaterialInputUUID().getValue());
                                temp.put("confirmationmethodcode",
                                                item.getConfirmationGroup().get(0).getMaterialInput().get(0)
                                                                .getConfirmationMethodCode());
                                temp.put("sourcelogisticsareaid",
                                                item.getConfirmationGroup().get(0).getMaterialInput().get(0)
                                                                .getSourceLogisticsAreaID());
                                temp.put("reportingpointuuid",
                                                item.getConfirmationGroup().get(0).getReportingPoint().get(0)
                                                                .getReportingPointUUID().getValue());

                                // temp.put("ReleaseStatusCode", item.getProductionLotID());
                                // temp.put("ActivitProcessingStatusCode", item.getProductionLotID());
                                // material output section
                                temp.put("materialoutputuuid", mItem.getMaterialOutputUUID().getValue());
                                Log.Debug("materialoutput uuid = %s", mItem.getMaterialOutputUUID().getValue());
                                temp.put("targetlogisticsareaid", mItem.getTargetLogisticsAreaID());

                                if (item.getZProductionLotStatDate() != null) {
                                        Calendar calendar = item.getZProductionLotStatDate().toGregorianCalendar();
                                        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                                        formatter.setTimeZone(calendar.getTimeZone());
                                        temp.put("startdatetime", formatter.format(calendar.getTime()));
                                } else {
                                        temp.put("startdatetime", null);
                                }

                                temp.put("supplier", item.getZResourceCostCentreName());
                                // temp.put("EndDateTime",
                                // item.getConfirmationGroup().get(0).getActivity().get(0).getEndDateTime().toString());
                                temp.put("품번", mItem.getProductID().getValue());
                                // temp.put("IdentifiedStockDescription",
                                // mItem.getIdentifiedStockDescription().get(0).getIdentifiedStockDescription().getValue());
                                temp.put("계획수량",
                                                mItem.getPlannedQuantity() == null ? 0
                                                                : mItem.getPlannedQuantity().getValue().intValue());
                                // temp.put("TotalConfirmedQuantity",
                                // mItem.getTotalConfirmedQuantity().getValue().intValue());
                                temp.put("잔량", mItem.getOpenQuantity() == null ? 0
                                                : mItem.getOpenQuantity().getValue().intValue());
                        }
                        array.add(temp);
                }
                return array;
        }
}
