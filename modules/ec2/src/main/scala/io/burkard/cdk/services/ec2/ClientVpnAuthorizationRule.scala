package io.burkard.cdk.services.ec2

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClientVpnAuthorizationRule {

  def apply(
    internalResourceId: String,
    cidr: Option[String] = None,
    description: Option[String] = None,
    clientVpnEndoint: Option[software.amazon.awscdk.services.ec2.IClientVpnEndpoint] = None,
    groupId: Option[String] = None,
    clientVpnEndpoint: Option[software.amazon.awscdk.services.ec2.IClientVpnEndpoint] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRule =
    software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRule.Builder
      .create(stackCtx, internalResourceId)
      .cidr(cidr.orNull)
      .description(description.orNull)
      .clientVpnEndoint(clientVpnEndoint.orNull)
      .groupId(groupId.orNull)
      .clientVpnEndpoint(clientVpnEndpoint.orNull)
      .build()
}
