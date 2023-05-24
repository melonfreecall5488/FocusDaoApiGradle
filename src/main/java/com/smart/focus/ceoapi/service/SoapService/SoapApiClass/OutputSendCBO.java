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
import com.smart.focus.ceoapi.common.Json;
import com.smart.focus.ceoapi.common.Log;
import com.smart.focus.ceoapi.service.SpProcServiceImpl;
import com.smart.focus.ceoapi.wsdl2.product_order.MEDIUMName;
import com.smart.focus.ceoapi.wsdl2.webServiceTask.BusinessDocumentBasicMessageHeader;
import com.smart.focus.ceoapi.wsdl2.webServiceTask.IdentifiedStockID;
import com.smart.focus.ceoapi.wsdl2.webServiceTask.LogItem;
import com.smart.focus.ceoapi.wsdl2.webServiceTask.MDRSiteLogisticTaskCreateConfirmationMessageSync;
import com.smart.focus.ceoapi.wsdl2.webServiceTask.MDRSiteLogisticTaskCreateRequest;
import com.smart.focus.ceoapi.wsdl2.webServiceTask.MDRSiteLogisticTaskCreateRequestDetailTable;
import com.smart.focus.ceoapi.wsdl2.webServiceTask.MDRSiteLogisticTaskCreateRequestMessageSync;
import com.smart.focus.ceoapi.wsdl2.webServiceTask.MDRSiteLogisticTaskQueryByElementsSimpleByConfirmationMessageSync;
import com.smart.focus.ceoapi.wsdl2.webServiceTask.MDRSiteLogisticTaskUpdateConfirmationMessageSync;
import com.smart.focus.ceoapi.wsdl2.webServiceTask.NOCONVERSIONProductID;
import com.smart.focus.ceoapi.wsdl2.webServiceTask.ObjectFactory;
import com.smart.focus.ceoapi.wsdl2.webServiceTask.PartyID;
import com.smart.focus.ceoapi.wsdl2.webServiceTask.Quantity;
import com.smart.focus.ceoapi.wsdl2.webServiceTask.SHORTDescription;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@SuppressWarnings({ "unchecked" })
public class OutputSendCBO extends WebServiceGatewaySupport {

      private SpProcServiceImpl storeProcService;

      // private String DEFAULT_URI =
      // "https://my358019.sapbydesign.com/sap/bc/srt/scs/sap/managesitelogisticstaskin?sap-vhost=my358019.sapbydesign.com";
      private String DEFAULT_URI = "https://my358019.sapbydesign.com/sap/bc/srt/scs/sap/yyskzermyy_batch_taskwebservic?sap-vhost=my358019.sapbydesign.com";
      private String USER = "_OUTPORTSY_0";
      private final String PASSWORD = "Welcome2022";
      private final String ACTION_NAMESPACE = "http://sap.com/xi/SAPGlobal20/Global";
      private final String SCAN_PACKAGE = "com.smart.focus.ceoapi.wsdl2.webServiceTask";

      // private final String DEFAULT_URI_TEST =
      // "https://my424816.businessbydesign.cloud.sap/sap/bc/srt/scs/sap/yyskzermyy_batch_taskwebservic?sap-vhost=my424816.businessbydesign.cloud.sap";
      private final String DEFAULT_URI_TEST = "https://my424816.businessbydesign.cloud.sap/sap/bc/srt/scs/sap/yy57moatjy_sitelogistictaskcbo?sap-vhost=my424816.businessbydesign.cloud.sap";
      private final String USER_TEST = "_CAS_APISYS";

      public OutputSendCBO(SpProcServiceImpl storeProcService) {
            this.storeProcService = storeProcService;
            Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
            jaxb2Marshaller.setPackagesToScan(SCAN_PACKAGE);
            if (ConstDef.TEST_BED) {
                  this.DEFAULT_URI = this.DEFAULT_URI_TEST;
                  this.USER = this.USER_TEST;
            }
            super.setDefaultUri(DEFAULT_URI);
            super.setMarshaller(jaxb2Marshaller);
            super.setUnmarshaller(jaxb2Marshaller);
            Log.Debug("URL 출하 = %s", this.DEFAULT_URI);
      }

      public String reqOutputSendPost(List<Map<String, Object>> packingList, String typeIf) {
            // // 아이디 비번 셋팅

            getWebServiceTemplate().setMessageSender(new CredentialSender(USER, PASSWORD));
            ObjectFactory objectFactory = new ObjectFactory();

            MDRSiteLogisticTaskCreateRequestMessageSync requestMessage = new MDRSiteLogisticTaskCreateRequestMessageSync();

            BusinessDocumentBasicMessageHeader bHeader = new BusinessDocumentBasicMessageHeader();
            requestMessage.setBasicMessageHeader(bHeader);

            MDRSiteLogisticTaskCreateRequest cRequest = new MDRSiteLogisticTaskCreateRequest();
            cRequest.setTNOUSTRASales(Json.getString(packingList.get(0), "noSales", null)); // USTRA 판매 ID,
                                                                                            // 출하지시서.NO_SALES,
            cRequest.setTNOUSTRAOrd(Json.getString(packingList.get(0), "noOrd", null)); // USTRA 주문 ID , 출하지시서.NO_ORD
            cRequest.setTNOSales(null); // 판매오더 ID 필수값x
            cRequest.setTCDStatus("02"); // 상태, 고정값
            cRequest.setTCDDISTBROUT(null); // 유통경로 ID, 고정값
            cRequest.setTDTSales(null); // 판매 일자, 고정값
            XMLGregorianCalendar xmlGregCal;
            try {
                  xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(CommonLib.getToday("yyyy-MM-dd"));
            } catch (DatatypeConfigurationException e) {
                  xmlGregCal = null;
                  e.printStackTrace();
            }
            cRequest.setTDTCreated(xmlGregCal); // 생성일자(포맷 : YYYYMMDD). 출하지시서.DT_DLVPRS 필수값x


            if (typeIf.equals(ConstDef.POST_PICK)) {
                  cRequest.setTFGDLV("BC");
                  // cRequest.setTCDCUST(null); // 계정ID->거래처 ID, 택배는 null
            } else {
                  cRequest.setTFGDLV("BB");
                  // PartyID partyID = new PartyID();
                  // partyID.setValue(packingList.get(0).get("cdCust").toString());
                  // cRequest.setTCDCUST(partyID); // 계정ID->거래처 ID, 출하지시서.CD_CUST

            }
            // cRequest.setTMDIndicator(false);; // 처리부서 false 고정값 필수값x

            // *********** ITEM STRAT *****************
            for (int i = 0; i < packingList.size(); i++) {
                  MDRSiteLogisticTaskCreateRequestDetailTable detailTable = new MDRSiteLogisticTaskCreateRequestDetailTable();
                  // 라인 -> 판매 향번 , 패킹리스트.NO_SALESLINE
                  String salesLine = Json.getString(packingList.get(i), "noLine", null);
                  detailTable.setTNOSalesLine(salesLine);

                  // 제품 ID, 패킹리스트.품번
                  NOCONVERSIONProductID pId = new NOCONVERSIONProductID();
                  pId.setValue(Json.getString(packingList.get(i), "cdItem", null));
                  detailTable.setTCDItem(pId);

                  // 제품 내역, 품목정보.품명
                  SHORTDescription pName = new SHORTDescription();
                  pName.setValue(packingList.get(i).get("nmItem").toString());
                  detailTable.setTNMItem(pName);

                  // 동종재고 ID , 패킹리스트.CD_IDENTSTOCK
                  IdentifiedStockID stockId = new IdentifiedStockID();
                  stockId.setValue(Json.getString(packingList.get(i), "cdIdentstock", null));
                  detailTable.setTNOIdentiStock(stockId);

                  // 수량 ,패킹리스트.수량
                  Quantity qty = new Quantity();
                  qty.setValue(BigDecimal.valueOf(Json.getDouble(packingList.get(i), "qtPack", 0.0)));
                  qty.setUnitCode("EA");
                  detailTable.setTQTSales(qty);
                  detailTable.setTRQSales(qty);

                  // detailTable.setsales
                  // 잠조 태스크, 고정값
                  detailTable.setTNOTaskID(null);

                  // 소스 물류 영역 ID , 고정값
                  detailTable.setTNOLogiArea(Json.getString(packingList.get(i), "장소코드", null));

                  // TNO_SalesLine이 동종재고코드 때문에 분할될 경우 'true', 그렇지않을 경우 'false'
                  // if (Json.getInteger(packingList.get(i), "noSaleslineCount", 1) > 1)
                  //       detailTable.setTInSplit(true);
                  // else
                  //       detailTable.setTInSplit(false);

                  cRequest.getDetailTable().add(detailTable);

            }
            Log.Debug(cRequest.toString());
            requestMessage.setMDRSiteLogisticTask(cRequest);

            // *********** ITEM END *****************

            /* RESPONSE START */

            JAXBElement<MDRSiteLogisticTaskCreateRequestMessageSync> req = objectFactory
                        .createMDRSiteLogisticTaskCreateRequestSync(requestMessage);

            JAXBElement<MDRSiteLogisticTaskCreateConfirmationMessageSync> res = (JAXBElement<MDRSiteLogisticTaskCreateConfirmationMessageSync>) getWebServiceTemplate()
                        .marshalSendAndReceive(req, new SoapActionCallback(ACTION_NAMESPACE));
            List<LogItem> result = res.getValue().getLog().getItem();
            Log.Debug("size=%d", result.size());

            int index = 0;
            String resultMsg = "";
            for (LogItem item : result) {
                  if (index == 0) {
                        if (!item.getSeverityCode().toString().equals("3")) {
                              resultMsg = "success";
                        }
                  }
                  Log.Debug(">>>>>> 츨고전송[%d] , [MESSAGE : %s]", index, resultMsg);
                  index++;
            }

            /* RESPONSE END */

            return resultMsg;
      }
}
