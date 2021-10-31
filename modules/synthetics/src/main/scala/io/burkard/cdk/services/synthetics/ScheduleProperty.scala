package io.burkard.cdk.services.synthetics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScheduleProperty {

  def apply(
    durationInSeconds: Option[String] = None,
    expression: Option[String] = None
  ): software.amazon.awscdk.services.synthetics.CfnCanary.ScheduleProperty =
    (new software.amazon.awscdk.services.synthetics.CfnCanary.ScheduleProperty.Builder)
      .durationInSeconds(durationInSeconds.orNull)
      .expression(expression.orNull)
      .build()
}
