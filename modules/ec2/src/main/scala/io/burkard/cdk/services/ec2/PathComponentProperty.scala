package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PathComponentProperty {

  def apply(
    inboundHeader: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty] = None,
    sourceVpc: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty] = None,
    routeTableRoute: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty] = None,
    destinationVpc: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty] = None,
    subnet: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty] = None,
    sequenceNumber: Option[Number] = None,
    outboundHeader: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty] = None,
    component: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty] = None,
    securityGroupRule: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty] = None,
    aclRule: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisAclRuleProperty] = None
  ): software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PathComponentProperty =
    (new software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PathComponentProperty.Builder)
      .inboundHeader(inboundHeader.orNull)
      .sourceVpc(sourceVpc.orNull)
      .routeTableRoute(routeTableRoute.orNull)
      .destinationVpc(destinationVpc.orNull)
      .vpc(vpc.orNull)
      .subnet(subnet.orNull)
      .sequenceNumber(sequenceNumber.orNull)
      .outboundHeader(outboundHeader.orNull)
      .component(component.orNull)
      .securityGroupRule(securityGroupRule.orNull)
      .aclRule(aclRule.orNull)
      .build()
}
