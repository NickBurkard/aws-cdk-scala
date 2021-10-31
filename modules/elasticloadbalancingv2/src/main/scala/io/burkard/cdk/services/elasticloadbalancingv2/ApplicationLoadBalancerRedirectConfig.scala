package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationLoadBalancerRedirectConfig {

  def apply(
    targetProtocol: Option[software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol] = None,
    sourceProtocol: Option[software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol] = None,
    open: Option[Boolean] = None,
    targetPort: Option[Number] = None,
    sourcePort: Option[Number] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerRedirectConfig =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerRedirectConfig.Builder)
      .targetProtocol(targetProtocol.orNull)
      .sourceProtocol(sourceProtocol.orNull)
      .open(open.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .targetPort(targetPort.orNull)
      .sourcePort(sourcePort.orNull)
      .build()
}
