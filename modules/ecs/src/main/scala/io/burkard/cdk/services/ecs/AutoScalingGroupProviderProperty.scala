package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AutoScalingGroupProviderProperty {

  def apply(
    autoScalingGroupArn: String,
    managedScaling: Option[software.amazon.awscdk.services.ecs.CfnCapacityProvider.ManagedScalingProperty] = None,
    managedTerminationProtection: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnCapacityProvider.AutoScalingGroupProviderProperty =
    (new software.amazon.awscdk.services.ecs.CfnCapacityProvider.AutoScalingGroupProviderProperty.Builder)
      .autoScalingGroupArn(autoScalingGroupArn)
      .managedScaling(managedScaling.orNull)
      .managedTerminationProtection(managedTerminationProtection.orNull)
      .build()
}
