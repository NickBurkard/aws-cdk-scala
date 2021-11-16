package io.burkard.cdk.services.amazonmq

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UserProperty {

  def apply(
    username: String,
    password: String,
    consoleAccess: Option[Boolean] = None,
    groups: Option[List[String]] = None
  ): software.amazon.awscdk.services.amazonmq.CfnBroker.UserProperty =
    (new software.amazon.awscdk.services.amazonmq.CfnBroker.UserProperty.Builder)
      .username(username)
      .password(password)
      .consoleAccess(consoleAccess.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .groups(groups.map(_.asJava).orNull)
      .build()
}
