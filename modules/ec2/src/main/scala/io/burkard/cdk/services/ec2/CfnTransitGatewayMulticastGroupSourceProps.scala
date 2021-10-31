package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayMulticastGroupSourceProps {

  def apply(
    groupIpAddress: Option[String] = None,
    transitGatewayMulticastDomainId: Option[String] = None,
    networkInterfaceId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSourceProps =
    (new software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSourceProps.Builder)
      .groupIpAddress(groupIpAddress.orNull)
      .transitGatewayMulticastDomainId(transitGatewayMulticastDomainId.orNull)
      .networkInterfaceId(networkInterfaceId.orNull)
      .build()
}
