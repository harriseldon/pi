
package com.ulta.monitoring.pimonitoring;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-10-28T16:58:05.763-05:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "getLogEntries_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException", targetNamespace = "urn:AdapterMessageMonitoringWsd/AdapterMessageMonitoringVi")
public class GetLogEntriesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc extends Exception {
    
    private com.ulta.monitoring.pimonitoring.OperationFailedException getLogEntriesComSapAiiMdtServerAdapterframeworkWsOperationFailedException;

    public GetLogEntriesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc() {
        super();
    }
    
    public GetLogEntriesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message) {
        super(message);
    }
    
    public GetLogEntriesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message, Throwable cause) {
        super(message, cause);
    }

    public GetLogEntriesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message, com.ulta.monitoring.pimonitoring.OperationFailedException getLogEntriesComSapAiiMdtServerAdapterframeworkWsOperationFailedException) {
        super(message);
        this.getLogEntriesComSapAiiMdtServerAdapterframeworkWsOperationFailedException = getLogEntriesComSapAiiMdtServerAdapterframeworkWsOperationFailedException;
    }

    public GetLogEntriesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message, com.ulta.monitoring.pimonitoring.OperationFailedException getLogEntriesComSapAiiMdtServerAdapterframeworkWsOperationFailedException, Throwable cause) {
        super(message, cause);
        this.getLogEntriesComSapAiiMdtServerAdapterframeworkWsOperationFailedException = getLogEntriesComSapAiiMdtServerAdapterframeworkWsOperationFailedException;
    }

    public com.ulta.monitoring.pimonitoring.OperationFailedException getFaultInfo() {
        return this.getLogEntriesComSapAiiMdtServerAdapterframeworkWsOperationFailedException;
    }
}
