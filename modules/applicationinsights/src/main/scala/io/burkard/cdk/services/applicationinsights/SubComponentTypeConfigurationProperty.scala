package io.burkard.cdk.services.applicationinsights

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubComponentTypeConfigurationProperty {

  def apply(
    subComponentConfigurationDetails: Option[software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentConfigurationDetailsProperty] = None,
    subComponentType: Option[String] = None
  ): software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentTypeConfigurationProperty =
    (new software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentTypeConfigurationProperty.Builder)
      .subComponentConfigurationDetails(subComponentConfigurationDetails.orNull)
      .subComponentType(subComponentType.orNull)
      .build()
}
