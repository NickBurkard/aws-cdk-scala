package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ButtonConfigProperty {

  def apply(
    ios: Option[software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.OverrideButtonConfigurationProperty] = None,
    web: Option[software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.OverrideButtonConfigurationProperty] = None,
    defaultConfig: Option[software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.DefaultButtonConfigurationProperty] = None,
    android: Option[software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.OverrideButtonConfigurationProperty] = None
  ): software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.ButtonConfigProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.ButtonConfigProperty.Builder)
      .ios(ios.orNull)
      .web(web.orNull)
      .defaultConfig(defaultConfig.orNull)
      .android(android.orNull)
      .build()
}
