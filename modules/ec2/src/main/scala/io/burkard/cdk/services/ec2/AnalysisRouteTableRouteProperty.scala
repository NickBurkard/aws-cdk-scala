package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AnalysisRouteTableRouteProperty {

  def apply(
    instanceId: Option[String] = None,
    gatewayId: Option[String] = None,
    vpcPeeringConnectionId: Option[String] = None,
    egressOnlyInternetGatewayId: Option[String] = None,
    origin: Option[String] = None,
    destinationPrefixListId: Option[String] = None,
    natGatewayId: Option[String] = None,
    destinationCidr: Option[String] = None,
    transitGatewayId: Option[String] = None,
    networkInterfaceId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty =
    (new software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty.Builder)
      .instanceId(instanceId.orNull)
      .gatewayId(gatewayId.orNull)
      .vpcPeeringConnectionId(vpcPeeringConnectionId.orNull)
      .egressOnlyInternetGatewayId(egressOnlyInternetGatewayId.orNull)
      .origin(origin.orNull)
      .destinationPrefixListId(destinationPrefixListId.orNull)
      .natGatewayId(natGatewayId.orNull)
      .destinationCidr(destinationCidr.orNull)
      .transitGatewayId(transitGatewayId.orNull)
      .networkInterfaceId(networkInterfaceId.orNull)
      .build()
}
