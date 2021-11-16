package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CapacityProviderStrategyItemProperty {

  def apply(
    capacityProvider: String,
    weight: Option[Number] = None,
    base: Option[Number] = None
  ): software.amazon.awscdk.services.events.CfnRule.CapacityProviderStrategyItemProperty =
    (new software.amazon.awscdk.services.events.CfnRule.CapacityProviderStrategyItemProperty.Builder)
      .capacityProvider(capacityProvider)
      .weight(weight.orNull)
      .base(base.orNull)
      .build()
}
