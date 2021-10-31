package io.burkard.cdk.services.globalaccelerator

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationLoadBalancerEndpoint {

  def apply(
    loadBalancer: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer,
    weight: Option[Number] = None,
    preserveClientIp: Option[Boolean] = None
  ): software.amazon.awscdk.services.globalaccelerator.endpoints.ApplicationLoadBalancerEndpoint =
    software.amazon.awscdk.services.globalaccelerator.endpoints.ApplicationLoadBalancerEndpoint.Builder
      .create(loadBalancer)
      .weight(weight.orNull)
      .preserveClientIp(preserveClientIp.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
