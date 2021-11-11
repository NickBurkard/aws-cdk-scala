package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TotalLocalStorageGBRequestProperty {

  def apply(
    min: Option[Number] = None,
    max: Option[Number] = None
  ): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TotalLocalStorageGBRequestProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.TotalLocalStorageGBRequestProperty.Builder)
      .min(min.orNull)
      .max(max.orNull)
      .build()
}
