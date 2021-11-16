package io.burkard.cdk.services.location

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPlaceIndex {

  def apply(
    internalResourceId: String,
    dataSource: String,
    pricingPlan: String,
    indexName: String,
    description: Option[String] = None,
    dataSourceConfiguration: Option[software.amazon.awscdk.services.location.CfnPlaceIndex.DataSourceConfigurationProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.location.CfnPlaceIndex =
    software.amazon.awscdk.services.location.CfnPlaceIndex.Builder
      .create(stackCtx, internalResourceId)
      .dataSource(dataSource)
      .pricingPlan(pricingPlan)
      .indexName(indexName)
      .description(description.orNull)
      .dataSourceConfiguration(dataSourceConfiguration.orNull)
      .build()
}
