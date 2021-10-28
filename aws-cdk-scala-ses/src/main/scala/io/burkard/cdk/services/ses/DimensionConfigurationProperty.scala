package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DimensionConfigurationProperty {

  def apply(
    defaultDimensionValue: Option[String] = None,
    dimensionValueSource: Option[String] = None,
    dimensionName: Option[String] = None
  ): software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.DimensionConfigurationProperty =
    (new software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.DimensionConfigurationProperty.Builder)
      .defaultDimensionValue(defaultDimensionValue.orNull)
      .dimensionValueSource(dimensionValueSource.orNull)
      .dimensionName(dimensionName.orNull)
      .build()
}
