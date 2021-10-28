package io.burkard.cdk.services.mwaa

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LoggingConfigurationProperty {

  def apply(
    taskLogs: Option[software.amazon.awscdk.services.mwaa.CfnEnvironment.ModuleLoggingConfigurationProperty] = None,
    dagProcessingLogs: Option[software.amazon.awscdk.services.mwaa.CfnEnvironment.ModuleLoggingConfigurationProperty] = None,
    webserverLogs: Option[software.amazon.awscdk.services.mwaa.CfnEnvironment.ModuleLoggingConfigurationProperty] = None,
    schedulerLogs: Option[software.amazon.awscdk.services.mwaa.CfnEnvironment.ModuleLoggingConfigurationProperty] = None,
    workerLogs: Option[software.amazon.awscdk.services.mwaa.CfnEnvironment.ModuleLoggingConfigurationProperty] = None
  ): software.amazon.awscdk.services.mwaa.CfnEnvironment.LoggingConfigurationProperty =
    (new software.amazon.awscdk.services.mwaa.CfnEnvironment.LoggingConfigurationProperty.Builder)
      .taskLogs(taskLogs.orNull)
      .dagProcessingLogs(dagProcessingLogs.orNull)
      .webserverLogs(webserverLogs.orNull)
      .schedulerLogs(schedulerLogs.orNull)
      .workerLogs(workerLogs.orNull)
      .build()
}
