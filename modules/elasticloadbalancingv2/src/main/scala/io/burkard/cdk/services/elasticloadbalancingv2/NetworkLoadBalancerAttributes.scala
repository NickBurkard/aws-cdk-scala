package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkLoadBalancerAttributes {

  def apply(
    loadBalancerDnsName: Option[String] = None,
    loadBalancerArn: Option[String] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    loadBalancerCanonicalHostedZoneId: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerAttributes =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerAttributes.Builder)
      .loadBalancerDnsName(loadBalancerDnsName.orNull)
      .loadBalancerArn(loadBalancerArn.orNull)
      .vpc(vpc.orNull)
      .loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId.orNull)
      .build()
}
