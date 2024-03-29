
package com.ulta.monitoring.pimonitoring;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-10-28T16:58:05.644-05:00
 * Generated source version: 2.7.7
 * 
 */
public final class AdapterMessageMonitoringVi_SslPort_Client {

    private static final QName SERVICE_NAME = new QName("urn:AdapterMessageMonitoringWsd", "AdapterMessageMonitoring");

    private AdapterMessageMonitoringVi_SslPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = AdapterMessageMonitoring.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        AdapterMessageMonitoring ss = new AdapterMessageMonitoring(wsdlURL, SERVICE_NAME);
        AdapterMessageMonitoringVi port = ss.getSslPort();  
        
        {
        System.out.println("Invoking getErrorCodes...");
        java.lang.Integer _getErrorCodes_errorLabelID = null;
        try {
            com.ulta.monitoring.pimonitoring.ArrayOfString _getErrorCodes__return = port.getErrorCodes(_getErrorCodes_errorLabelID);
            System.out.println("getErrorCodes.result=" + _getErrorCodes__return);

        } catch (GetErrorCodesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc e) { 
            System.out.println("Expected exception: getErrorCodes_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException_doc has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking cancelMessages...");
        com.ulta.monitoring.pimonitoring.ArrayOfString _cancelMessages_messageKeys = null;
        try {
            com.ulta.monitoring.pimonitoring.AdminActionResultMap _cancelMessages__return = port.cancelMessages(_cancelMessages_messageKeys);
            System.out.println("cancelMessages.result=" + _cancelMessages__return);

        } catch (CancelMessagesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc e) { 
            System.out.println("Expected exception: cancelMessages_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException_doc has occurred.");
            System.out.println(e.toString());
        } catch (CancelMessagesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc e) { 
            System.out.println("Expected exception: cancelMessages_com.sap.aii.mdt.server.adapterframework.ws.InvalidKeyException_doc has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getServices...");
        try {
            com.ulta.monitoring.pimonitoring.ArrayOfString _getServices__return = port.getServices();
            System.out.println("getServices.result=" + _getServices__return);

        } catch (GetServicesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc e) { 
            System.out.println("Expected exception: getServices_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException_doc has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getMessageBytesJavaLangStringIntBoolean...");
        java.lang.String _getMessageBytesJavaLangStringIntBoolean_messageKey = "";
        int _getMessageBytesJavaLangStringIntBoolean_version = 0;
        boolean _getMessageBytesJavaLangStringIntBoolean_archive = false;
        try {
            byte[] _getMessageBytesJavaLangStringIntBoolean__return = port.getMessageBytesJavaLangStringIntBoolean(_getMessageBytesJavaLangStringIntBoolean_messageKey, _getMessageBytesJavaLangStringIntBoolean_version, _getMessageBytesJavaLangStringIntBoolean_archive);
            System.out.println("getMessageBytesJavaLangStringIntBoolean.result=" + _getMessageBytesJavaLangStringIntBoolean__return);

        } catch (GetMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc e) { 
            System.out.println("Expected exception: getMessageBytesJavaLangStringIntBoolean_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException_doc has occurred.");
            System.out.println(e.toString());
        } catch (GetMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc e) { 
            System.out.println("Expected exception: getMessageBytesJavaLangStringIntBoolean_com.sap.aii.mdt.server.adapterframework.ws.InvalidKeyException_doc has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getStatusDetails...");
        com.ulta.monitoring.pimonitoring.ArrayOfString _getStatusDetails_errorCodes = null;
        com.ulta.monitoring.pimonitoring.Locale _getStatusDetails_locale = null;
        try {
            com.ulta.monitoring.pimonitoring.ArrayOfStatusDetail _getStatusDetails__return = port.getStatusDetails(_getStatusDetails_errorCodes, _getStatusDetails_locale);
            System.out.println("getStatusDetails.result=" + _getStatusDetails__return);

        } catch (GetStatusDetailsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc e) { 
            System.out.println("Expected exception: getStatusDetails_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException_doc has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getInterfaces...");
        try {
            com.ulta.monitoring.pimonitoring.ArrayOfMessageInterface _getInterfaces__return = port.getInterfaces();
            System.out.println("getInterfaces.result=" + _getInterfaces__return);

        } catch (GetInterfacesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc e) { 
            System.out.println("Expected exception: getInterfaces_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException_doc has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getUserDefinedSearchFilters...");
        try {
            com.ulta.monitoring.pimonitoring.ArrayOfMessageInterface _getUserDefinedSearchFilters__return = port.getUserDefinedSearchFilters();
            System.out.println("getUserDefinedSearchFilters.result=" + _getUserDefinedSearchFilters__return);

        } catch (GetUserDefinedSearchFiltersComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc e) { 
            System.out.println("Expected exception: getUserDefinedSearchFilters_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException_doc has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getIntegrationFlows...");
        java.lang.String _getIntegrationFlows_language = "";
        try {
            com.ulta.monitoring.pimonitoring.ArrayOfIntegrationFlow _getIntegrationFlows__return = port.getIntegrationFlows(_getIntegrationFlows_language);
            System.out.println("getIntegrationFlows.result=" + _getIntegrationFlows__return);

        } catch (GetIntegrationFlowsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc e) { 
            System.out.println("Expected exception: getIntegrationFlows_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException_doc has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getMessageList...");
        com.ulta.monitoring.pimonitoring.AdapterFilter _getMessageList_filter = null;
        java.lang.Integer _getMessageList_maxMessages = null;
        try {
            com.ulta.monitoring.pimonitoring.MessageSearchReturnValue _getMessageList__return = port.getMessageList(_getMessageList_filter, _getMessageList_maxMessages);
            System.out.println("getMessageList.result=" + _getMessageList__return);

        } catch (GetMessageListComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc e) { 
            System.out.println("Expected exception: getMessageList_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException_doc has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getMessageBytesJavaLangStringBoolean...");
        java.lang.String _getMessageBytesJavaLangStringBoolean_messageKey = "";
        boolean _getMessageBytesJavaLangStringBoolean_archive = false;
        try {
            byte[] _getMessageBytesJavaLangStringBoolean__return = port.getMessageBytesJavaLangStringBoolean(_getMessageBytesJavaLangStringBoolean_messageKey, _getMessageBytesJavaLangStringBoolean_archive);
            System.out.println("getMessageBytesJavaLangStringBoolean.result=" + _getMessageBytesJavaLangStringBoolean__return);

        } catch (GetMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc e) { 
            System.out.println("Expected exception: getMessageBytesJavaLangStringBoolean_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException_doc has occurred.");
            System.out.println(e.toString());
        } catch (GetMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc e) { 
            System.out.println("Expected exception: getMessageBytesJavaLangStringBoolean_com.sap.aii.mdt.server.adapterframework.ws.InvalidKeyException_doc has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getUserDefinedSearchMessages...");
        com.ulta.monitoring.pimonitoring.AdapterFilter _getUserDefinedSearchMessages_filter = null;
        java.lang.Integer _getUserDefinedSearchMessages_maxMessages = null;
        com.ulta.monitoring.pimonitoring.ArrayOfBusinessAttribute _getUserDefinedSearchMessages_attributes = null;
        java.lang.String _getUserDefinedSearchMessages_operator = "";
        try {
            com.ulta.monitoring.pimonitoring.MessageSearchReturnValue _getUserDefinedSearchMessages__return = port.getUserDefinedSearchMessages(_getUserDefinedSearchMessages_filter, _getUserDefinedSearchMessages_maxMessages, _getUserDefinedSearchMessages_attributes, _getUserDefinedSearchMessages_operator);
            System.out.println("getUserDefinedSearchMessages.result=" + _getUserDefinedSearchMessages__return);

        } catch (GetUserDefinedSearchMessagesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc e) { 
            System.out.println("Expected exception: getUserDefinedSearchMessages_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException_doc has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking resendMessages...");
        com.ulta.monitoring.pimonitoring.ArrayOfString _resendMessages_messageKeys = null;
        try {
            com.ulta.monitoring.pimonitoring.AdminActionResultMap _resendMessages__return = port.resendMessages(_resendMessages_messageKeys);
            System.out.println("resendMessages.result=" + _resendMessages__return);

        } catch (ResendMessagesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc e) { 
            System.out.println("Expected exception: resendMessages_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException_doc has occurred.");
            System.out.println(e.toString());
        } catch (ResendMessagesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc e) { 
            System.out.println("Expected exception: resendMessages_com.sap.aii.mdt.server.adapterframework.ws.InvalidKeyException_doc has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getParties...");
        try {
            com.ulta.monitoring.pimonitoring.ArrayOfMessageParty _getParties__return = port.getParties();
            System.out.println("getParties.result=" + _getParties__return);

        } catch (GetPartiesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc e) { 
            System.out.println("Expected exception: getParties_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException_doc has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getConnections...");
        try {
            com.ulta.monitoring.pimonitoring.ArrayOfString _getConnections__return = port.getConnections();
            System.out.println("getConnections.result=" + _getConnections__return);

        } catch (GetConnectionsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc e) { 
            System.out.println("Expected exception: getConnections_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException_doc has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getLogEntries...");
        java.lang.String _getLogEntries_messageKey = "";
        boolean _getLogEntries_archive = false;
        java.lang.Integer _getLogEntries_maxResults = null;
        com.ulta.monitoring.pimonitoring.Locale _getLogEntries_locale = null;
        javax.xml.datatype.XMLGregorianCalendar _getLogEntries_olderThan = null;
        try {
            com.ulta.monitoring.pimonitoring.ArrayOfAuditLogEntryData _getLogEntries__return = port.getLogEntries(_getLogEntries_messageKey, _getLogEntries_archive, _getLogEntries_maxResults, _getLogEntries_locale, _getLogEntries_olderThan);
            System.out.println("getLogEntries.result=" + _getLogEntries__return);

        } catch (GetLogEntriesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc e) { 
            System.out.println("Expected exception: getLogEntries_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException_doc has occurred.");
            System.out.println(e.toString());
        } catch (GetLogEntriesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc e) { 
            System.out.println("Expected exception: getLogEntries_com.sap.aii.mdt.server.adapterframework.ws.InvalidKeyException_doc has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getAllAvailableStatusDetails...");
        com.ulta.monitoring.pimonitoring.Locale _getAllAvailableStatusDetails_locale = null;
        try {
            com.ulta.monitoring.pimonitoring.ArrayOfStatusDetail _getAllAvailableStatusDetails__return = port.getAllAvailableStatusDetails(_getAllAvailableStatusDetails_locale);
            System.out.println("getAllAvailableStatusDetails.result=" + _getAllAvailableStatusDetails__return);

        } catch (GetAllAvailableStatusDetailsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc e) { 
            System.out.println("Expected exception: getAllAvailableStatusDetails_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException_doc has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getMessagesByKeys...");
        com.ulta.monitoring.pimonitoring.ArrayOfString _getMessagesByKeys_filter = null;
        java.lang.Integer _getMessagesByKeys_maxMessages = null;
        try {
            com.ulta.monitoring.pimonitoring.MessageSearchReturnValue _getMessagesByKeys__return = port.getMessagesByKeys(_getMessagesByKeys_filter, _getMessagesByKeys_maxMessages);
            System.out.println("getMessagesByKeys.result=" + _getMessagesByKeys__return);

        } catch (GetMessagesByKeysComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc e) { 
            System.out.println("Expected exception: getMessagesByKeys_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException_doc has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getUserDefinedSearchExtractors...");
        java.lang.String _getUserDefinedSearchExtractors_name = "";
        java.lang.String _getUserDefinedSearchExtractors_namespace = "";
        try {
            com.ulta.monitoring.pimonitoring.ArrayOfAttributeMetadata _getUserDefinedSearchExtractors__return = port.getUserDefinedSearchExtractors(_getUserDefinedSearchExtractors_name, _getUserDefinedSearchExtractors_namespace);
            System.out.println("getUserDefinedSearchExtractors.result=" + _getUserDefinedSearchExtractors__return);

        } catch (GetUserDefinedSearchExtractorsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc e) { 
            System.out.println("Expected exception: getUserDefinedSearchExtractors_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException_doc has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
