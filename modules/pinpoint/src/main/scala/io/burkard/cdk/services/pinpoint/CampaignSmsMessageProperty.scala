package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CampaignSmsMessageProperty {

  def apply(
    entityId: Option[String] = None,
    body: Option[String] = None,
    originationNumber: Option[String] = None,
    templateId: Option[String] = None,
    messageType: Option[String] = None,
    senderId: Option[String] = None
  ): software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignSmsMessageProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignSmsMessageProperty.Builder)
      .entityId(entityId.orNull)
      .body(body.orNull)
      .originationNumber(originationNumber.orNull)
      .templateId(templateId.orNull)
      .messageType(messageType.orNull)
      .senderId(senderId.orNull)
      .build()
}
