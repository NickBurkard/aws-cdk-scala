package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MemoryGiBPerVCpuRequestProperty {

  def apply(
    min: Option[Number] = None,
    max: Option[Number] = None
  ): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MemoryGiBPerVCpuRequestProperty.Builder)
      .min(min.orNull)
      .max(max.orNull)
      .build()
}
