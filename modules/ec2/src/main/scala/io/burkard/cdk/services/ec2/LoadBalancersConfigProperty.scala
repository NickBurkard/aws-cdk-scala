package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoadBalancersConfigProperty {

  def apply(
    targetGroupsConfig: Option[software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupsConfigProperty] = None,
    classicLoadBalancersConfig: Option[software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancersConfigProperty] = None
  ): software.amazon.awscdk.services.ec2.CfnSpotFleet.LoadBalancersConfigProperty =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleet.LoadBalancersConfigProperty.Builder)
      .targetGroupsConfig(targetGroupsConfig.orNull)
      .classicLoadBalancersConfig(classicLoadBalancersConfig.orNull)
      .build()
}
