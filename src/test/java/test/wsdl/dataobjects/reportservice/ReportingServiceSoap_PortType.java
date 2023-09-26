/**
 * ReportingServiceSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.wsdl.dataobjects.reportservice;

public interface ReportingServiceSoap_PortType extends java.rmi.Remote {
    public test.wsdl.dataobjects.reportservice.ArrayOfString listSecureMethods() throws java.rmi.RemoteException;
    public java.lang.String createBatch() throws java.rmi.RemoteException;
    public void cancelBatch() throws java.rmi.RemoteException;
    public void executeBatch() throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.ArrayOfProperty getSystemProperties(test.wsdl.dataobjects.reportservice.ArrayOfProperty properties) throws java.rmi.RemoteException;
    public void setSystemProperties(test.wsdl.dataobjects.reportservice.ArrayOfProperty properties) throws java.rmi.RemoteException;
    public void deleteItem(java.lang.String item) throws java.rmi.RemoteException;
    public void moveItem(java.lang.String item, java.lang.String target) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.ArrayOfCatalogItem listChildren(java.lang.String item, boolean recursive) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.ArrayOfProperty getProperties(java.lang.String item, test.wsdl.dataobjects.reportservice.ArrayOfProperty properties) throws java.rmi.RemoteException;
    public void setProperties(java.lang.String item, test.wsdl.dataobjects.reportservice.ArrayOfProperty properties) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.ItemTypeEnum getItemType(java.lang.String item) throws java.rmi.RemoteException;
    public void createFolder(java.lang.String folder, java.lang.String parent, test.wsdl.dataobjects.reportservice.ArrayOfProperty properties) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.ArrayOfWarning createReport(java.lang.String report, java.lang.String parent, boolean overwrite, byte[] definition, test.wsdl.dataobjects.reportservice.ArrayOfProperty properties) throws java.rmi.RemoteException;
    public byte[] getReportDefinition(java.lang.String report) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.ArrayOfWarning setReportDefinition(java.lang.String report, byte[] definition) throws java.rmi.RemoteException;
    public void createResource(java.lang.String resource, java.lang.String parent, boolean overwrite, byte[] contents, java.lang.String mimeType, test.wsdl.dataobjects.reportservice.ArrayOfProperty properties) throws java.rmi.RemoteException;
    public void setResourceContents(java.lang.String resource, byte[] contents, java.lang.String mimeType) throws java.rmi.RemoteException;
    public void getResourceContents(java.lang.String resource, javax.xml.rpc.holders.ByteArrayHolder contents, javax.xml.rpc.holders.StringHolder mimeType) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.ArrayOfReportParameter getReportParameters(java.lang.String report, java.lang.String historyID, boolean forRendering, test.wsdl.dataobjects.reportservice.ArrayOfParameterValue values, test.wsdl.dataobjects.reportservice.ArrayOfDataSourceCredentials credentials) throws java.rmi.RemoteException;
    public void setReportParameters(java.lang.String report, test.wsdl.dataobjects.reportservice.ArrayOfReportParameter parameters) throws java.rmi.RemoteException;
    public void createLinkedReport(java.lang.String report, java.lang.String parent, java.lang.String link, test.wsdl.dataobjects.reportservice.ArrayOfProperty properties) throws java.rmi.RemoteException;
    public java.lang.String getReportLink(java.lang.String report) throws java.rmi.RemoteException;
    public void setReportLink(java.lang.String report, java.lang.String link) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.ArrayOfCatalogItem listLinkedReports(java.lang.String report) throws java.rmi.RemoteException;
    public void render(java.lang.String report, java.lang.String format, java.lang.String historyID, java.lang.String deviceInfo, test.wsdl.dataobjects.reportservice.ArrayOfParameterValue parameters, test.wsdl.dataobjects.reportservice.ArrayOfDataSourceCredentials credentials, java.lang.String showHideToggle, javax.xml.rpc.holders.ByteArrayHolder result, javax.xml.rpc.holders.StringHolder encoding, javax.xml.rpc.holders.StringHolder mimeType, test.wsdl.dataobjects.reportservice.holders.ArrayOfParameterValueHolder parametersUsed, test.wsdl.dataobjects.reportservice.holders.ArrayOfWarningHolder warnings, test.wsdl.dataobjects.reportservice.holders.ArrayOfStringHolder streamIds) throws java.rmi.RemoteException;
    public void renderStream(java.lang.String report, java.lang.String format, java.lang.String streamID, java.lang.String historyID, java.lang.String deviceInfo, test.wsdl.dataobjects.reportservice.ArrayOfParameterValue parameters, javax.xml.rpc.holders.ByteArrayHolder result, javax.xml.rpc.holders.StringHolder encoding, javax.xml.rpc.holders.StringHolder mimeType) throws java.rmi.RemoteException;
    public void getRenderResource(java.lang.String format, java.lang.String deviceInfo, javax.xml.rpc.holders.ByteArrayHolder result, javax.xml.rpc.holders.StringHolder mimeType) throws java.rmi.RemoteException;
    public void setExecutionOptions(java.lang.String report, test.wsdl.dataobjects.reportservice.ExecutionSettingEnum executionSetting, test.wsdl.dataobjects.reportservice.NoSchedule noSchedule, test.wsdl.dataobjects.reportservice.ScheduleDefinition scheduleDefinition, test.wsdl.dataobjects.reportservice.ScheduleReference scheduleReference) throws java.rmi.RemoteException;
    public void getExecutionOptions(java.lang.String report, test.wsdl.dataobjects.reportservice.holders.ExecutionSettingEnumHolder executionSetting, test.wsdl.dataobjects.reportservice.holders.NoScheduleHolder noSchedule, test.wsdl.dataobjects.reportservice.holders.ScheduleDefinitionHolder scheduleDefinition, test.wsdl.dataobjects.reportservice.holders.ScheduleReferenceHolder scheduleReference) throws java.rmi.RemoteException;
    public void setCacheOptions(java.lang.String report, boolean cacheReport, test.wsdl.dataobjects.reportservice.ScheduleExpiration scheduleExpiration, test.wsdl.dataobjects.reportservice.TimeExpiration timeExpiration) throws java.rmi.RemoteException;
    public void getCacheOptions(java.lang.String report, javax.xml.rpc.holders.BooleanHolder cacheReport, test.wsdl.dataobjects.reportservice.holders.ScheduleExpirationHolder scheduleExpiration, test.wsdl.dataobjects.reportservice.holders.TimeExpirationHolder timeExpiration) throws java.rmi.RemoteException;
    public void updateReportExecutionSnapshot(java.lang.String report) throws java.rmi.RemoteException;
    public void flushCache(java.lang.String report) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.ArrayOfJob listJobs() throws java.rmi.RemoteException;
    public boolean cancelJob(java.lang.String jobID) throws java.rmi.RemoteException;
    public void createDataSource(java.lang.String dataSource, java.lang.String parent, boolean overwrite, test.wsdl.dataobjects.reportservice.DataSourceDefinition definition, test.wsdl.dataobjects.reportservice.ArrayOfProperty properties) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.DataSourceDefinition getDataSourceContents(java.lang.String dataSource) throws java.rmi.RemoteException;
    public void setDataSourceContents(java.lang.String dataSource, test.wsdl.dataobjects.reportservice.DataSourceDefinition definition) throws java.rmi.RemoteException;
    public void enableDataSource(java.lang.String dataSource) throws java.rmi.RemoteException;
    public void disableDataSource(java.lang.String dataSource) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.ArrayOfCatalogItem listReportsUsingDataSource(java.lang.String dataSource) throws java.rmi.RemoteException;
    public void setReportDataSources(java.lang.String report, test.wsdl.dataobjects.reportservice.ArrayOfDataSource dataSources) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.ArrayOfDataSource getReportDataSources(java.lang.String report) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.ArrayOfDataSourcePrompt getReportDataSourcePrompts(java.lang.String report) throws java.rmi.RemoteException;
    public void createReportHistorySnapshot(java.lang.String report, javax.xml.rpc.holders.StringHolder historyID, test.wsdl.dataobjects.reportservice.holders.ArrayOfWarningHolder warnings) throws java.rmi.RemoteException;
    public void setReportHistoryOptions(java.lang.String report, boolean enableManualSnapshotCreation, boolean keepExecutionSnapshots, test.wsdl.dataobjects.reportservice.NoSchedule noSchedule, test.wsdl.dataobjects.reportservice.ScheduleDefinition scheduleDefinition, test.wsdl.dataobjects.reportservice.ScheduleReference scheduleReference) throws java.rmi.RemoteException;
    public void getReportHistoryOptions(java.lang.String report, javax.xml.rpc.holders.BooleanHolder enableManualSnapshotCreation, javax.xml.rpc.holders.BooleanHolder keepExecutionSnapshots, test.wsdl.dataobjects.reportservice.holders.NoScheduleHolder noSchedule, test.wsdl.dataobjects.reportservice.holders.ScheduleDefinitionHolder scheduleDefinition, test.wsdl.dataobjects.reportservice.holders.ScheduleReferenceHolder scheduleReference) throws java.rmi.RemoteException;
    public void setReportHistoryLimit(java.lang.String report, boolean useSystem, int historyLimit) throws java.rmi.RemoteException;
    public void getReportHistoryLimit(java.lang.String report, javax.xml.rpc.holders.IntHolder historyLimit, javax.xml.rpc.holders.BooleanHolder isSystem, javax.xml.rpc.holders.IntHolder systemLimit) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.ArrayOfReportHistorySnapshot listReportHistory(java.lang.String report) throws java.rmi.RemoteException;
    public void deleteReportHistorySnapshot(java.lang.String report, java.lang.String historyID) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.ArrayOfCatalogItem findItems(java.lang.String folder, test.wsdl.dataobjects.reportservice.BooleanOperatorEnum booleanOperator, test.wsdl.dataobjects.reportservice.ArrayOfSearchCondition conditions) throws java.rmi.RemoteException;
    public java.lang.String createSchedule(java.lang.String name, test.wsdl.dataobjects.reportservice.ScheduleDefinition scheduleDefinition) throws java.rmi.RemoteException;
    public void deleteSchedule(java.lang.String scheduleID) throws java.rmi.RemoteException;
    public void setScheduleProperties(java.lang.String name, java.lang.String scheduleID, test.wsdl.dataobjects.reportservice.ScheduleDefinition scheduleDefinition) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.Schedule getScheduleProperties(java.lang.String scheduleID) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.ArrayOfCatalogItem listScheduledReports(java.lang.String scheduleID) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.ArrayOfSchedule listSchedules() throws java.rmi.RemoteException;
    public void pauseSchedule(java.lang.String scheduleID) throws java.rmi.RemoteException;
    public void resumeSchedule(java.lang.String scheduleID) throws java.rmi.RemoteException;
    public java.lang.String createSubscription(java.lang.String report, test.wsdl.dataobjects.reportservice.ExtensionSettings extensionSettings, java.lang.String description, java.lang.String eventType, java.lang.String matchData, test.wsdl.dataobjects.reportservice.ArrayOfParameterValue parameters) throws java.rmi.RemoteException;
    public java.lang.String createDataDrivenSubscription(java.lang.String report, test.wsdl.dataobjects.reportservice.ExtensionSettings extensionSettings, test.wsdl.dataobjects.reportservice.DataRetrievalPlan dataRetrievalPlan, java.lang.String description, java.lang.String eventType, java.lang.String matchData, test.wsdl.dataobjects.reportservice.ArrayOfParameterValueOrFieldReference parameters) throws java.rmi.RemoteException;
    public void setSubscriptionProperties(java.lang.String subscriptionID, test.wsdl.dataobjects.reportservice.ExtensionSettings extensionSettings, java.lang.String description, java.lang.String eventType, java.lang.String matchData, test.wsdl.dataobjects.reportservice.ArrayOfParameterValue parameters) throws java.rmi.RemoteException;
    public void setDataDrivenSubscriptionProperties(java.lang.String dataDrivenSubscriptionID, test.wsdl.dataobjects.reportservice.ExtensionSettings extensionSettings, test.wsdl.dataobjects.reportservice.DataRetrievalPlan dataRetrievalPlan, java.lang.String description, java.lang.String eventType, java.lang.String matchData, test.wsdl.dataobjects.reportservice.ArrayOfParameterValueOrFieldReference parameters) throws java.rmi.RemoteException;
    public void getSubscriptionProperties(java.lang.String subscriptionID, javax.xml.rpc.holders.StringHolder owner, test.wsdl.dataobjects.reportservice.holders.ExtensionSettingsHolder extensionSettings, javax.xml.rpc.holders.StringHolder description, test.wsdl.dataobjects.reportservice.holders.ActiveStateHolder active, javax.xml.rpc.holders.StringHolder status, javax.xml.rpc.holders.StringHolder eventType, javax.xml.rpc.holders.StringHolder matchData, test.wsdl.dataobjects.reportservice.holders.ArrayOfParameterValueHolder parameters) throws java.rmi.RemoteException;
    public void getDataDrivenSubscriptionProperties(java.lang.String dataDrivenSubscriptionID, javax.xml.rpc.holders.StringHolder owner, test.wsdl.dataobjects.reportservice.holders.ExtensionSettingsHolder extensionSettings, test.wsdl.dataobjects.reportservice.holders.DataRetrievalPlanHolder dataRetrievalPlan, javax.xml.rpc.holders.StringHolder description, test.wsdl.dataobjects.reportservice.holders.ActiveStateHolder active, javax.xml.rpc.holders.StringHolder status, javax.xml.rpc.holders.StringHolder eventType, javax.xml.rpc.holders.StringHolder matchData, test.wsdl.dataobjects.reportservice.holders.ArrayOfParameterValueOrFieldReferenceHolder parameters) throws java.rmi.RemoteException;
    public void deleteSubscription(java.lang.String subscriptionID) throws java.rmi.RemoteException;
    public void prepareQuery(test.wsdl.dataobjects.reportservice.DataSource dataSource, test.wsdl.dataobjects.reportservice.DataSetDefinition dataSet, test.wsdl.dataobjects.reportservice.holders.DataSetDefinitionHolder dataSettings, javax.xml.rpc.holders.BooleanHolder changed) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.ArrayOfExtensionParameter getExtensionSettings(java.lang.String extension) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.ArrayOfExtensionParameter validateExtensionSettings(java.lang.String extension, test.wsdl.dataobjects.reportservice.ArrayOfParameterValueOrFieldReference parameterValues) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.ArrayOfSubscription listSubscriptions(java.lang.String report, java.lang.String owner) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.ArrayOfSubscription listSubscriptionsUsingDataSource(java.lang.String dataSource) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.ArrayOfExtension listExtensions(test.wsdl.dataobjects.reportservice.ExtensionTypeEnum extensionType) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.ArrayOfEvent listEvents() throws java.rmi.RemoteException;
    public void fireEvent(java.lang.String eventType, java.lang.String eventData) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.ArrayOfTask listSystemTasks() throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.ArrayOfTask listTasks() throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.ArrayOfRole listSystemRoles() throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.ArrayOfRole listRoles() throws java.rmi.RemoteException;
    public void createRole(java.lang.String name, java.lang.String description, test.wsdl.dataobjects.reportservice.ArrayOfTask tasks) throws java.rmi.RemoteException;
    public void deleteRole(java.lang.String name) throws java.rmi.RemoteException;
    public void getRoleProperties(java.lang.String name, test.wsdl.dataobjects.reportservice.holders.ArrayOfTaskHolder tasks, javax.xml.rpc.holders.StringHolder description) throws java.rmi.RemoteException;
    public void setRoleProperties(java.lang.String name, java.lang.String description, test.wsdl.dataobjects.reportservice.ArrayOfTask tasks) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.ArrayOfPolicy getSystemPolicies() throws java.rmi.RemoteException;
    public void setSystemPolicies(test.wsdl.dataobjects.reportservice.ArrayOfPolicy policies) throws java.rmi.RemoteException;
    public void getPolicies(java.lang.String item, test.wsdl.dataobjects.reportservice.holders.ArrayOfPolicyHolder policies, javax.xml.rpc.holders.BooleanHolder inheritParent) throws java.rmi.RemoteException;
    public void setPolicies(java.lang.String item, test.wsdl.dataobjects.reportservice.ArrayOfPolicy policies) throws java.rmi.RemoteException;
    public void inheritParentSecurity(java.lang.String item) throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.ArrayOfString3 getSystemPermissions() throws java.rmi.RemoteException;
    public test.wsdl.dataobjects.reportservice.ArrayOfString3 getPermissions(java.lang.String item) throws java.rmi.RemoteException;
    public void logonUser(java.lang.String userName, java.lang.String password, java.lang.String authority) throws java.rmi.RemoteException;
    public void logoff() throws java.rmi.RemoteException;
}
