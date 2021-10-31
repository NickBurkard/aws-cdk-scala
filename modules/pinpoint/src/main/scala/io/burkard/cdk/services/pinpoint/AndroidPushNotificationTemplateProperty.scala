package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AndroidPushNotificationTemplateProperty {

  def apply(
    body: Option[String] = None,
    url: Option[String] = None,
    smallImageIconUrl: Option[String] = None,
    sound: Option[String] = None,
    title: Option[String] = None,
    imageUrl: Option[String] = None,
    action: Option[String] = None,
    imageIconUrl: Option[String] = None
  ): software.amazon.awscdk.services.pinpoint.CfnPushTemplate.AndroidPushNotificationTemplateProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnPushTemplate.AndroidPushNotificationTemplateProperty.Builder)
      .body(body.orNull)
      .url(url.orNull)
      .smallImageIconUrl(smallImageIconUrl.orNull)
      .sound(sound.orNull)
      .title(title.orNull)
      .imageUrl(imageUrl.orNull)
      .action(action.orNull)
      .imageIconUrl(imageIconUrl.orNull)
      .build()
}
