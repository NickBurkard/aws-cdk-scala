package io.burkard.cdk.services.elasticache

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUser {

  def apply(
    internalResourceId: String,
    userId: String,
    userName: String,
    engine: String,
    passwords: Option[List[String]] = None,
    accessString: Option[String] = None,
    noPasswordRequired: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticache.CfnUser =
    software.amazon.awscdk.services.elasticache.CfnUser.Builder
      .create(stackCtx, internalResourceId)
      .userId(userId)
      .userName(userName)
      .engine(engine)
      .passwords(passwords.map(_.asJava).orNull)
      .accessString(accessString.orNull)
      .noPasswordRequired(noPasswordRequired.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
