package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnResourceAutoScalingCreationPolicy {

  def apply(
    minSuccessfulInstancesPercent: Option[Number] = None
  ): software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy =
    (new software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy.Builder)
      .minSuccessfulInstancesPercent(minSuccessfulInstancesPercent.orNull)
      .build()
}
