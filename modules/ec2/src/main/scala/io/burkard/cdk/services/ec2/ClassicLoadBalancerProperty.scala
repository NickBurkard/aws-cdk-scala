package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClassicLoadBalancerProperty {

  def apply(
    name: String
  ): software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancerProperty =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancerProperty.Builder)
      .name(name)
      .build()
}
