
package com.smart.focus.ceoapi.wsdl2.supplier;

import javax.xml.ws.WebFault;

/**
 * This class was generated by Apache CXF 3.4.5
 * 2021-10-07T13:53:08.899+09:00
 * Generated source version: 3.4.5
 */

@WebFault(name = "StandardFaultMessage", targetNamespace = "http://sap.com/xi/AP/Common/Global")
public class StandardFaultMessage_Exception extends Exception {

    private com.smart.focus.ceoapi.wsdl2.supplier.StandardFaultMessage faultInfo;

    public StandardFaultMessage_Exception() {
        super();
    }

    public StandardFaultMessage_Exception(String message) {
        super(message);
    }

    public StandardFaultMessage_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public StandardFaultMessage_Exception(String message,
            com.smart.focus.ceoapi.wsdl2.supplier.StandardFaultMessage standardFaultMessage) {
        super(message);
        this.faultInfo = standardFaultMessage;
    }

    public StandardFaultMessage_Exception(String message,
            com.smart.focus.ceoapi.wsdl2.supplier.StandardFaultMessage standardFaultMessage, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = standardFaultMessage;
    }

    public com.smart.focus.ceoapi.wsdl2.supplier.StandardFaultMessage getFaultInfo() {
        return this.faultInfo;
    }
}
