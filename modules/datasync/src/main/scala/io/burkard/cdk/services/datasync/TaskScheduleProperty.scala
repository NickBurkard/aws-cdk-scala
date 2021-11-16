package io.burkard.cdk.services.datasync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TaskScheduleProperty {

  def apply(
    scheduleExpression: String
  ): software.amazon.awscdk.services.datasync.CfnTask.TaskScheduleProperty =
    (new software.amazon.awscdk.services.datasync.CfnTask.TaskScheduleProperty.Builder)
      .scheduleExpression(scheduleExpression)
      .build()
}
