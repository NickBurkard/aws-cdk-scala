package io.burkard.cdk.services.cognito

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UserPoolResourceServerProps {

  def apply(
    identifier: Option[String] = None,
    scopes: Option[List[_ <: software.amazon.awscdk.services.cognito.ResourceServerScope]] = None,
    userPoolResourceServerName: Option[String] = None,
    userPool: Option[software.amazon.awscdk.services.cognito.IUserPool] = None
  ): software.amazon.awscdk.services.cognito.UserPoolResourceServerProps =
    (new software.amazon.awscdk.services.cognito.UserPoolResourceServerProps.Builder)
      .identifier(identifier.orNull)
      .scopes(scopes.map(_.asJava).orNull)
      .userPoolResourceServerName(userPoolResourceServerName.orNull)
      .userPool(userPool.orNull)
      .build()
}
