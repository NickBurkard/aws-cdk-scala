package io.burkard.cdk.services.location

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPlaceIndexProps {

  def apply(
    dataSource: String,
    pricingPlan: String,
    indexName: String,
    description: Option[String] = None,
    dataSourceConfiguration: Option[software.amazon.awscdk.services.location.CfnPlaceIndex.DataSourceConfigurationProperty] = None
  ): software.amazon.awscdk.services.location.CfnPlaceIndexProps =
    (new software.amazon.awscdk.services.location.CfnPlaceIndexProps.Builder)
      .dataSource(dataSource)
      .pricingPlan(pricingPlan)
      .indexName(indexName)
      .description(description.orNull)
      .dataSourceConfiguration(dataSourceConfiguration.orNull)
      .build()
}
