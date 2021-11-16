package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnClientVpnAuthorizationRuleProps {

  def apply(
    clientVpnEndpointId: String,
    targetNetworkCidr: String,
    authorizeAllGroups: Option[Boolean] = None,
    accessGroupId: Option[String] = None,
    description: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRuleProps =
    (new software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRuleProps.Builder)
      .clientVpnEndpointId(clientVpnEndpointId)
      .targetNetworkCidr(targetNetworkCidr)
      .authorizeAllGroups(authorizeAllGroups.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .accessGroupId(accessGroupId.orNull)
      .description(description.orNull)
      .build()
}
