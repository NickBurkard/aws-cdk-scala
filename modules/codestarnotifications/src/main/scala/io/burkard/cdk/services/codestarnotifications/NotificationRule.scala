package io.burkard.cdk.services.codestarnotifications

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NotificationRule {

  def apply(
    internalResourceId: String,
    events: List[String],
    source: software.amazon.awscdk.services.codestarnotifications.INotificationRuleSource,
    enabled: Option[Boolean] = None,
    detailType: Option[software.amazon.awscdk.services.codestarnotifications.DetailType] = None,
    notificationRuleName: Option[String] = None,
    targets: Option[List[_ <: software.amazon.awscdk.services.codestarnotifications.INotificationRuleTarget]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codestarnotifications.NotificationRule =
    software.amazon.awscdk.services.codestarnotifications.NotificationRule.Builder
      .create(stackCtx, internalResourceId)
      .events(events.asJava)
      .source(source)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .detailType(detailType.orNull)
      .notificationRuleName(notificationRuleName.orNull)
      .targets(targets.map(_.asJava).orNull)
      .build()
}
