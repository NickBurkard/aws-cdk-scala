package io.burkard.cdk.services.codestarnotifications

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NotificationRuleProps {

  def apply(
    enabled: Option[Boolean] = None,
    detailType: Option[software.amazon.awscdk.services.codestarnotifications.DetailType] = None,
    notificationRuleName: Option[String] = None,
    events: Option[List[String]] = None,
    source: Option[software.amazon.awscdk.services.codestarnotifications.INotificationRuleSource] = None,
    targets: Option[List[_ <: software.amazon.awscdk.services.codestarnotifications.INotificationRuleTarget]] = None
  ): software.amazon.awscdk.services.codestarnotifications.NotificationRuleProps =
    (new software.amazon.awscdk.services.codestarnotifications.NotificationRuleProps.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .detailType(detailType.orNull)
      .notificationRuleName(notificationRuleName.orNull)
      .events(events.map(_.asJava).orNull)
      .source(source.orNull)
      .targets(targets.map(_.asJava).orNull)
      .build()
}
