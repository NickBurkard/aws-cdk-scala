package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BaseApplicationListenerProps {

  def apply(
    sslPolicy: Option[software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy] = None,
    defaultTargetGroups: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup]] = None,
    open: Option[Boolean] = None,
    defaultAction: Option[software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction] = None,
    port: Option[Number] = None,
    certificates: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate]] = None,
    certificateArns: Option[List[String]] = None,
    protocol: Option[software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerProps.Builder)
      .sslPolicy(sslPolicy.orNull)
      .defaultTargetGroups(defaultTargetGroups.map(_.asJava).orNull)
      .open(open.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .defaultAction(defaultAction.orNull)
      .port(port.orNull)
      .certificates(certificates.map(_.asJava).orNull)
      .certificateArns(certificateArns.map(_.asJava).orNull)
      .protocol(protocol.orNull)
      .build()
}
