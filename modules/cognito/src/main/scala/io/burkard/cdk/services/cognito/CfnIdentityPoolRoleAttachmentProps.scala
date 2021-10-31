package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnIdentityPoolRoleAttachmentProps {

  def apply(
    roleMappings: Option[Map[String, _]] = None,
    identityPoolId: Option[String] = None,
    roles: Option[AnyRef] = None
  ): software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps =
    (new software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps.Builder)
      .roleMappings(roleMappings.map(_.asJava).orNull)
      .identityPoolId(identityPoolId.orNull)
      .roles(roles.orNull)
      .build()
}
