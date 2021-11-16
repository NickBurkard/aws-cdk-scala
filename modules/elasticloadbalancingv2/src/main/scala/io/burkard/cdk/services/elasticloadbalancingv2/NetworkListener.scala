package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkListener {

  def apply(
    internalResourceId: String,
    loadBalancer: software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer,
    alpnPolicy: Option[software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy] = None,
    sslPolicy: Option[software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy] = None,
    defaultTargetGroups: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup]] = None,
    defaultAction: Option[software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction] = None,
    port: Option[Number] = None,
    protocol: Option[software.amazon.awscdk.services.elasticloadbalancingv2.Protocol] = None,
    certificates: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener =
    software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener.Builder
      .create(stackCtx, internalResourceId)
      .loadBalancer(loadBalancer)
      .alpnPolicy(alpnPolicy.orNull)
      .sslPolicy(sslPolicy.orNull)
      .defaultTargetGroups(defaultTargetGroups.map(_.asJava).orNull)
      .defaultAction(defaultAction.orNull)
      .port(port.orNull)
      .protocol(protocol.orNull)
      .certificates(certificates.map(_.asJava).orNull)
      .build()
}
