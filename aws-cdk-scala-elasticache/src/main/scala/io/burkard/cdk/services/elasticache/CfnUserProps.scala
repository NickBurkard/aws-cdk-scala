package io.burkard.cdk.services.elasticache

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnUserProps {

  def apply(
    passwords: Option[List[String]] = None,
    accessString: Option[String] = None,
    userId: Option[String] = None,
    noPasswordRequired: Option[Boolean] = None,
    userName: Option[String] = None,
    engine: Option[String] = None
  ): software.amazon.awscdk.services.elasticache.CfnUserProps =
    (new software.amazon.awscdk.services.elasticache.CfnUserProps.Builder)
      .passwords(passwords.map(_.asJava).orNull)
      .accessString(accessString.orNull)
      .userId(userId.orNull)
      .noPasswordRequired(noPasswordRequired.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .userName(userName.orNull)
      .engine(engine.orNull)
      .build()
}
