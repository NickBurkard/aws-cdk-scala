package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnUserPoolResourceServer {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    identifier: Option[String] = None,
    scopes: Option[List[_]] = None,
    userPoolId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer =
    software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .identifier(identifier.orNull)
      .scopes(scopes.map(_.asJava).orNull)
      .userPoolId(userPoolId.orNull)
      .build()
}
