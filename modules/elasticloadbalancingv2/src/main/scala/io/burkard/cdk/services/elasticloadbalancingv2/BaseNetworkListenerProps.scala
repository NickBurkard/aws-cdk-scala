package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BaseNetworkListenerProps {

  def apply(
    alpnPolicy: Option[software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy] = None,
    sslPolicy: Option[software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy] = None,
    defaultTargetGroups: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup]] = None,
    defaultAction: Option[software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction] = None,
    port: Option[Number] = None,
    certificates: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate]] = None,
    protocol: Option[software.amazon.awscdk.services.elasticloadbalancingv2.Protocol] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.BaseNetworkListenerProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.BaseNetworkListenerProps.Builder)
      .alpnPolicy(alpnPolicy.orNull)
      .sslPolicy(sslPolicy.orNull)
      .defaultTargetGroups(defaultTargetGroups.map(_.asJava).orNull)
      .defaultAction(defaultAction.orNull)
      .port(port.orNull)
      .certificates(certificates.map(_.asJava).orNull)
      .protocol(protocol.orNull)
      .build()
}
