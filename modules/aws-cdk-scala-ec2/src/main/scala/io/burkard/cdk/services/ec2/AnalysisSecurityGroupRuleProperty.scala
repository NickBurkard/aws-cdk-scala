package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AnalysisSecurityGroupRuleProperty {

  def apply(
    securityGroupId: Option[String] = None,
    direction: Option[String] = None,
    prefixListId: Option[String] = None,
    protocol: Option[String] = None,
    portRange: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PortRangeProperty] = None,
    cidr: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty =
    (new software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty.Builder)
      .securityGroupId(securityGroupId.orNull)
      .direction(direction.orNull)
      .prefixListId(prefixListId.orNull)
      .protocol(protocol.orNull)
      .portRange(portRange.orNull)
      .cidr(cidr.orNull)
      .build()
}
