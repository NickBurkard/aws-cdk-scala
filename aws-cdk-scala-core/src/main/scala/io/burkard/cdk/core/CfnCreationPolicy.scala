package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCreationPolicy {

  def apply(
    autoScalingCreationPolicy: Option[software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy] = None,
    resourceSignal: Option[software.amazon.awscdk.CfnResourceSignal] = None
  ): software.amazon.awscdk.CfnCreationPolicy =
    (new software.amazon.awscdk.CfnCreationPolicy.Builder)
      .autoScalingCreationPolicy(autoScalingCreationPolicy.orNull)
      .resourceSignal(resourceSignal.orNull)
      .build()
}
