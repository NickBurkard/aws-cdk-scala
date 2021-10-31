package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationLoadBalancerAttributes {

  def apply(
    securityGroupId: Option[String] = None,
    loadBalancerDnsName: Option[String] = None,
    loadBalancerArn: Option[String] = None,
    securityGroupAllowsAllOutbound: Option[Boolean] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    loadBalancerCanonicalHostedZoneId: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerAttributes =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerAttributes.Builder)
      .securityGroupId(securityGroupId.orNull)
      .loadBalancerDnsName(loadBalancerDnsName.orNull)
      .loadBalancerArn(loadBalancerArn.orNull)
      .securityGroupAllowsAllOutbound(securityGroupAllowsAllOutbound.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .vpc(vpc.orNull)
      .loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId.orNull)
      .build()
}
