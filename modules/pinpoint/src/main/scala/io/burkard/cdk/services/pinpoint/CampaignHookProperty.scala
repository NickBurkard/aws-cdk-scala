package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CampaignHookProperty {

  def apply(
    webUrl: Option[String] = None,
    lambdaFunctionName: Option[String] = None,
    mode: Option[String] = None
  ): software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignHookProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignHookProperty.Builder)
      .webUrl(webUrl.orNull)
      .lambdaFunctionName(lambdaFunctionName.orNull)
      .mode(mode.orNull)
      .build()
}