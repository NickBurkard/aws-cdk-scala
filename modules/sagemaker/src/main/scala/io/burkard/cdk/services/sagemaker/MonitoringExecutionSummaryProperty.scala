package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MonitoringExecutionSummaryProperty {

  def apply(
    monitoringExecutionStatus: String,
    lastModifiedTime: String,
    scheduledTime: String,
    monitoringScheduleName: String,
    creationTime: String,
    processingJobArn: Option[String] = None,
    failureReason: Option[String] = None,
    endpointName: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringExecutionSummaryProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringExecutionSummaryProperty.Builder)
      .monitoringExecutionStatus(monitoringExecutionStatus)
      .lastModifiedTime(lastModifiedTime)
      .scheduledTime(scheduledTime)
      .monitoringScheduleName(monitoringScheduleName)
      .creationTime(creationTime)
      .processingJobArn(processingJobArn.orNull)
      .failureReason(failureReason.orNull)
      .endpointName(endpointName.orNull)
      .build()
}
