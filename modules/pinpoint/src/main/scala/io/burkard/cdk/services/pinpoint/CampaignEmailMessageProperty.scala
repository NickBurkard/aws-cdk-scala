package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CampaignEmailMessageProperty {

  def apply(
    body: Option[String] = None,
    htmlBody: Option[String] = None,
    fromAddress: Option[String] = None,
    title: Option[String] = None
  ): software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEmailMessageProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEmailMessageProperty.Builder)
      .body(body.orNull)
      .htmlBody(htmlBody.orNull)
      .fromAddress(fromAddress.orNull)
      .title(title.orNull)
      .build()
}
