package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CapacityProviderStrategyProperty {

  def apply(
    weight: Option[Number] = None,
    capacityProvider: Option[String] = None,
    base: Option[Number] = None
  ): software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations.CapacityProviderStrategyProperty =
    (new software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations.CapacityProviderStrategyProperty.Builder)
      .weight(weight.orNull)
      .capacityProvider(capacityProvider.orNull)
      .base(base.orNull)
      .build()
}
