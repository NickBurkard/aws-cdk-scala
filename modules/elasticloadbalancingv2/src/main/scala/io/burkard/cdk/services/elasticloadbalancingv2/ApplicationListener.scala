package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationListener {

  def apply(
    internalResourceId: String,
    loadBalancer: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer,
    sslPolicy: Option[software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy] = None,
    defaultTargetGroups: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup]] = None,
    open: Option[Boolean] = None,
    defaultAction: Option[software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction] = None,
    port: Option[Number] = None,
    certificateArns: Option[List[String]] = None,
    protocol: Option[software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol] = None,
    certificates: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener =
    software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener.Builder
      .create(stackCtx, internalResourceId)
      .loadBalancer(loadBalancer)
      .sslPolicy(sslPolicy.orNull)
      .defaultTargetGroups(defaultTargetGroups.map(_.asJava).orNull)
      .open(open.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .defaultAction(defaultAction.orNull)
      .port(port.orNull)
      .certificateArns(certificateArns.map(_.asJava).orNull)
      .protocol(protocol.orNull)
      .certificates(certificates.map(_.asJava).orNull)
      .build()
}
