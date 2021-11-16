package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserPoolResourceServerProps {

  def apply(
    name: String,
    identifier: String,
    userPoolId: String,
    scopes: Option[List[_]] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPoolResourceServerProps =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolResourceServerProps.Builder)
      .name(name)
      .identifier(identifier)
      .userPoolId(userPoolId)
      .scopes(scopes.map(_.asJava).orNull)
      .build()
}
