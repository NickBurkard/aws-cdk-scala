package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceAutoScalingCreationPolicy {

  def apply(
    minSuccessfulInstancesPercent: Option[Number] = None
  ): software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy =
    (new software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy.Builder)
      .minSuccessfulInstancesPercent(minSuccessfulInstancesPercent.orNull)
      .build()
}
