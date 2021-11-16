package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TrafficMirrorPortRangeProperty {

  def apply(
    toPort: Number,
    fromPort: Number
  ): software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty =
    (new software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty.Builder)
      .toPort(toPort)
      .fromPort(fromPort)
      .build()
}
