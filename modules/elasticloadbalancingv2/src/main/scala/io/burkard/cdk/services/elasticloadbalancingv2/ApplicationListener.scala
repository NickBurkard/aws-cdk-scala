package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ApplicationListener {

  def apply(
    internalResourceId: String,
    sslPolicy: Option[software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy] = None,
    defaultTargetGroups: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup]] = None,
    open: Option[Boolean] = None,
    defaultAction: Option[software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction] = None,
    port: Option[Number] = None,
    protocol: Option[software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol] = None,
    certificates: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate]] = None,
    loadBalancer: Option[software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener =
    software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener.Builder
      .create(stackCtx, internalResourceId)
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
