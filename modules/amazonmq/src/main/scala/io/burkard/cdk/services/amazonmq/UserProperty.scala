package io.burkard.cdk.services.amazonmq

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UserProperty {

  def apply(
    username: Option[String] = None,
    consoleAccess: Option[Boolean] = None,
    groups: Option[List[String]] = None,
    password: Option[String] = None
  ): software.amazon.awscdk.services.amazonmq.CfnBroker.UserProperty =
    (new software.amazon.awscdk.services.amazonmq.CfnBroker.UserProperty.Builder)
      .username(username.orNull)
      .consoleAccess(consoleAccess.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .groups(groups.map(_.asJava).orNull)
      .password(password.orNull)
      .build()
}
