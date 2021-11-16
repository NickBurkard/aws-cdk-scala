package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CapacityProviderStrategy {

  def apply(
    capacityProvider: String,
    weight: Option[Number] = None,
    base: Option[Number] = None
  ): software.amazon.awscdk.services.ecs.CapacityProviderStrategy =
    (new software.amazon.awscdk.services.ecs.CapacityProviderStrategy.Builder)
      .capacityProvider(capacityProvider)
      .weight(weight.orNull)
      .base(base.orNull)
      .build()
}
