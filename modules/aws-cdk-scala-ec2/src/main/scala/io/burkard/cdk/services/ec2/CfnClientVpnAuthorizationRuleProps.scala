package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnClientVpnAuthorizationRuleProps {

  def apply(
    authorizeAllGroups: Option[Boolean] = None,
    clientVpnEndpointId: Option[String] = None,
    accessGroupId: Option[String] = None,
    description: Option[String] = None,
    targetNetworkCidr: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRuleProps =
    (new software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRuleProps.Builder)
      .authorizeAllGroups(authorizeAllGroups.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .clientVpnEndpointId(clientVpnEndpointId.orNull)
      .accessGroupId(accessGroupId.orNull)
      .description(description.orNull)
      .targetNetworkCidr(targetNetworkCidr.orNull)
      .build()
}
