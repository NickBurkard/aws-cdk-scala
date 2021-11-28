package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InAppMessageContentProperty {

  def apply(
    backgroundColor: Option[String] = None,
    headerConfig: Option[software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageHeaderConfigProperty] = None,
    imageUrl: Option[String] = None,
    primaryBtn: Option[software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageButtonProperty] = None,
    secondaryBtn: Option[software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageButtonProperty] = None,
    bodyConfig: Option[software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageBodyConfigProperty] = None
  ): software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageContentProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageContentProperty.Builder)
      .backgroundColor(backgroundColor.orNull)
      .headerConfig(headerConfig.orNull)
      .imageUrl(imageUrl.orNull)
      .primaryBtn(primaryBtn.orNull)
      .secondaryBtn(secondaryBtn.orNull)
      .bodyConfig(bodyConfig.orNull)
      .build()
}
