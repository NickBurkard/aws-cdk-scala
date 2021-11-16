package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkLoadBalancerAttributes {

  def apply(
    loadBalancerArn: String,
    loadBalancerDnsName: Option[String] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    loadBalancerCanonicalHostedZoneId: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerAttributes =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerAttributes.Builder)
      .loadBalancerArn(loadBalancerArn)
      .loadBalancerDnsName(loadBalancerDnsName.orNull)
      .vpc(vpc.orNull)
      .loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId.orNull)
      .build()
}
