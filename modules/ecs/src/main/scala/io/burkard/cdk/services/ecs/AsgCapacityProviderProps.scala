package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AsgCapacityProviderProps {

  def apply(
    spotInstanceDraining: Option[Boolean] = None,
    canContainersAccessInstanceRole: Option[Boolean] = None,
    topicEncryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    machineImageType: Option[software.amazon.awscdk.services.ecs.MachineImageType] = None,
    autoScalingGroup: Option[software.amazon.awscdk.services.autoscaling.IAutoScalingGroup] = None,
    targetCapacityPercent: Option[Number] = None,
    enableManagedScaling: Option[Boolean] = None,
    capacityProviderName: Option[String] = None,
    minimumScalingStepSize: Option[Number] = None,
    maximumScalingStepSize: Option[Number] = None,
    enableManagedTerminationProtection: Option[Boolean] = None
  ): software.amazon.awscdk.services.ecs.AsgCapacityProviderProps =
    (new software.amazon.awscdk.services.ecs.AsgCapacityProviderProps.Builder)
      .spotInstanceDraining(spotInstanceDraining.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .canContainersAccessInstanceRole(canContainersAccessInstanceRole.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .topicEncryptionKey(topicEncryptionKey.orNull)
      .machineImageType(machineImageType.orNull)
      .autoScalingGroup(autoScalingGroup.orNull)
      .targetCapacityPercent(targetCapacityPercent.orNull)
      .enableManagedScaling(enableManagedScaling.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .capacityProviderName(capacityProviderName.orNull)
      .minimumScalingStepSize(minimumScalingStepSize.orNull)
      .maximumScalingStepSize(maximumScalingStepSize.orNull)
      .enableManagedTerminationProtection(enableManagedTerminationProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
