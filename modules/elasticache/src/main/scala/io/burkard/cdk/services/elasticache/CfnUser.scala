package io.burkard.cdk.services.elasticache

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnUser {

  def apply(
    internalResourceId: String,
    passwords: Option[List[String]] = None,
    accessString: Option[String] = None,
    userId: Option[String] = None,
    noPasswordRequired: Option[Boolean] = None,
    userName: Option[String] = None,
    engine: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticache.CfnUser =
    software.amazon.awscdk.services.elasticache.CfnUser.Builder
      .create(stackCtx, internalResourceId)
      .passwords(passwords.map(_.asJava).orNull)
      .accessString(accessString.orNull)
      .userId(userId.orNull)
      .noPasswordRequired(noPasswordRequired.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .userName(userName.orNull)
      .engine(engine.orNull)
      .build()
}
