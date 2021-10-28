package io.burkard.cdk.services.cognito

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UserPoolResourceServerOptions {

  def apply(
    identifier: Option[String] = None,
    scopes: Option[List[_ <: software.amazon.awscdk.services.cognito.ResourceServerScope]] = None,
    userPoolResourceServerName: Option[String] = None
  ): software.amazon.awscdk.services.cognito.UserPoolResourceServerOptions =
    (new software.amazon.awscdk.services.cognito.UserPoolResourceServerOptions.Builder)
      .identifier(identifier.orNull)
      .scopes(scopes.map(_.asJava).orNull)
      .userPoolResourceServerName(userPoolResourceServerName.orNull)
      .build()
}
