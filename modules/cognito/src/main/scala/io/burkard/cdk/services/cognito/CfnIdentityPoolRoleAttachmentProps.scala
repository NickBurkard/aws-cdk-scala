package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnIdentityPoolRoleAttachmentProps {

  def apply(
    identityPoolId: String,
    roleMappings: Option[Map[String, _]] = None,
    roles: Option[AnyRef] = None
  ): software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps =
    (new software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps.Builder)
      .identityPoolId(identityPoolId)
      .roleMappings(roleMappings.map(_.asJava).orNull)
      .roles(roles.orNull)
      .build()
}
