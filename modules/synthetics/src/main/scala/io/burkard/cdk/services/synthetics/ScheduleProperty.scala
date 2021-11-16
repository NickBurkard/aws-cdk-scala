package io.burkard.cdk.services.synthetics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScheduleProperty {

  def apply(
    expression: String,
    durationInSeconds: Option[String] = None
  ): software.amazon.awscdk.services.synthetics.CfnCanary.ScheduleProperty =
    (new software.amazon.awscdk.services.synthetics.CfnCanary.ScheduleProperty.Builder)
      .expression(expression)
      .durationInSeconds(durationInSeconds.orNull)
      .build()
}
