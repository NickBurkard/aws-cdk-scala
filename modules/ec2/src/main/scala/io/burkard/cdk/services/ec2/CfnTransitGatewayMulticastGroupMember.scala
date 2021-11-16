package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayMulticastGroupMember {

  def apply(
    internalResourceId: String,
    groupIpAddress: String,
    transitGatewayMulticastDomainId: String,
    networkInterfaceId: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMember =
    software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMember.Builder
      .create(stackCtx, internalResourceId)
      .groupIpAddress(groupIpAddress)
      .transitGatewayMulticastDomainId(transitGatewayMulticastDomainId)
      .networkInterfaceId(networkInterfaceId)
      .build()
}
