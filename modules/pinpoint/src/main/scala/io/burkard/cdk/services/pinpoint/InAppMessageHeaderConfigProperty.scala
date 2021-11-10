package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InAppMessageHeaderConfigProperty {

  def apply(
    textColor: Option[String] = None,
    alignment: Option[String] = None,
    header: Option[String] = None
  ): software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageHeaderConfigProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageHeaderConfigProperty.Builder)
      .textColor(textColor.orNull)
      .alignment(alignment.orNull)
      .header(header.orNull)
      .build()
}
