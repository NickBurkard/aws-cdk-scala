package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object APNSPushNotificationTemplateProperty {

  def apply(
    body: Option[String] = None,
    url: Option[String] = None,
    mediaUrl: Option[String] = None,
    sound: Option[String] = None,
    title: Option[String] = None,
    action: Option[String] = None
  ): software.amazon.awscdk.services.pinpoint.CfnPushTemplate.APNSPushNotificationTemplateProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnPushTemplate.APNSPushNotificationTemplateProperty.Builder)
      .body(body.orNull)
      .url(url.orNull)
      .mediaUrl(mediaUrl.orNull)
      .sound(sound.orNull)
      .title(title.orNull)
      .action(action.orNull)
      .build()
}
