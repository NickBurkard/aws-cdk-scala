package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AsgCapacityProvider {

  def apply(
    internalResourceId: String,
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
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecs.AsgCapacityProvider =
    software.amazon.awscdk.services.ecs.AsgCapacityProvider.Builder
      .create(stackCtx, internalResourceId)
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
