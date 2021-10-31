package io.burkard.cdk.services.location

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMap {

  def apply(
    internalResourceId: String,
    mapName: Option[String] = None,
    description: Option[String] = None,
    configuration: Option[software.amazon.awscdk.services.location.CfnMap.MapConfigurationProperty] = None,
    pricingPlan: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.location.CfnMap =
    software.amazon.awscdk.services.location.CfnMap.Builder
      .create(stackCtx, internalResourceId)
      .mapName(mapName.orNull)
      .description(description.orNull)
      .configuration(configuration.orNull)
      .pricingPlan(pricingPlan.orNull)
      .build()
}
