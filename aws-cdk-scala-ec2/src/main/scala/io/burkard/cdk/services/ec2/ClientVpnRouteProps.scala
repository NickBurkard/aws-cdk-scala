package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ClientVpnRouteProps {

  def apply(
    cidr: Option[String] = None,
    description: Option[String] = None,
    clientVpnEndpoint: Option[software.amazon.awscdk.services.ec2.IClientVpnEndpoint] = None,
    target: Option[software.amazon.awscdk.services.ec2.ClientVpnRouteTarget] = None
  ): software.amazon.awscdk.services.ec2.ClientVpnRouteProps =
    (new software.amazon.awscdk.services.ec2.ClientVpnRouteProps.Builder)
      .cidr(cidr.orNull)
      .description(description.orNull)
      .clientVpnEndpoint(clientVpnEndpoint.orNull)
      .target(target.orNull)
      .build()
}
