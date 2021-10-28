package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRouteProps {

  def apply(
    instanceId: Option[String] = None,
    routeTableId: Option[String] = None,
    gatewayId: Option[String] = None,
    localGatewayId: Option[String] = None,
    carrierGatewayId: Option[String] = None,
    vpcPeeringConnectionId: Option[String] = None,
    destinationIpv6CidrBlock: Option[String] = None,
    egressOnlyInternetGatewayId: Option[String] = None,
    destinationCidrBlock: Option[String] = None,
    natGatewayId: Option[String] = None,
    vpcEndpointId: Option[String] = None,
    transitGatewayId: Option[String] = None,
    networkInterfaceId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnRouteProps =
    (new software.amazon.awscdk.services.ec2.CfnRouteProps.Builder)
      .instanceId(instanceId.orNull)
      .routeTableId(routeTableId.orNull)
      .gatewayId(gatewayId.orNull)
      .localGatewayId(localGatewayId.orNull)
      .carrierGatewayId(carrierGatewayId.orNull)
      .vpcPeeringConnectionId(vpcPeeringConnectionId.orNull)
      .destinationIpv6CidrBlock(destinationIpv6CidrBlock.orNull)
      .egressOnlyInternetGatewayId(egressOnlyInternetGatewayId.orNull)
      .destinationCidrBlock(destinationCidrBlock.orNull)
      .natGatewayId(natGatewayId.orNull)
      .vpcEndpointId(vpcEndpointId.orNull)
      .transitGatewayId(transitGatewayId.orNull)
      .networkInterfaceId(networkInterfaceId.orNull)
      .build()
}
