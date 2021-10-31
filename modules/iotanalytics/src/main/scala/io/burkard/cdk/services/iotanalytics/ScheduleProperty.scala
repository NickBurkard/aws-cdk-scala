package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScheduleProperty {

  def apply(
    scheduleExpression: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.ScheduleProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.ScheduleProperty.Builder)
      .scheduleExpression(scheduleExpression.orNull)
      .build()
}
