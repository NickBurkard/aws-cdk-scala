package io.burkard.cdk.services.location

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPlaceIndex {

  def apply(
    internalResourceId: String,
    description: Option[String] = None,
    dataSource: Option[String] = None,
    pricingPlan: Option[String] = None,
    dataSourceConfiguration: Option[software.amazon.awscdk.services.location.CfnPlaceIndex.DataSourceConfigurationProperty] = None,
    indexName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.location.CfnPlaceIndex =
    software.amazon.awscdk.services.location.CfnPlaceIndex.Builder
      .create(stackCtx, internalResourceId)
      .description(description.orNull)
      .dataSource(dataSource.orNull)
      .pricingPlan(pricingPlan.orNull)
      .dataSourceConfiguration(dataSourceConfiguration.orNull)
      .indexName(indexName.orNull)
      .build()
}
