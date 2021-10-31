package io.burkard.cdk.services.applicationinsights

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ComponentMonitoringSettingProperty {

  def apply(
    tier: Option[String] = None,
    defaultOverwriteComponentConfiguration: Option[software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentConfigurationProperty] = None,
    componentConfigurationMode: Option[String] = None,
    customComponentConfiguration: Option[software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentConfigurationProperty] = None,
    componentArn: Option[String] = None,
    componentName: Option[String] = None
  ): software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentMonitoringSettingProperty =
    (new software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentMonitoringSettingProperty.Builder)
      .tier(tier.orNull)
      .defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration.orNull)
      .componentConfigurationMode(componentConfigurationMode.orNull)
      .customComponentConfiguration(customComponentConfiguration.orNull)
      .componentArn(componentArn.orNull)
      .componentName(componentName.orNull)
      .build()
}
