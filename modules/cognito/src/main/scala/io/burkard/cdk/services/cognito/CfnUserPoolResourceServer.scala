package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserPoolResourceServer {

  def apply(
    internalResourceId: String,
    name: String,
    identifier: String,
    userPoolId: String,
    scopes: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer =
    software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .identifier(identifier)
      .userPoolId(userPoolId)
      .scopes(scopes.map(_.asJava).orNull)
      .build()
}
