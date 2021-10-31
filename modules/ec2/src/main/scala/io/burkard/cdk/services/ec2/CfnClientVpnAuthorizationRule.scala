package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnClientVpnAuthorizationRule {

  def apply(
    internalResourceId: String,
    authorizeAllGroups: Option[Boolean] = None,
    clientVpnEndpointId: Option[String] = None,
    accessGroupId: Option[String] = None,
    description: Option[String] = None,
    targetNetworkCidr: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRule =
    software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRule.Builder
      .create(stackCtx, internalResourceId)
      .authorizeAllGroups(authorizeAllGroups.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .clientVpnEndpointId(clientVpnEndpointId.orNull)
      .accessGroupId(accessGroupId.orNull)
      .description(description.orNull)
      .targetNetworkCidr(targetNetworkCidr.orNull)
      .build()
}
