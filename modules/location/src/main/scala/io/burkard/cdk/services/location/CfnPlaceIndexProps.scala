package io.burkard.cdk.services.location

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPlaceIndexProps {

  def apply(
    description: Option[String] = None,
    dataSource: Option[String] = None,
    pricingPlan: Option[String] = None,
    dataSourceConfiguration: Option[software.amazon.awscdk.services.location.CfnPlaceIndex.DataSourceConfigurationProperty] = None,
    indexName: Option[String] = None
  ): software.amazon.awscdk.services.location.CfnPlaceIndexProps =
    (new software.amazon.awscdk.services.location.CfnPlaceIndexProps.Builder)
      .description(description.orNull)
      .dataSource(dataSource.orNull)
      .pricingPlan(pricingPlan.orNull)
      .dataSourceConfiguration(dataSourceConfiguration.orNull)
      .indexName(indexName.orNull)
      .build()
}
