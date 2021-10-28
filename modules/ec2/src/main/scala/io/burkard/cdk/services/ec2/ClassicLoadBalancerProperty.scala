package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ClassicLoadBalancerProperty {

  def apply(
    name: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancerProperty =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancerProperty.Builder)
      .name(name.orNull)
      .build()
}