
package com.ulta.monitoring.pimonitoring;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-10-28T16:58:05.731-05:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "getMessageBytesJavaLangStringBoolean_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException", targetNamespace = "urn:AdapterMessageMonitoringWsd/AdapterMessageMonitoringVi")
public class GetMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc extends Exception {
    
    private com.ulta.monitoring.pimonitoring.OperationFailedException getMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsOperationFailedException;

    public GetMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc() {
        super();
    }
    
    public GetMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message) {
        super(message);
    }
    
    public GetMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message, Throwable cause) {
        super(message, cause);
    }

    public GetMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message, com.ulta.monitoring.pimonitoring.OperationFailedException getMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsOperationFailedException) {
        super(message);
        this.getMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsOperationFailedException = getMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsOperationFailedException;
    }

    public GetMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message, com.ulta.monitoring.pimonitoring.OperationFailedException getMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsOperationFailedException, Throwable cause) {
        super(message, cause);
        this.getMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsOperationFailedException = getMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsOperationFailedException;
    }

    public com.ulta.monitoring.pimonitoring.OperationFailedException getFaultInfo() {
        return this.getMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsOperationFailedException;
    }
}
