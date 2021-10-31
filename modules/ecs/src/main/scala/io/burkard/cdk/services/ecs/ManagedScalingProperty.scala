package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ManagedScalingProperty {

  def apply(
    status: Option[String] = None,
    minimumScalingStepSize: Option[Number] = None,
    maximumScalingStepSize: Option[Number] = None,
    instanceWarmupPeriod: Option[Number] = None,
    targetCapacity: Option[Number] = None
  ): software.amazon.awscdk.services.ecs.CfnCapacityProvider.ManagedScalingProperty =
    (new software.amazon.awscdk.services.ecs.CfnCapacityProvider.ManagedScalingProperty.Builder)
      .status(status.orNull)
      .minimumScalingStepSize(minimumScalingStepSize.orNull)
      .maximumScalingStepSize(maximumScalingStepSize.orNull)
      .instanceWarmupPeriod(instanceWarmupPeriod.orNull)
      .targetCapacity(targetCapacity.orNull)
      .build()
}
