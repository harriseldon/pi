
package com.ulta.monitoring.pimonitoring;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-10-28T16:58:05.695-05:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "getServices_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException", targetNamespace = "urn:AdapterMessageMonitoringWsd/AdapterMessageMonitoringVi")
public class GetServicesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc extends Exception {
    
    private com.ulta.monitoring.pimonitoring.OperationFailedException getServicesComSapAiiMdtServerAdapterframeworkWsOperationFailedException;

    public GetServicesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc() {
        super();
    }
    
    public GetServicesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message) {
        super(message);
    }
    
    public GetServicesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message, Throwable cause) {
        super(message, cause);
    }

    public GetServicesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message, com.ulta.monitoring.pimonitoring.OperationFailedException getServicesComSapAiiMdtServerAdapterframeworkWsOperationFailedException) {
        super(message);
        this.getServicesComSapAiiMdtServerAdapterframeworkWsOperationFailedException = getServicesComSapAiiMdtServerAdapterframeworkWsOperationFailedException;
    }

    public GetServicesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message, com.ulta.monitoring.pimonitoring.OperationFailedException getServicesComSapAiiMdtServerAdapterframeworkWsOperationFailedException, Throwable cause) {
        super(message, cause);
        this.getServicesComSapAiiMdtServerAdapterframeworkWsOperationFailedException = getServicesComSapAiiMdtServerAdapterframeworkWsOperationFailedException;
    }

    public com.ulta.monitoring.pimonitoring.OperationFailedException getFaultInfo() {
        return this.getServicesComSapAiiMdtServerAdapterframeworkWsOperationFailedException;
    }
}
