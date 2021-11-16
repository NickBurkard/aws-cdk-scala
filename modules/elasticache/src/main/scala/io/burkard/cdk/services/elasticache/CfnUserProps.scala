package io.burkard.cdk.services.elasticache

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserProps {

  def apply(
    userId: String,
    userName: String,
    engine: String,
    passwords: Option[List[String]] = None,
    accessString: Option[String] = None,
    noPasswordRequired: Option[Boolean] = None
  ): software.amazon.awscdk.services.elasticache.CfnUserProps =
    (new software.amazon.awscdk.services.elasticache.CfnUserProps.Builder)
      .userId(userId)
      .userName(userName)
      .engine(engine)
      .passwords(passwords.map(_.asJava).orNull)
      .accessString(accessString.orNull)
      .noPasswordRequired(noPasswordRequired.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
