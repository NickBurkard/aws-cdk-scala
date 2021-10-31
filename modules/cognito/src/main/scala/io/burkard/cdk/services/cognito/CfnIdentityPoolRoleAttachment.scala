package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnIdentityPoolRoleAttachment {

  def apply(
    internalResourceId: String,
    roleMappings: Option[Map[String, _]] = None,
    identityPoolId: Option[String] = None,
    roles: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment =
    software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.Builder
      .create(stackCtx, internalResourceId)
      .roleMappings(roleMappings.map(_.asJava).orNull)
      .identityPoolId(identityPoolId.orNull)
      .roles(roles.orNull)
      .build()
}
