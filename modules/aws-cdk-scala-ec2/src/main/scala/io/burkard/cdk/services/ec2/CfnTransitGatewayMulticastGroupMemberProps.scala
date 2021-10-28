package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTransitGatewayMulticastGroupMemberProps {

  def apply(
    groupIpAddress: Option[String] = None,
    transitGatewayMulticastDomainId: Option[String] = None,
    networkInterfaceId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMemberProps =
    (new software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMemberProps.Builder)
      .groupIpAddress(groupIpAddress.orNull)
      .transitGatewayMulticastDomainId(transitGatewayMulticastDomainId.orNull)
      .networkInterfaceId(networkInterfaceId.orNull)
      .build()
}
