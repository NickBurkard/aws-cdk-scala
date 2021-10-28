package io.burkard.cdk.services.elasticloadbalancingv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NetworkListenerLookupOptions {

  def apply(
    loadBalancerArn: Option[String] = None,
    listenerProtocol: Option[software.amazon.awscdk.services.elasticloadbalancingv2.Protocol] = None,
    listenerPort: Option[Number] = None,
    loadBalancerTags: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerLookupOptions =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerLookupOptions.Builder)
      .loadBalancerArn(loadBalancerArn.orNull)
      .listenerProtocol(listenerProtocol.orNull)
      .listenerPort(listenerPort.orNull)
      .loadBalancerTags(loadBalancerTags.map(_.asJava).orNull)
      .build()
}
