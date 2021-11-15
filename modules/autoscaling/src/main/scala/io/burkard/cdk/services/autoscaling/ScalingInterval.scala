package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScalingInterval {

  def apply(
    lower: Option[Number] = None,
    upper: Option[Number] = None,
    change: Option[Number] = None
  ): software.amazon.awscdk.services.autoscaling.common.ScalingInterval =
    (new software.amazon.awscdk.services.autoscaling.common.ScalingInterval.Builder)
      .lower(lower.orNull)
      .upper(upper.orNull)
      .change(change.orNull)
      .build()
}
