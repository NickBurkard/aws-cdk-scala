package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTrafficMirrorFilterRule {

  def apply(
    internalResourceId: String,
    destinationPortRange: Option[software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty] = None,
    trafficMirrorFilterId: Option[String] = None,
    sourcePortRange: Option[software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty] = None,
    description: Option[String] = None,
    destinationCidrBlock: Option[String] = None,
    sourceCidrBlock: Option[String] = None,
    trafficDirection: Option[String] = None,
    ruleNumber: Option[Number] = None,
    ruleAction: Option[String] = None,
    protocol: Option[Number] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule =
    software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule.Builder
      .create(stackCtx, internalResourceId)
      .destinationPortRange(destinationPortRange.orNull)
      .trafficMirrorFilterId(trafficMirrorFilterId.orNull)
      .sourcePortRange(sourcePortRange.orNull)
      .description(description.orNull)
      .destinationCidrBlock(destinationCidrBlock.orNull)
      .sourceCidrBlock(sourceCidrBlock.orNull)
      .trafficDirection(trafficDirection.orNull)
      .ruleNumber(ruleNumber.orNull)
      .ruleAction(ruleAction.orNull)
      .protocol(protocol.orNull)
      .build()
}
