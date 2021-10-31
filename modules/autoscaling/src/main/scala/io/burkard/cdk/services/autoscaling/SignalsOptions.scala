package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SignalsOptions {

  def apply(
    minSuccessPercentage: Option[Number] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.autoscaling.SignalsOptions =
    (new software.amazon.awscdk.services.autoscaling.SignalsOptions.Builder)
      .minSuccessPercentage(minSuccessPercentage.orNull)
      .timeout(timeout.orNull)
      .build()
}
