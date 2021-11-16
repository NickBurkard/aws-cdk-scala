package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UserPoolResourceServerOptions {

  def apply(
    identifier: String,
    scopes: Option[List[_ <: software.amazon.awscdk.services.cognito.ResourceServerScope]] = None,
    userPoolResourceServerName: Option[String] = None
  ): software.amazon.awscdk.services.cognito.UserPoolResourceServerOptions =
    (new software.amazon.awscdk.services.cognito.UserPoolResourceServerOptions.Builder)
      .identifier(identifier)
      .scopes(scopes.map(_.asJava).orNull)
      .userPoolResourceServerName(userPoolResourceServerName.orNull)
      .build()
}
