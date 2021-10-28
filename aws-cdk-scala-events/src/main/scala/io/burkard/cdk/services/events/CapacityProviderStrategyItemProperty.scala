package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CapacityProviderStrategyItemProperty {

  def apply(
    weight: Option[Number] = None,
    capacityProvider: Option[String] = None,
    base: Option[Number] = None
  ): software.amazon.awscdk.services.events.CfnRule.CapacityProviderStrategyItemProperty =
    (new software.amazon.awscdk.services.events.CfnRule.CapacityProviderStrategyItemProperty.Builder)
      .weight(weight.orNull)
      .capacityProvider(capacityProvider.orNull)
      .base(base.orNull)
      .build()
}
