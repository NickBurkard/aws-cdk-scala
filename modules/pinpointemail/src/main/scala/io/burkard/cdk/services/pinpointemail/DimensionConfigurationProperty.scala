package io.burkard.cdk.services.pinpointemail

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DimensionConfigurationProperty {

  def apply(
    defaultDimensionValue: Option[String] = None,
    dimensionValueSource: Option[String] = None,
    dimensionName: Option[String] = None
  ): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.DimensionConfigurationProperty =
    (new software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.DimensionConfigurationProperty.Builder)
      .defaultDimensionValue(defaultDimensionValue.orNull)
      .dimensionValueSource(dimensionValueSource.orNull)
      .dimensionName(dimensionName.orNull)
      .build()
}
