package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserPoolResourceServerProps {

  def apply(
    name: Option[String] = None,
    identifier: Option[String] = None,
    scopes: Option[List[_]] = None,
    userPoolId: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPoolResourceServerProps =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolResourceServerProps.Builder)
      .name(name.orNull)
      .identifier(identifier.orNull)
      .scopes(scopes.map(_.asJava).orNull)
      .userPoolId(userPoolId.orNull)
      .build()
}
