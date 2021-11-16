package io.burkard.cdk.services.location

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMap {

  def apply(
    internalResourceId: String,
    mapName: String,
    configuration: software.amazon.awscdk.services.location.CfnMap.MapConfigurationProperty,
    pricingPlan: String,
    description: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.location.CfnMap =
    software.amazon.awscdk.services.location.CfnMap.Builder
      .create(stackCtx, internalResourceId)
      .mapName(mapName)
      .configuration(configuration)
      .pricingPlan(pricingPlan)
      .description(description.orNull)
      .build()
}
