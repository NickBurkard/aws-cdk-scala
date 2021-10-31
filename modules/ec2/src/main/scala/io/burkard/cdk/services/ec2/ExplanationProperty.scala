package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ExplanationProperty {

  def apply(
    protocols: Option[List[String]] = None,
    ingressRouteTable: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty] = None,
    attachedTo: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty] = None,
    natGateway: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty] = None,
    vpcEndpoint: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty] = None,
    port: Option[Number] = None,
    networkInterface: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty] = None,
    classicLoadBalancerListener: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerListenerProperty] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty] = None,
    availabilityZones: Option[List[String]] = None,
    internetGateway: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty] = None,
    loadBalancerArn: Option[String] = None,
    sourceVpc: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty] = None,
    packetField: Option[String] = None,
    state: Option[String] = None,
    missingComponent: Option[String] = None,
    elasticLoadBalancerListener: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty] = None,
    subnetRouteTable: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty] = None,
    loadBalancerTarget: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty] = None,
    direction: Option[String] = None,
    loadBalancerListenerPort: Option[Number] = None,
    cidrs: Option[List[String]] = None,
    routeTableRoute: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty] = None,
    acl: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty] = None,
    loadBalancerTargetGroup: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty] = None,
    destinationVpc: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty] = None,
    customerGateway: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty] = None,
    prefixList: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty] = None,
    securityGroupRule: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty] = None,
    vpnConnection: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty] = None,
    aclRule: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisAclRuleProperty] = None,
    securityGroups: Option[List[_]] = None,
    loadBalancerTargetPort: Option[Number] = None,
    address: Option[String] = None,
    subnet: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty] = None,
    routeTable: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty] = None,
    vpnGateway: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty] = None,
    component: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty] = None,
    destination: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty] = None,
    portRanges: Option[List[_]] = None,
    explanationCode: Option[String] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty] = None,
    addresses: Option[List[String]] = None,
    vpcPeeringConnection: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty] = None,
    loadBalancerTargetGroups: Option[List[_]] = None
  ): software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.ExplanationProperty =
    (new software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.ExplanationProperty.Builder)
      .protocols(protocols.map(_.asJava).orNull)
      .ingressRouteTable(ingressRouteTable.orNull)
      .attachedTo(attachedTo.orNull)
      .natGateway(natGateway.orNull)
      .vpcEndpoint(vpcEndpoint.orNull)
      .port(port.orNull)
      .networkInterface(networkInterface.orNull)
      .classicLoadBalancerListener(classicLoadBalancerListener.orNull)
      .vpc(vpc.orNull)
      .availabilityZones(availabilityZones.map(_.asJava).orNull)
      .internetGateway(internetGateway.orNull)
      .loadBalancerArn(loadBalancerArn.orNull)
      .sourceVpc(sourceVpc.orNull)
      .packetField(packetField.orNull)
      .state(state.orNull)
      .missingComponent(missingComponent.orNull)
      .elasticLoadBalancerListener(elasticLoadBalancerListener.orNull)
      .subnetRouteTable(subnetRouteTable.orNull)
      .loadBalancerTarget(loadBalancerTarget.orNull)
      .direction(direction.orNull)
      .loadBalancerListenerPort(loadBalancerListenerPort.orNull)
      .cidrs(cidrs.map(_.asJava).orNull)
      .routeTableRoute(routeTableRoute.orNull)
      .acl(acl.orNull)
      .loadBalancerTargetGroup(loadBalancerTargetGroup.orNull)
      .destinationVpc(destinationVpc.orNull)
      .customerGateway(customerGateway.orNull)
      .prefixList(prefixList.orNull)
      .securityGroupRule(securityGroupRule.orNull)
      .vpnConnection(vpnConnection.orNull)
      .aclRule(aclRule.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .loadBalancerTargetPort(loadBalancerTargetPort.orNull)
      .address(address.orNull)
      .subnet(subnet.orNull)
      .routeTable(routeTable.orNull)
      .vpnGateway(vpnGateway.orNull)
      .component(component.orNull)
      .destination(destination.orNull)
      .portRanges(portRanges.map(_.asJava).orNull)
      .explanationCode(explanationCode.orNull)
      .securityGroup(securityGroup.orNull)
      .addresses(addresses.map(_.asJava).orNull)
      .vpcPeeringConnection(vpcPeeringConnection.orNull)
      .loadBalancerTargetGroups(loadBalancerTargetGroups.map(_.asJava).orNull)
      .build()
}
