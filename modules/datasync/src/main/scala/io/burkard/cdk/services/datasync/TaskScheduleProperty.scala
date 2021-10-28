package io.burkard.cdk.services.datasync

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TaskScheduleProperty {

  def apply(
    scheduleExpression: Option[String] = None
  ): software.amazon.awscdk.services.datasync.CfnTask.TaskScheduleProperty =
    (new software.amazon.awscdk.services.datasync.CfnTask.TaskScheduleProperty.Builder)
      .scheduleExpression(scheduleExpression.orNull)
      .build()
}
