package com.smart.focus.ceoapi.wsdl2.product_result;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.4.5
 * 2021-10-07T13:53:09.182+09:00
 * Generated source version: 3.4.5
 *
 */
@WebService(targetNamespace = "http://sap.com/xi/A1S/Global", name = "ManageProductionLotsIn")
@XmlSeeAlso({ ObjectFactory.class })
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ManageProductionLotsIn {

    @WebMethod(operationName = "MaintainBundle_V1", action = "http://sap.com/xi/A1S/Global/ManageProductionLotsIn/MaintainBundle_V1Request")
    @WebResult(name = "ProdLotBundleMaintainConfirmation_sync_V1", targetNamespace = "http://sap.com/xi/SAPGlobal20/Global", partName = "ProdLotBundleMaintainConfirmation_sync_V1")
    public ProductionLotBundleMaintainConfirmationMessageSync maintainBundleV1(

            @WebParam(partName = "ProductionLotsBundleMaintainRequest_sync_V1", name = "ProductionLotsBundleMaintainRequest_sync_V1", targetNamespace = "http://sap.com/xi/SAPGlobal20/Global") ProdLotMaintainRequestBundleMessageSyncV1 productionLotsBundleMaintainRequestSyncV1)
            throws StandardFaultMessage_Exception;
}
