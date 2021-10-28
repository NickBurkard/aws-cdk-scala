package io.burkard.cdk.services.elasticloadbalancingv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ApplicationListenerProps {

  def apply(
    sslPolicy: Option[software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy] = None,
    defaultTargetGroups: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup]] = None,
    open: Option[Boolean] = None,
    defaultAction: Option[software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction] = None,
    port: Option[Number] = None,
    protocol: Option[software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol] = None,
    certificates: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate]] = None,
    loadBalancer: Option[software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerProps.Builder)
      .sslPolicy(sslPolicy.orNull)
      .defaultTargetGroups(defaultTargetGroups.map(_.asJava).orNull)
      .open(open.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .defaultAction(defaultAction.orNull)
      .port(port.orNull)
      .protocol(protocol.orNull)
      .certificates(certificates.map(_.asJava).orNull)
      .loadBalancer(loadBalancer.orNull)
      .build()
}
