
package com.ulta.monitoring.pimonitoring;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-10-28T16:58:05.783-05:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "getUserDefinedSearchExtractors_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException", targetNamespace = "urn:AdapterMessageMonitoringWsd/AdapterMessageMonitoringVi")
public class GetUserDefinedSearchExtractorsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc extends Exception {
    
    private com.ulta.monitoring.pimonitoring.OperationFailedException getUserDefinedSearchExtractorsComSapAiiMdtServerAdapterframeworkWsOperationFailedException;

    public GetUserDefinedSearchExtractorsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc() {
        super();
    }
    
    public GetUserDefinedSearchExtractorsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message) {
        super(message);
    }
    
    public GetUserDefinedSearchExtractorsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message, Throwable cause) {
        super(message, cause);
    }

    public GetUserDefinedSearchExtractorsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message, com.ulta.monitoring.pimonitoring.OperationFailedException getUserDefinedSearchExtractorsComSapAiiMdtServerAdapterframeworkWsOperationFailedException) {
        super(message);
        this.getUserDefinedSearchExtractorsComSapAiiMdtServerAdapterframeworkWsOperationFailedException = getUserDefinedSearchExtractorsComSapAiiMdtServerAdapterframeworkWsOperationFailedException;
    }

    public GetUserDefinedSearchExtractorsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message, com.ulta.monitoring.pimonitoring.OperationFailedException getUserDefinedSearchExtractorsComSapAiiMdtServerAdapterframeworkWsOperationFailedException, Throwable cause) {
        super(message, cause);
        this.getUserDefinedSearchExtractorsComSapAiiMdtServerAdapterframeworkWsOperationFailedException = getUserDefinedSearchExtractorsComSapAiiMdtServerAdapterframeworkWsOperationFailedException;
    }

    public com.ulta.monitoring.pimonitoring.OperationFailedException getFaultInfo() {
        return this.getUserDefinedSearchExtractorsComSapAiiMdtServerAdapterframeworkWsOperationFailedException;
    }
}
