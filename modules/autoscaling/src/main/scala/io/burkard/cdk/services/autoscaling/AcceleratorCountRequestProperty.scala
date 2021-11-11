package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AcceleratorCountRequestProperty {

  def apply(
    min: Option[Number] = None,
    max: Option[Number] = None
  ): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.AcceleratorCountRequestProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.AcceleratorCountRequestProperty.Builder)
      .min(min.orNull)
      .max(max.orNull)
      .build()
}
