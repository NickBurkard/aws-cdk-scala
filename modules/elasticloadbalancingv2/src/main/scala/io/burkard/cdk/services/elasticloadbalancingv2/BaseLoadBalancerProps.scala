package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BaseLoadBalancerProps {

  def apply(
    vpc: software.amazon.awscdk.services.ec2.IVpc,
    internetFacing: Option[Boolean] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    deletionProtection: Option[Boolean] = None,
    loadBalancerName: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerProps.Builder)
      .vpc(vpc)
      .internetFacing(internetFacing.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .vpcSubnets(vpcSubnets.orNull)
      .deletionProtection(deletionProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .loadBalancerName(loadBalancerName.orNull)
      .build()
}
