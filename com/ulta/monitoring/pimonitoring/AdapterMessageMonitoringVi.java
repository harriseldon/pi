package com.ulta.monitoring.pimonitoring;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-10-28T16:58:05.787-05:00
 * Generated source version: 2.7.7
 * 
 */
@WebService(targetNamespace = "urn:AdapterMessageMonitoringWsd/AdapterMessageMonitoringVi", name = "AdapterMessageMonitoringVi")
@XmlSeeAlso({ObjectFactory.class})
public interface AdapterMessageMonitoringVi {

    @WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
    @RequestWrapper(localName = "getErrorCodes", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetErrorCodes")
    @WebMethod
    @ResponseWrapper(localName = "getErrorCodesResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetErrorCodesResponse")
    public com.ulta.monitoring.pimonitoring.ArrayOfString getErrorCodes(
        @WebParam(name = "errorLabelID", targetNamespace = "urn:AdapterMessageMonitoringVi")
        java.lang.Integer errorLabelID
    ) throws GetErrorCodesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

    @WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
    @RequestWrapper(localName = "cancelMessages", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.CancelMessages")
    @WebMethod
    @ResponseWrapper(localName = "cancelMessagesResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.CancelMessagesResponse")
    public com.ulta.monitoring.pimonitoring.AdminActionResultMap cancelMessages(
        @WebParam(name = "messageKeys", targetNamespace = "urn:AdapterMessageMonitoringVi")
        com.ulta.monitoring.pimonitoring.ArrayOfString messageKeys
    ) throws CancelMessagesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc, CancelMessagesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc;

    @WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
    @RequestWrapper(localName = "getServices", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetServices")
    @WebMethod
    @ResponseWrapper(localName = "getServicesResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetServicesResponse")
    public com.ulta.monitoring.pimonitoring.ArrayOfString getServices() throws GetServicesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

    @WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
    @RequestWrapper(localName = "getMessageBytesJavaLangStringIntBoolean", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetMessageBytesJavaLangStringIntBoolean")
    @WebMethod
    @ResponseWrapper(localName = "getMessageBytesJavaLangStringIntBooleanResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetMessageBytesJavaLangStringIntBooleanResponse")
    public byte[] getMessageBytesJavaLangStringIntBoolean(
        @WebParam(name = "messageKey", targetNamespace = "urn:AdapterMessageMonitoringVi")
        java.lang.String messageKey,
        @WebParam(name = "version", targetNamespace = "urn:AdapterMessageMonitoringVi")
        int version,
        @WebParam(name = "archive", targetNamespace = "urn:AdapterMessageMonitoringVi")
        boolean archive
    ) throws GetMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc, GetMessageBytesJavaLangStringIntBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc;

    @WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
    @RequestWrapper(localName = "getStatusDetails", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetStatusDetails")
    @WebMethod
    @ResponseWrapper(localName = "getStatusDetailsResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetStatusDetailsResponse")
    public com.ulta.monitoring.pimonitoring.ArrayOfStatusDetail getStatusDetails(
        @WebParam(name = "errorCodes", targetNamespace = "urn:AdapterMessageMonitoringVi")
        com.ulta.monitoring.pimonitoring.ArrayOfString errorCodes,
        @WebParam(name = "locale", targetNamespace = "urn:AdapterMessageMonitoringVi")
        com.ulta.monitoring.pimonitoring.Locale locale
    ) throws GetStatusDetailsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

    @WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
    @RequestWrapper(localName = "getInterfaces", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetInterfaces")
    @WebMethod
    @ResponseWrapper(localName = "getInterfacesResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetInterfacesResponse")
    public com.ulta.monitoring.pimonitoring.ArrayOfMessageInterface getInterfaces() throws GetInterfacesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

    @WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
    @RequestWrapper(localName = "getUserDefinedSearchFilters", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetUserDefinedSearchFilters")
    @WebMethod
    @ResponseWrapper(localName = "getUserDefinedSearchFiltersResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetUserDefinedSearchFiltersResponse")
    public com.ulta.monitoring.pimonitoring.ArrayOfMessageInterface getUserDefinedSearchFilters() throws GetUserDefinedSearchFiltersComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

    @WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
    @RequestWrapper(localName = "getIntegrationFlows", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetIntegrationFlows")
    @WebMethod
    @ResponseWrapper(localName = "getIntegrationFlowsResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetIntegrationFlowsResponse")
    public com.ulta.monitoring.pimonitoring.ArrayOfIntegrationFlow getIntegrationFlows(
        @WebParam(name = "language", targetNamespace = "urn:AdapterMessageMonitoringVi")
        java.lang.String language
    ) throws GetIntegrationFlowsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

    @WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
    @RequestWrapper(localName = "getMessageList", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetMessageList")
    @WebMethod
    @ResponseWrapper(localName = "getMessageListResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetMessageListResponse")
    public com.ulta.monitoring.pimonitoring.MessageSearchReturnValue getMessageList(
        @WebParam(name = "filter", targetNamespace = "urn:AdapterMessageMonitoringVi")
        com.ulta.monitoring.pimonitoring.AdapterFilter filter,
        @WebParam(name = "maxMessages", targetNamespace = "urn:AdapterMessageMonitoringVi")
        java.lang.Integer maxMessages
    ) throws GetMessageListComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

    @WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
    @RequestWrapper(localName = "getMessageBytesJavaLangStringBoolean", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetMessageBytesJavaLangStringBoolean")
    @WebMethod
    @ResponseWrapper(localName = "getMessageBytesJavaLangStringBooleanResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetMessageBytesJavaLangStringBooleanResponse")
    public byte[] getMessageBytesJavaLangStringBoolean(
        @WebParam(name = "messageKey", targetNamespace = "urn:AdapterMessageMonitoringVi")
        java.lang.String messageKey,
        @WebParam(name = "archive", targetNamespace = "urn:AdapterMessageMonitoringVi")
        boolean archive
    ) throws GetMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc, GetMessageBytesJavaLangStringBooleanComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc;

    @WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
    @RequestWrapper(localName = "getUserDefinedSearchMessages", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetUserDefinedSearchMessages")
    @WebMethod
    @ResponseWrapper(localName = "getUserDefinedSearchMessagesResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetUserDefinedSearchMessagesResponse")
    public com.ulta.monitoring.pimonitoring.MessageSearchReturnValue getUserDefinedSearchMessages(
        @WebParam(name = "filter", targetNamespace = "urn:AdapterMessageMonitoringVi")
        com.ulta.monitoring.pimonitoring.AdapterFilter filter,
        @WebParam(name = "maxMessages", targetNamespace = "urn:AdapterMessageMonitoringVi")
        java.lang.Integer maxMessages,
        @WebParam(name = "attributes", targetNamespace = "urn:AdapterMessageMonitoringVi")
        com.ulta.monitoring.pimonitoring.ArrayOfBusinessAttribute attributes,
        @WebParam(name = "operator", targetNamespace = "urn:AdapterMessageMonitoringVi")
        java.lang.String operator
    ) throws GetUserDefinedSearchMessagesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

    @WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
    @RequestWrapper(localName = "resendMessages", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.ResendMessages")
    @WebMethod
    @ResponseWrapper(localName = "resendMessagesResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.ResendMessagesResponse")
    public com.ulta.monitoring.pimonitoring.AdminActionResultMap resendMessages(
        @WebParam(name = "messageKeys", targetNamespace = "urn:AdapterMessageMonitoringVi")
        com.ulta.monitoring.pimonitoring.ArrayOfString messageKeys
    ) throws ResendMessagesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc, ResendMessagesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc;

    @WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
    @RequestWrapper(localName = "getParties", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetParties")
    @WebMethod
    @ResponseWrapper(localName = "getPartiesResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetPartiesResponse")
    public com.ulta.monitoring.pimonitoring.ArrayOfMessageParty getParties() throws GetPartiesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

    @WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
    @RequestWrapper(localName = "getConnections", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetConnections")
    @WebMethod
    @ResponseWrapper(localName = "getConnectionsResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetConnectionsResponse")
    public com.ulta.monitoring.pimonitoring.ArrayOfString getConnections() throws GetConnectionsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

    @WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
    @RequestWrapper(localName = "getLogEntries", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetLogEntries")
    @WebMethod
    @ResponseWrapper(localName = "getLogEntriesResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetLogEntriesResponse")
    public com.ulta.monitoring.pimonitoring.ArrayOfAuditLogEntryData getLogEntries(
        @WebParam(name = "messageKey", targetNamespace = "urn:AdapterMessageMonitoringVi")
        java.lang.String messageKey,
        @WebParam(name = "archive", targetNamespace = "urn:AdapterMessageMonitoringVi")
        boolean archive,
        @WebParam(name = "maxResults", targetNamespace = "urn:AdapterMessageMonitoringVi")
        java.lang.Integer maxResults,
        @WebParam(name = "locale", targetNamespace = "urn:AdapterMessageMonitoringVi")
        com.ulta.monitoring.pimonitoring.Locale locale,
        @WebParam(name = "olderThan", targetNamespace = "urn:AdapterMessageMonitoringVi")
        javax.xml.datatype.XMLGregorianCalendar olderThan
    ) throws GetLogEntriesComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc, GetLogEntriesComSapAiiMdtServerAdapterframeworkWsInvalidKeyExceptionDoc;

    @WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
    @RequestWrapper(localName = "getAllAvailableStatusDetails", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetAllAvailableStatusDetails")
    @WebMethod
    @ResponseWrapper(localName = "getAllAvailableStatusDetailsResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetAllAvailableStatusDetailsResponse")
    public com.ulta.monitoring.pimonitoring.ArrayOfStatusDetail getAllAvailableStatusDetails(
        @WebParam(name = "locale", targetNamespace = "urn:AdapterMessageMonitoringVi")
        com.ulta.monitoring.pimonitoring.Locale locale
    ) throws GetAllAvailableStatusDetailsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

    @WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
    @RequestWrapper(localName = "getMessagesByKeys", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetMessagesByKeys")
    @WebMethod
    @ResponseWrapper(localName = "getMessagesByKeysResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetMessagesByKeysResponse")
    public com.ulta.monitoring.pimonitoring.MessageSearchReturnValue getMessagesByKeys(
        @WebParam(name = "filter", targetNamespace = "urn:AdapterMessageMonitoringVi")
        com.ulta.monitoring.pimonitoring.ArrayOfString filter,
        @WebParam(name = "maxMessages", targetNamespace = "urn:AdapterMessageMonitoringVi")
        java.lang.Integer maxMessages
    ) throws GetMessagesByKeysComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

    @WebResult(name = "Response", targetNamespace = "urn:AdapterMessageMonitoringVi")
    @RequestWrapper(localName = "getUserDefinedSearchExtractors", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetUserDefinedSearchExtractors")
    @WebMethod
    @ResponseWrapper(localName = "getUserDefinedSearchExtractorsResponse", targetNamespace = "urn:AdapterMessageMonitoringVi", className = "com.ulta.monitoring.pimonitoring.GetUserDefinedSearchExtractorsResponse")
    public com.ulta.monitoring.pimonitoring.ArrayOfAttributeMetadata getUserDefinedSearchExtractors(
        @WebParam(name = "name", targetNamespace = "urn:AdapterMessageMonitoringVi")
        java.lang.String name,
        @WebParam(name = "namespace", targetNamespace = "urn:AdapterMessageMonitoringVi")
        java.lang.String namespace
    ) throws GetUserDefinedSearchExtractorsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;
}
