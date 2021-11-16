package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPushTemplateProps {

  def apply(
    templateName: String,
    templateDescription: Option[String] = None,
    defaultSubstitutions: Option[String] = None,
    tags: Option[AnyRef] = None,
    apns: Option[software.amazon.awscdk.services.pinpoint.CfnPushTemplate.APNSPushNotificationTemplateProperty] = None,
    adm: Option[software.amazon.awscdk.services.pinpoint.CfnPushTemplate.AndroidPushNotificationTemplateProperty] = None,
    gcm: Option[software.amazon.awscdk.services.pinpoint.CfnPushTemplate.AndroidPushNotificationTemplateProperty] = None,
    baidu: Option[software.amazon.awscdk.services.pinpoint.CfnPushTemplate.AndroidPushNotificationTemplateProperty] = None,
    defaultValue: Option[software.amazon.awscdk.services.pinpoint.CfnPushTemplate.DefaultPushNotificationTemplateProperty] = None
  ): software.amazon.awscdk.services.pinpoint.CfnPushTemplateProps =
    (new software.amazon.awscdk.services.pinpoint.CfnPushTemplateProps.Builder)
      .templateName(templateName)
      .templateDescription(templateDescription.orNull)
      .defaultSubstitutions(defaultSubstitutions.orNull)
      .tags(tags.orNull)
      .apns(apns.orNull)
      .adm(adm.orNull)
      .gcm(gcm.orNull)
      .baidu(baidu.orNull)
      .defaultValue(defaultValue.orNull)
      .build()
}
