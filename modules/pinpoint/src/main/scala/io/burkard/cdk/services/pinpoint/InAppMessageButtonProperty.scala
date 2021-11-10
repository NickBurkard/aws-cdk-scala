package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InAppMessageButtonProperty {

  def apply(
    ios: Option[software.amazon.awscdk.services.pinpoint.CfnCampaign.OverrideButtonConfigurationProperty] = None,
    web: Option[software.amazon.awscdk.services.pinpoint.CfnCampaign.OverrideButtonConfigurationProperty] = None,
    defaultConfig: Option[software.amazon.awscdk.services.pinpoint.CfnCampaign.DefaultButtonConfigurationProperty] = None,
    android: Option[software.amazon.awscdk.services.pinpoint.CfnCampaign.OverrideButtonConfigurationProperty] = None
  ): software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageButtonProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageButtonProperty.Builder)
      .ios(ios.orNull)
      .web(web.orNull)
      .defaultConfig(defaultConfig.orNull)
      .android(android.orNull)
      .build()
}
