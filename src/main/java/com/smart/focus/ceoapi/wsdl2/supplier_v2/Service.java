package com.smart.focus.ceoapi.wsdl2.supplier_v2;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 3.4.5
 * 2022-10-31T08:28:27.053+09:00
 * Generated source version: 3.4.5
 *
 */
@WebServiceClient(name = "service",
                  wsdlLocation = "file:/Users/mzc01-yongjink/Desktop/BnhProject/BnhSmartApi2/src/main/resources/Querysupplierin1CEOTest.wsdl",
                  targetNamespace = "http://sap.com/xi/A1S/Global")
public class Service extends javax.xml.ws.Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://sap.com/xi/A1S/Global", "service");
    public final static QName Binding = new QName("http://sap.com/xi/A1S/Global", "binding");
    public final static QName BindingSOAP12 = new QName("http://sap.com/xi/A1S/Global", "binding_SOAP12");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/mzc01-yongjink/Desktop/BnhProject/BnhSmartApi2/src/main/resources/Querysupplierin1CEOTest.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/Users/mzc01-yongjink/Desktop/BnhProject/BnhSmartApi2/src/main/resources/Querysupplierin1CEOTest.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns QuerySupplierIn
     */
    @WebEndpoint(name = "binding")
    public QuerySupplierIn getBinding() {
        return super.getPort(Binding, QuerySupplierIn.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns QuerySupplierIn
     */
    @WebEndpoint(name = "binding")
    public QuerySupplierIn getBinding(WebServiceFeature... features) {
        return super.getPort(Binding, QuerySupplierIn.class, features);
    }


    /**
     *
     * @return
     *     returns QuerySupplierIn
     */
    @WebEndpoint(name = "binding_SOAP12")
    public QuerySupplierIn getBindingSOAP12() {
        return super.getPort(BindingSOAP12, QuerySupplierIn.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns QuerySupplierIn
     */
    @WebEndpoint(name = "binding_SOAP12")
    public QuerySupplierIn getBindingSOAP12(WebServiceFeature... features) {
        return super.getPort(BindingSOAP12, QuerySupplierIn.class, features);
    }

}