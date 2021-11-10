package io.burkard.cdk.services.ec2

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClientVpnRouteProps {

  def apply(
    cidr: Option[String] = None,
    description: Option[String] = None,
    clientVpnEndoint: Option[software.amazon.awscdk.services.ec2.IClientVpnEndpoint] = None,
    clientVpnEndpoint: Option[software.amazon.awscdk.services.ec2.IClientVpnEndpoint] = None,
    target: Option[software.amazon.awscdk.services.ec2.ClientVpnRouteTarget] = None
  ): software.amazon.awscdk.services.ec2.ClientVpnRouteProps =
    (new software.amazon.awscdk.services.ec2.ClientVpnRouteProps.Builder)
      .cidr(cidr.orNull)
      .description(description.orNull)
      .clientVpnEndoint(clientVpnEndoint.orNull)
      .clientVpnEndpoint(clientVpnEndpoint.orNull)
      .target(target.orNull)
      .build()
}
