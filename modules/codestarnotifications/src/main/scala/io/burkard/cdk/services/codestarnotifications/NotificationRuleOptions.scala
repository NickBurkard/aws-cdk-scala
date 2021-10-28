package io.burkard.cdk.services.codestarnotifications

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NotificationRuleOptions {

  def apply(
    enabled: Option[Boolean] = None,
    detailType: Option[software.amazon.awscdk.services.codestarnotifications.DetailType] = None,
    notificationRuleName: Option[String] = None
  ): software.amazon.awscdk.services.codestarnotifications.NotificationRuleOptions =
    (new software.amazon.awscdk.services.codestarnotifications.NotificationRuleOptions.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .detailType(detailType.orNull)
      .notificationRuleName(notificationRuleName.orNull)
      .build()
}
