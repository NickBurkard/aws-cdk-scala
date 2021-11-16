package io.burkard.cdk.services.location

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMapProps {

  def apply(
    mapName: String,
    configuration: software.amazon.awscdk.services.location.CfnMap.MapConfigurationProperty,
    pricingPlan: String,
    description: Option[String] = None
  ): software.amazon.awscdk.services.location.CfnMapProps =
    (new software.amazon.awscdk.services.location.CfnMapProps.Builder)
      .mapName(mapName)
      .configuration(configuration)
      .pricingPlan(pricingPlan)
      .description(description.orNull)
      .build()
}
