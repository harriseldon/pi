
package com.ulta.monitoring.pimonitoring;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-10-28T16:58:05.704-05:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "getMessageBytesJavaLangStringIntBoolean_com.sap.aii.mdt.server.adapterframework.ws.InvalidKeyException", targetNamespace = "urn:AdapterMessageMonitoringWsd/AdapterMessageMonitoringVi")
public class GetMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc extends Exception {
    
    private com.ulta.monitoring.pimonitoring.InvalidKeyException getMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyException;

    public GetMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc() {
        super();
    }
    
    public GetMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc(String message) {
        super(message);
    }
    
    public GetMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc(String message, Throwable cause) {
        super(message, cause);
    }

    public GetMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc(String message, com.ulta.monitoring.pimonitoring.InvalidKeyException getMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyException) {
        super(message);
        this.getMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyException = getMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyException;
    }

    public GetMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc(String message, com.ulta.monitoring.pimonitoring.InvalidKeyException getMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyException, Throwable cause) {
        super(message, cause);
        this.getMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyException = getMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyException;
    }

    public com.ulta.monitoring.pimonitoring.InvalidKeyException getFaultInfo() {
        return this.getMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyException;
    }
}
