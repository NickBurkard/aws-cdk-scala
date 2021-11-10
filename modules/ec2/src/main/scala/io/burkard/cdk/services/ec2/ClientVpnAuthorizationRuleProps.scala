package io.burkard.cdk.services.ec2

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClientVpnAuthorizationRuleProps {

  def apply(
    cidr: Option[String] = None,
    description: Option[String] = None,
    clientVpnEndoint: Option[software.amazon.awscdk.services.ec2.IClientVpnEndpoint] = None,
    groupId: Option[String] = None,
    clientVpnEndpoint: Option[software.amazon.awscdk.services.ec2.IClientVpnEndpoint] = None
  ): software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleProps =
    (new software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleProps.Builder)
      .cidr(cidr.orNull)
      .description(description.orNull)
      .clientVpnEndoint(clientVpnEndoint.orNull)
      .groupId(groupId.orNull)
      .clientVpnEndpoint(clientVpnEndpoint.orNull)
      .build()
}
