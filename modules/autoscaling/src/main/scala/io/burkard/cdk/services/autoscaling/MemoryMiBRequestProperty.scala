package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MemoryMiBRequestProperty {

  def apply(
    min: Option[Number] = None,
    max: Option[Number] = None
  ): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryMiBRequestProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryMiBRequestProperty.Builder)
      .min(min.orNull)
      .max(max.orNull)
      .build()
}
