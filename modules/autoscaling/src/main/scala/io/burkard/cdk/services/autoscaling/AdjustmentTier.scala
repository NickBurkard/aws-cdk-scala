package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AdjustmentTier {

  def apply(
    adjustment: Number,
    lowerBound: Option[Number] = None,
    upperBound: Option[Number] = None
  ): software.amazon.awscdk.services.autoscaling.AdjustmentTier =
    (new software.amazon.awscdk.services.autoscaling.AdjustmentTier.Builder)
      .adjustment(adjustment)
      .lowerBound(lowerBound.orNull)
      .upperBound(upperBound.orNull)
      .build()
}
