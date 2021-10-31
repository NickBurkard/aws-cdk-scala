package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AnalysisAclRuleProperty {

  def apply(
    egress: Option[Boolean] = None,
    ruleNumber: Option[Number] = None,
    ruleAction: Option[String] = None,
    protocol: Option[String] = None,
    portRange: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PortRangeProperty] = None,
    cidr: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisAclRuleProperty =
    (new software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisAclRuleProperty.Builder)
      .egress(egress.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ruleNumber(ruleNumber.orNull)
      .ruleAction(ruleAction.orNull)
      .protocol(protocol.orNull)
      .portRange(portRange.orNull)
      .cidr(cidr.orNull)
      .build()
}
