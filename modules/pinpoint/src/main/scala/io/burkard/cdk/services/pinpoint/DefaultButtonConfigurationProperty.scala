package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DefaultButtonConfigurationProperty {

  def apply(
    backgroundColor: Option[String] = None,
    buttonAction: Option[String] = None,
    textColor: Option[String] = None,
    link: Option[String] = None,
    text: Option[String] = None,
    borderRadius: Option[Number] = None
  ): software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.DefaultButtonConfigurationProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.DefaultButtonConfigurationProperty.Builder)
      .backgroundColor(backgroundColor.orNull)
      .buttonAction(buttonAction.orNull)
      .textColor(textColor.orNull)
      .link(link.orNull)
      .text(text.orNull)
      .borderRadius(borderRadius.orNull)
      .build()
}
