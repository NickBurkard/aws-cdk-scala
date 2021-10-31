package io.burkard.cdk.services.codecommit

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RepositoryNotifyOnOptions {

  def apply(
    enabled: Option[Boolean] = None,
    detailType: Option[software.amazon.awscdk.services.codestarnotifications.DetailType] = None,
    notificationRuleName: Option[String] = None,
    events: Option[List[_ <: software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents]] = None
  ): software.amazon.awscdk.services.codecommit.RepositoryNotifyOnOptions =
    (new software.amazon.awscdk.services.codecommit.RepositoryNotifyOnOptions.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .detailType(detailType.orNull)
      .notificationRuleName(notificationRuleName.orNull)
      .events(events.map(_.asJava).orNull)
      .build()
}
