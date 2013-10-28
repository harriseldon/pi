package com.ulta.monitoring.pimonitoring;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-10-28T16:58:05.796-05:00
 * Generated source version: 2.7.7
 * 
 */
@WebServiceClient(name = "AdapterMessageMonitoring", 
                  wsdlLocation = "http://b1-desbaex01:50000/AdapterMessageMonitoring/basic?wsdl",
                  targetNamespace = "urn:AdapterMessageMonitoringWsd") 
public class AdapterMessageMonitoring extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:AdapterMessageMonitoringWsd", "AdapterMessageMonitoring");
    public final static QName BasicPort = new QName("urn:AdapterMessageMonitoringWsd", "basicPort");
    public final static QName SslPort = new QName("urn:AdapterMessageMonitoringWsd", "sslPort");
    public final static QName ClientCertPort = new QName("urn:AdapterMessageMonitoringWsd", "clientCertPort");
    static {
        URL url = null;
        try {
            url = new URL("http://b1-desbaex01:50000/AdapterMessageMonitoring/basic?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AdapterMessageMonitoring.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://b1-desbaex01:50000/AdapterMessageMonitoring/basic?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AdapterMessageMonitoring(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AdapterMessageMonitoring(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AdapterMessageMonitoring() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AdapterMessageMonitoring(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AdapterMessageMonitoring(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AdapterMessageMonitoring(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns AdapterMessageMonitoringVi
     */
    @WebEndpoint(name = "basicPort")
    public AdapterMessageMonitoringVi getBasicPort() {
        return super.getPort(BasicPort, AdapterMessageMonitoringVi.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdapterMessageMonitoringVi
     */
    @WebEndpoint(name = "basicPort")
    public AdapterMessageMonitoringVi getBasicPort(WebServiceFeature... features) {
        return super.getPort(BasicPort, AdapterMessageMonitoringVi.class, features);
    }
    /**
     *
     * @return
     *     returns AdapterMessageMonitoringVi
     */
    @WebEndpoint(name = "sslPort")
    public AdapterMessageMonitoringVi getSslPort() {
        return super.getPort(SslPort, AdapterMessageMonitoringVi.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdapterMessageMonitoringVi
     */
    @WebEndpoint(name = "sslPort")
    public AdapterMessageMonitoringVi getSslPort(WebServiceFeature... features) {
        return super.getPort(SslPort, AdapterMessageMonitoringVi.class, features);
    }
    /**
     *
     * @return
     *     returns AdapterMessageMonitoringVi
     */
    @WebEndpoint(name = "clientCertPort")
    public AdapterMessageMonitoringVi getClientCertPort() {
        return super.getPort(ClientCertPort, AdapterMessageMonitoringVi.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdapterMessageMonitoringVi
     */
    @WebEndpoint(name = "clientCertPort")
    public AdapterMessageMonitoringVi getClientCertPort(WebServiceFeature... features) {
        return super.getPort(ClientCertPort, AdapterMessageMonitoringVi.class, features);
    }

}