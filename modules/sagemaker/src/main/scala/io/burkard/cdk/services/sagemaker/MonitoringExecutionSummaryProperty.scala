package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MonitoringExecutionSummaryProperty {

  def apply(
    monitoringExecutionStatus: Option[String] = None,
    lastModifiedTime: Option[String] = None,
    processingJobArn: Option[String] = None,
    failureReason: Option[String] = None,
    scheduledTime: Option[String] = None,
    endpointName: Option[String] = None,
    monitoringScheduleName: Option[String] = None,
    creationTime: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringExecutionSummaryProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringExecutionSummaryProperty.Builder)
      .monitoringExecutionStatus(monitoringExecutionStatus.orNull)
      .lastModifiedTime(lastModifiedTime.orNull)
      .processingJobArn(processingJobArn.orNull)
      .failureReason(failureReason.orNull)
      .scheduledTime(scheduledTime.orNull)
      .endpointName(endpointName.orNull)
      .monitoringScheduleName(monitoringScheduleName.orNull)
      .creationTime(creationTime.orNull)
      .build()
}
