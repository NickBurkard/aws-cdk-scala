package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnMonitoringScheduleProps {

  def apply(
    lastMonitoringExecutionSummary: Option[software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringExecutionSummaryProperty] = None,
    failureReason: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    monitoringScheduleStatus: Option[String] = None,
    monitoringScheduleConfig: Option[software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringScheduleConfigProperty] = None,
    endpointName: Option[String] = None,
    monitoringScheduleName: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnMonitoringScheduleProps =
    (new software.amazon.awscdk.services.sagemaker.CfnMonitoringScheduleProps.Builder)
      .lastMonitoringExecutionSummary(lastMonitoringExecutionSummary.orNull)
      .failureReason(failureReason.orNull)
      .tags(tags.map(_.asJava).orNull)
      .monitoringScheduleStatus(monitoringScheduleStatus.orNull)
      .monitoringScheduleConfig(monitoringScheduleConfig.orNull)
      .endpointName(endpointName.orNull)
      .monitoringScheduleName(monitoringScheduleName.orNull)
      .build()
}
