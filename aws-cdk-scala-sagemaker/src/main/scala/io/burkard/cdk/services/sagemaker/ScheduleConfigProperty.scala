package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ScheduleConfigProperty {

  def apply(
    scheduleExpression: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ScheduleConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ScheduleConfigProperty.Builder)
      .scheduleExpression(scheduleExpression.orNull)
      .build()
}
