package io.burkard.cdk.services.codebuild

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProjectNotifyOnOptions {

  def apply(
    events: List[_ <: software.amazon.awscdk.services.codebuild.ProjectNotificationEvents],
    enabled: Option[Boolean] = None,
    detailType: Option[software.amazon.awscdk.services.codestarnotifications.DetailType] = None,
    notificationRuleName: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.ProjectNotifyOnOptions =
    (new software.amazon.awscdk.services.codebuild.ProjectNotifyOnOptions.Builder)
      .events(events.asJava)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .detailType(detailType.orNull)
      .notificationRuleName(notificationRuleName.orNull)
      .build()
}
