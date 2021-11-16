package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayMulticastGroupMemberProps {

  def apply(
    groupIpAddress: String,
    transitGatewayMulticastDomainId: String,
    networkInterfaceId: String
  ): software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMemberProps =
    (new software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMemberProps.Builder)
      .groupIpAddress(groupIpAddress)
      .transitGatewayMulticastDomainId(transitGatewayMulticastDomainId)
      .networkInterfaceId(networkInterfaceId)
      .build()
}
