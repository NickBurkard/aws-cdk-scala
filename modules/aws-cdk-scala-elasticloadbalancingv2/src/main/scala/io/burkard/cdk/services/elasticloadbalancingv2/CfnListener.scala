package io.burkard.cdk.services.elasticloadbalancingv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnListener {

  def apply(
    internalResourceId: String,
    defaultActions: Option[List[_]] = None,
    sslPolicy: Option[String] = None,
    port: Option[Number] = None,
    certificates: Option[List[_]] = None,
    protocol: Option[String] = None,
    loadBalancerArn: Option[String] = None,
    alpnPolicy: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener =
    software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.Builder
      .create(stackCtx, internalResourceId)
      .defaultActions(defaultActions.map(_.asJava).orNull)
      .sslPolicy(sslPolicy.orNull)
      .port(port.orNull)
      .certificates(certificates.map(_.asJava).orNull)
      .protocol(protocol.orNull)
      .loadBalancerArn(loadBalancerArn.orNull)
      .alpnPolicy(alpnPolicy.map(_.asJava).orNull)
      .build()
}
