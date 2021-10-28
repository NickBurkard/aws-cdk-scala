package io.burkard.cdk.services.codebuild

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ProjectNotifyOnOptions {

  def apply(
    enabled: Option[Boolean] = None,
    detailType: Option[software.amazon.awscdk.services.codestarnotifications.DetailType] = None,
    notificationRuleName: Option[String] = None,
    events: Option[List[_ <: software.amazon.awscdk.services.codebuild.ProjectNotificationEvents]] = None
  ): software.amazon.awscdk.services.codebuild.ProjectNotifyOnOptions =
    (new software.amazon.awscdk.services.codebuild.ProjectNotifyOnOptions.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .detailType(detailType.orNull)
      .notificationRuleName(notificationRuleName.orNull)
      .events(events.map(_.asJava).orNull)
      .build()
}
