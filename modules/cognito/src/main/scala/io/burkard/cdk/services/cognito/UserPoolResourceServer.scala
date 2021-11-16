package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UserPoolResourceServer {

  def apply(
    internalResourceId: String,
    userPool: software.amazon.awscdk.services.cognito.IUserPool,
    identifier: Option[String] = None,
    scopes: Option[List[_ <: software.amazon.awscdk.services.cognito.ResourceServerScope]] = None,
    userPoolResourceServerName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cognito.UserPoolResourceServer =
    software.amazon.awscdk.services.cognito.UserPoolResourceServer.Builder
      .create(stackCtx, internalResourceId)
      .userPool(userPool)
      .identifier(identifier.orNull)
      .scopes(scopes.map(_.asJava).orNull)
      .userPoolResourceServerName(userPoolResourceServerName.orNull)
      .build()
}
