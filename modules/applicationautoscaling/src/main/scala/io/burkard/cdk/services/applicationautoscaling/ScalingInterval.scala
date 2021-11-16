package io.burkard.cdk.services.applicationautoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScalingInterval {

  def apply(
    change: Number,
    lower: Option[Number] = None,
    upper: Option[Number] = None
  ): software.amazon.awscdk.services.applicationautoscaling.ScalingInterval =
    (new software.amazon.awscdk.services.applicationautoscaling.ScalingInterval.Builder)
      .change(change)
      .lower(lower.orNull)
      .upper(upper.orNull)
      .build()
}
