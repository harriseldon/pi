
package com.ulta.monitoring.pimonitoring;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-10-28T16:58:05.755-05:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "getParties_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException", targetNamespace = "urn:AdapterMessageMonitoringWsd/AdapterMessageMonitoringVi")
public class GetPartiesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc extends Exception {
    
    private com.ulta.monitoring.pimonitoring.OperationFailedException getPartiesComSapAiiMdtServerAdapterframeworkWsOperationFailedException;

    public GetPartiesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc() {
        super();
    }
    
    public GetPartiesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message) {
        super(message);
    }
    
    public GetPartiesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message, Throwable cause) {
        super(message, cause);
    }

    public GetPartiesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message, com.ulta.monitoring.pimonitoring.OperationFailedException getPartiesComSapAiiMdtServerAdapterframeworkWsOperationFailedException) {
        super(message);
        this.getPartiesComSapAiiMdtServerAdapterframeworkWsOperationFailedException = getPartiesComSapAiiMdtServerAdapterframeworkWsOperationFailedException;
    }

    public GetPartiesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message, com.ulta.monitoring.pimonitoring.OperationFailedException getPartiesComSapAiiMdtServerAdapterframeworkWsOperationFailedException, Throwable cause) {
        super(message, cause);
        this.getPartiesComSapAiiMdtServerAdapterframeworkWsOperationFailedException = getPartiesComSapAiiMdtServerAdapterframeworkWsOperationFailedException;
    }

    public com.ulta.monitoring.pimonitoring.OperationFailedException getFaultInfo() {
        return this.getPartiesComSapAiiMdtServerAdapterframeworkWsOperationFailedException;
    }
}
