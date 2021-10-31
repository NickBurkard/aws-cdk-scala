package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VpcProps {

  def apply(
    enableDnsSupport: Option[Boolean] = None,
    flowLogs: Option[Map[String, _ <: software.amazon.awscdk.services.ec2.FlowLogOptions]] = None,
    natGateways: Option[Number] = None,
    defaultInstanceTenancy: Option[software.amazon.awscdk.services.ec2.DefaultInstanceTenancy] = None,
    enableDnsHostnames: Option[Boolean] = None,
    gatewayEndpoints: Option[Map[String, _ <: software.amazon.awscdk.services.ec2.GatewayVpcEndpointOptions]] = None,
    natGatewaySubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    subnetConfiguration: Option[List[_ <: software.amazon.awscdk.services.ec2.SubnetConfiguration]] = None,
    vpnConnections: Option[Map[String, _ <: software.amazon.awscdk.services.ec2.VpnConnectionOptions]] = None,
    vpnGateway: Option[Boolean] = None,
    vpnRoutePropagation: Option[List[_ <: software.amazon.awscdk.services.ec2.SubnetSelection]] = None,
    natGatewayProvider: Option[software.amazon.awscdk.services.ec2.NatProvider] = None,
    vpnGatewayAsn: Option[Number] = None,
    cidr: Option[String] = None,
    maxAzs: Option[Number] = None
  ): software.amazon.awscdk.services.ec2.VpcProps =
    (new software.amazon.awscdk.services.ec2.VpcProps.Builder)
      .enableDnsSupport(enableDnsSupport.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .flowLogs(flowLogs.map(_.asJava).orNull)
      .natGateways(natGateways.orNull)
      .defaultInstanceTenancy(defaultInstanceTenancy.orNull)
      .enableDnsHostnames(enableDnsHostnames.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .gatewayEndpoints(gatewayEndpoints.map(_.asJava).orNull)
      .natGatewaySubnets(natGatewaySubnets.orNull)
      .subnetConfiguration(subnetConfiguration.map(_.asJava).orNull)
      .vpnConnections(vpnConnections.map(_.asJava).orNull)
      .vpnGateway(vpnGateway.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .vpnRoutePropagation(vpnRoutePropagation.map(_.asJava).orNull)
      .natGatewayProvider(natGatewayProvider.orNull)
      .vpnGatewayAsn(vpnGatewayAsn.orNull)
      .cidr(cidr.orNull)
      .maxAzs(maxAzs.orNull)
      .build()
}
