package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NetworkLoadBalancerProps {

  def apply(
    internetFacing: Option[Boolean] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    deletionProtection: Option[Boolean] = None,
    loadBalancerName: Option[String] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    crossZoneEnabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerProps.Builder)
      .internetFacing(internetFacing.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .vpcSubnets(vpcSubnets.orNull)
      .deletionProtection(deletionProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .loadBalancerName(loadBalancerName.orNull)
      .vpc(vpc.orNull)
      .crossZoneEnabled(crossZoneEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
