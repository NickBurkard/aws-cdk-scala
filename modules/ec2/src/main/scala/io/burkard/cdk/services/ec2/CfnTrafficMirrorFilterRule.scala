package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTrafficMirrorFilterRule {

  def apply(
    internalResourceId: String,
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
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule =
    software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule.Builder
      .create(stackCtx, internalResourceId)
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
