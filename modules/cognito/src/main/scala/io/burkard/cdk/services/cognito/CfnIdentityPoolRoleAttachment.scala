package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnIdentityPoolRoleAttachment {

  def apply(
    internalResourceId: String,
    identityPoolId: String,
    roleMappings: Option[Map[String, _]] = None,
    roles: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment =
    software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.Builder
      .create(stackCtx, internalResourceId)
      .identityPoolId(identityPoolId)
      .roleMappings(roleMappings.map(_.asJava).orNull)
      .roles(roles.orNull)
      .build()
}
