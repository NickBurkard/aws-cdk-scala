package io.burkard.cdk.services.codestarnotifications

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NotificationRule {

  def apply(
    internalResourceId: String,
    enabled: Option[Boolean] = None,
    detailType: Option[software.amazon.awscdk.services.codestarnotifications.DetailType] = None,
    notificationRuleName: Option[String] = None,
    events: Option[List[String]] = None,
    source: Option[software.amazon.awscdk.services.codestarnotifications.INotificationRuleSource] = None,
    targets: Option[List[_ <: software.amazon.awscdk.services.codestarnotifications.INotificationRuleTarget]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codestarnotifications.NotificationRule =
    software.amazon.awscdk.services.codestarnotifications.NotificationRule.Builder
      .create(stackCtx, internalResourceId)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .detailType(detailType.orNull)
      .notificationRuleName(notificationRuleName.orNull)
      .events(events.map(_.asJava).orNull)
      .source(source.orNull)
      .targets(targets.map(_.asJava).orNull)
      .build()
}
