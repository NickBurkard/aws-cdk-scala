package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DefaultPushNotificationTemplateProperty {

  def apply(
    body: Option[String] = None,
    url: Option[String] = None,
    sound: Option[String] = None,
    title: Option[String] = None,
    action: Option[String] = None
  ): software.amazon.awscdk.services.pinpoint.CfnPushTemplate.DefaultPushNotificationTemplateProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnPushTemplate.DefaultPushNotificationTemplateProperty.Builder)
      .body(body.orNull)
      .url(url.orNull)
      .sound(sound.orNull)
      .title(title.orNull)
      .action(action.orNull)
      .build()
}
