package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationLoadBalancerAttributes {

  def apply(
    securityGroupId: String,
    loadBalancerArn: String,
    loadBalancerDnsName: Option[String] = None,
    securityGroupAllowsAllOutbound: Option[Boolean] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    loadBalancerCanonicalHostedZoneId: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerAttributes =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerAttributes.Builder)
      .securityGroupId(securityGroupId)
      .loadBalancerArn(loadBalancerArn)
      .loadBalancerDnsName(loadBalancerDnsName.orNull)
      .securityGroupAllowsAllOutbound(securityGroupAllowsAllOutbound.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .vpc(vpc.orNull)
      .loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId.orNull)
      .build()
}
