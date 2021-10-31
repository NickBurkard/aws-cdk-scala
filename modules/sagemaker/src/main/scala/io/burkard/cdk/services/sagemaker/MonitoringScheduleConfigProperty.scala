package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MonitoringScheduleConfigProperty {

  def apply(
    monitoringType: Option[String] = None,
    monitoringJobDefinitionName: Option[String] = None,
    monitoringJobDefinition: Option[software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringJobDefinitionProperty] = None,
    scheduleConfig: Option[software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ScheduleConfigProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringScheduleConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringScheduleConfigProperty.Builder)
      .monitoringType(monitoringType.orNull)
      .monitoringJobDefinitionName(monitoringJobDefinitionName.orNull)
      .monitoringJobDefinition(monitoringJobDefinition.orNull)
      .scheduleConfig(scheduleConfig.orNull)
      .build()
}
