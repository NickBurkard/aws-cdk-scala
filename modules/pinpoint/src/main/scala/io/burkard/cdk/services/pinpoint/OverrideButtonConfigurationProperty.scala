package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OverrideButtonConfigurationProperty {

  def apply(
    buttonAction: Option[String] = None,
    link: Option[String] = None
  ): software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.OverrideButtonConfigurationProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.OverrideButtonConfigurationProperty.Builder)
      .buttonAction(buttonAction.orNull)
      .link(link.orNull)
      .build()
}
