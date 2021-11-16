package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMonitoringScheduleProps {

  def apply(
    monitoringScheduleConfig: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringScheduleConfigProperty,
    monitoringScheduleName: String,
    lastMonitoringExecutionSummary: Option[software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringExecutionSummaryProperty] = None,
    failureReason: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    monitoringScheduleStatus: Option[String] = None,
    endpointName: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnMonitoringScheduleProps =
    (new software.amazon.awscdk.services.sagemaker.CfnMonitoringScheduleProps.Builder)
      .monitoringScheduleConfig(monitoringScheduleConfig)
      .monitoringScheduleName(monitoringScheduleName)
      .lastMonitoringExecutionSummary(lastMonitoringExecutionSummary.orNull)
      .failureReason(failureReason.orNull)
      .tags(tags.map(_.asJava).orNull)
      .monitoringScheduleStatus(monitoringScheduleStatus.orNull)
      .endpointName(endpointName.orNull)
      .build()
}
