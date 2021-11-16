package io.burkard.cdk.services.applicationinsights

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubComponentTypeConfigurationProperty {

  def apply(
    subComponentConfigurationDetails: software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentConfigurationDetailsProperty,
    subComponentType: String
  ): software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentTypeConfigurationProperty =
    (new software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentTypeConfigurationProperty.Builder)
      .subComponentConfigurationDetails(subComponentConfigurationDetails)
      .subComponentType(subComponentType)
      .build()
}
