package io.burkard.cdk.services.codecommit

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RepositoryNotifyOnOptions {

  def apply(
    events: List[_ <: software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents],
    enabled: Option[Boolean] = None,
    detailType: Option[software.amazon.awscdk.services.codestarnotifications.DetailType] = None,
    notificationRuleName: Option[String] = None
  ): software.amazon.awscdk.services.codecommit.RepositoryNotifyOnOptions =
    (new software.amazon.awscdk.services.codecommit.RepositoryNotifyOnOptions.Builder)
      .events(events.asJava)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .detailType(detailType.orNull)
      .notificationRuleName(notificationRuleName.orNull)
      .build()
}
