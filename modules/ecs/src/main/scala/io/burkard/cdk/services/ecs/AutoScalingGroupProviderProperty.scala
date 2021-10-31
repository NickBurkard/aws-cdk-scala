package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AutoScalingGroupProviderProperty {

  def apply(
    managedScaling: Option[software.amazon.awscdk.services.ecs.CfnCapacityProvider.ManagedScalingProperty] = None,
    managedTerminationProtection: Option[String] = None,
    autoScalingGroupArn: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnCapacityProvider.AutoScalingGroupProviderProperty =
    (new software.amazon.awscdk.services.ecs.CfnCapacityProvider.AutoScalingGroupProviderProperty.Builder)
      .managedScaling(managedScaling.orNull)
      .managedTerminationProtection(managedTerminationProtection.orNull)
      .autoScalingGroupArn(autoScalingGroupArn.orNull)
      .build()
}
