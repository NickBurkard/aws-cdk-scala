package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ClientVpnAuthorizationRuleProps {

  def apply(
    cidr: Option[String] = None,
    description: Option[String] = None,
    groupId: Option[String] = None,
    clientVpnEndpoint: Option[software.amazon.awscdk.services.ec2.IClientVpnEndpoint] = None
  ): software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleProps =
    (new software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleProps.Builder)
      .cidr(cidr.orNull)
      .description(description.orNull)
      .groupId(groupId.orNull)
      .clientVpnEndpoint(clientVpnEndpoint.orNull)
      .build()
}
