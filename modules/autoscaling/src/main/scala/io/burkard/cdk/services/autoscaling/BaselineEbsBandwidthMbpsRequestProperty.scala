package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BaselineEbsBandwidthMbpsRequestProperty {

  def apply(
    min: Option[Number] = None,
    max: Option[Number] = None
  ): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.BaselineEbsBandwidthMbpsRequestProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.BaselineEbsBandwidthMbpsRequestProperty.Builder)
      .min(min.orNull)
      .max(max.orNull)
      .build()
}
