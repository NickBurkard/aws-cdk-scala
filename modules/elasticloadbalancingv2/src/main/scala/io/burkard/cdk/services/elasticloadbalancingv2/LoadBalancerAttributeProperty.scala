package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoadBalancerAttributeProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.LoadBalancerAttributeProperty =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.LoadBalancerAttributeProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
