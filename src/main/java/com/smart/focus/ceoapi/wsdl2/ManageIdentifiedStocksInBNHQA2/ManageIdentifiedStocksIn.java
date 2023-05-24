package com.smart.focus.ceoapi.wsdl2.ManageIdentifiedStocksInBNHQA2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.4.5
 * 2021-10-21T16:47:43.932+09:00
 * Generated source version: 3.4.5
 *
 */
@WebService(targetNamespace = "http://sap.com/xi/A1S/Global", name = "ManageIdentifiedStocksIn")
@XmlSeeAlso({ ObjectFactory.class })
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ManageIdentifiedStocksIn {

    @WebMethod(operationName = "MaintainBundle", action = "http://sap.com/xi/A1S/Global/ManageIdentifiedStocksIn/MaintainBundleRequest")
    @WebResult(name = "IdentifiedStockMaintainResponseMessage", targetNamespace = "http://sap.com/xi/SAPGlobal20/Global", partName = "IdentifiedStockMaintainResponseMessage")
    public ManageIdentifiedStockResponseMessage maintainBundle(

            @WebParam(partName = "IdentifiedStockMaintainRequestMessage", name = "IdentifiedStockMaintainRequestMessage", targetNamespace = "http://sap.com/xi/SAPGlobal20/Global") ManageIdentifiedStockRequestMessage identifiedStockMaintainRequestMessage)
            throws StandardFaultMessage_Exception;

    @WebMethod(operationName = "CheckMaintainBundle", action = "http://sap.com/xi/A1S/Global/ManageIdentifiedStocksIn/CheckMaintainBundleRequest")
    @WebResult(name = "IdentifiedStockMaintainCheckResponseMessage", targetNamespace = "http://sap.com/xi/SAPGlobal20/Global", partName = "IdentifiedStockMaintainCheckResponseMessage")
    public ManageIdentifiedStockResponseMessage checkMaintainBundle(

            @WebParam(partName = "IdentifiedStockMaintainCheckRequestMessage", name = "IdentifiedStockMaintainCheckRequestMessage", targetNamespace = "http://sap.com/xi/SAPGlobal20/Global") ManageIdentifiedStockRequestMessage identifiedStockMaintainCheckRequestMessage)
            throws StandardFaultMessage_Exception;
}
