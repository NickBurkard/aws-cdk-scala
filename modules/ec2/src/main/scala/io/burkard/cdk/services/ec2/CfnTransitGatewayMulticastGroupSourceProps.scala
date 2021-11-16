package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayMulticastGroupSourceProps {

  def apply(
    groupIpAddress: String,
    transitGatewayMulticastDomainId: String,
    networkInterfaceId: String
  ): software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSourceProps =
    (new software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSourceProps.Builder)
      .groupIpAddress(groupIpAddress)
      .transitGatewayMulticastDomainId(transitGatewayMulticastDomainId)
      .networkInterfaceId(networkInterfaceId)
      .build()
}
