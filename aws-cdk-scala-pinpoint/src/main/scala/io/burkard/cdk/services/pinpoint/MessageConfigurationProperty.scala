package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MessageConfigurationProperty {

  def apply(
    gcmMessage: Option[software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageProperty] = None,
    smsMessage: Option[software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignSmsMessageProperty] = None,
    emailMessage: Option[software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEmailMessageProperty] = None,
    apnsMessage: Option[software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageProperty] = None,
    admMessage: Option[software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageProperty] = None,
    defaultMessage: Option[software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageProperty] = None,
    baiduMessage: Option[software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageProperty] = None
  ): software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageConfigurationProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageConfigurationProperty.Builder)
      .gcmMessage(gcmMessage.orNull)
      .smsMessage(smsMessage.orNull)
      .emailMessage(emailMessage.orNull)
      .apnsMessage(apnsMessage.orNull)
      .admMessage(admMessage.orNull)
      .defaultMessage(defaultMessage.orNull)
      .baiduMessage(baiduMessage.orNull)
      .build()
}
