package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScheduleProperty {

  def apply(
    scheduleExpression: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnCrawler.ScheduleProperty =
    (new software.amazon.awscdk.services.glue.CfnCrawler.ScheduleProperty.Builder)
      .scheduleExpression(scheduleExpression.orNull)
      .build()
}
