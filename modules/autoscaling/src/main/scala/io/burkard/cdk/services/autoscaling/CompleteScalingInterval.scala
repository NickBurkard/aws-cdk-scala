package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CompleteScalingInterval {

  def apply(
    lower: Number,
    upper: Number,
    change: Option[Number] = None
  ): software.amazon.awscdk.services.autoscaling.common.CompleteScalingInterval =
    (new software.amazon.awscdk.services.autoscaling.common.CompleteScalingInterval.Builder)
      .lower(lower)
      .upper(upper)
      .change(change.orNull)
      .build()
}
