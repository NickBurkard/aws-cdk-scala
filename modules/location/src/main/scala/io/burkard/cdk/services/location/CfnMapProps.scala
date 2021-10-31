package io.burkard.cdk.services.location

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMapProps {

  def apply(
    mapName: Option[String] = None,
    description: Option[String] = None,
    configuration: Option[software.amazon.awscdk.services.location.CfnMap.MapConfigurationProperty] = None,
    pricingPlan: Option[String] = None
  ): software.amazon.awscdk.services.location.CfnMapProps =
    (new software.amazon.awscdk.services.location.CfnMapProps.Builder)
      .mapName(mapName.orNull)
      .description(description.orNull)
      .configuration(configuration.orNull)
      .pricingPlan(pricingPlan.orNull)
      .build()
}
