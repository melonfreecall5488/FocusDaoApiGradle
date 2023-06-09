
package com.smart.focus.ceoapi.wsdl2.input_list;

import javax.xml.ws.WebFault;

/**
 * This class was generated by Apache CXF 3.3.4
 * 2021-10-06T11:55:36.933+09:00
 * Generated source version: 3.3.4
 */

@WebFault(name = "StandardFaultMessage", targetNamespace = "http://sap.com/xi/AP/Common/Global")
public class StandardFaultMessage_Exception extends Exception {

    private com.smart.focus.ceoapi.wsdl2.input_list.StandardFaultMessage standardFaultMessage;

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
            com.smart.focus.ceoapi.wsdl2.input_list.StandardFaultMessage standardFaultMessage) {
        super(message);
        this.standardFaultMessage = standardFaultMessage;
    }

    public StandardFaultMessage_Exception(String message,
            com.smart.focus.ceoapi.wsdl2.input_list.StandardFaultMessage standardFaultMessage,
            java.lang.Throwable cause) {
        super(message, cause);
        this.standardFaultMessage = standardFaultMessage;
    }

    public com.smart.focus.ceoapi.wsdl2.input_list.StandardFaultMessage getFaultInfo() {
        return this.standardFaultMessage;
    }
}
