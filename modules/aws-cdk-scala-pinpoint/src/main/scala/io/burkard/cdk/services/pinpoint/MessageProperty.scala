package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MessageProperty {

  def apply(
    body: Option[String] = None,
    imageSmallIconUrl: Option[String] = None,
    url: Option[String] = None,
    silentPush: Option[Boolean] = None,
    rawContent: Option[String] = None,
    timeToLive: Option[Number] = None,
    title: Option[String] = None,
    imageUrl: Option[String] = None,
    action: Option[String] = None,
    imageIconUrl: Option[String] = None,
    jsonBody: Option[String] = None,
    mediaUrl: Option[String] = None
  ): software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageProperty.Builder)
      .body(body.orNull)
      .imageSmallIconUrl(imageSmallIconUrl.orNull)
      .url(url.orNull)
      .silentPush(silentPush.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .rawContent(rawContent.orNull)
      .timeToLive(timeToLive.orNull)
      .title(title.orNull)
      .imageUrl(imageUrl.orNull)
      .action(action.orNull)
      .imageIconUrl(imageIconUrl.orNull)
      .jsonBody(jsonBody.orNull)
      .mediaUrl(mediaUrl.orNull)
      .build()
}
