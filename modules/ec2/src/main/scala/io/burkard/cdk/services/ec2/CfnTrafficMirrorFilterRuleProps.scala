package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTrafficMirrorFilterRuleProps {

  def apply(
    trafficMirrorFilterId: String,
    destinationCidrBlock: String,
    sourceCidrBlock: String,
    trafficDirection: String,
    ruleNumber: Number,
    ruleAction: String,
    destinationPortRange: Option[software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty] = None,
    sourcePortRange: Option[software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty] = None,
    description: Option[String] = None,
    protocol: Option[Number] = None
  ): software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRuleProps =
    (new software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRuleProps.Builder)
      .trafficMirrorFilterId(trafficMirrorFilterId)
      .destinationCidrBlock(destinationCidrBlock)
      .sourceCidrBlock(sourceCidrBlock)
      .trafficDirection(trafficDirection)
      .ruleNumber(ruleNumber)
      .ruleAction(ruleAction)
      .destinationPortRange(destinationPortRange.orNull)
      .sourcePortRange(sourcePortRange.orNull)
      .description(description.orNull)
      .protocol(protocol.orNull)
      .build()
}
