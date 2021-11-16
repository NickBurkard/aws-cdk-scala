package io.burkard.cdk.services.pinpointemail

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DimensionConfigurationProperty {

  def apply(
    defaultDimensionValue: String,
    dimensionValueSource: String,
    dimensionName: String
  ): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.DimensionConfigurationProperty =
    (new software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.DimensionConfigurationProperty.Builder)
      .defaultDimensionValue(defaultDimensionValue)
      .dimensionValueSource(dimensionValueSource)
      .dimensionName(dimensionName)
      .build()
}
