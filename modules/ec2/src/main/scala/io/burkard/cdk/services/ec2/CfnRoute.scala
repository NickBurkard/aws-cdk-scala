package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRoute {

  def apply(
    internalResourceId: String,
    routeTableId: String,
    instanceId: Option[String] = None,
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
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnRoute =
    software.amazon.awscdk.services.ec2.CfnRoute.Builder
      .create(stackCtx, internalResourceId)
      .routeTableId(routeTableId)
      .instanceId(instanceId.orNull)
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
