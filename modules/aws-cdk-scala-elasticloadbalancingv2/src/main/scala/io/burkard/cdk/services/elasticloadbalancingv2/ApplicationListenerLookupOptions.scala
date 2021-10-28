package io.burkard.cdk.services.elasticloadbalancingv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ApplicationListenerLookupOptions {

  def apply(
    loadBalancerArn: Option[String] = None,
    listenerArn: Option[String] = None,
    listenerProtocol: Option[software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol] = None,
    listenerPort: Option[Number] = None,
    loadBalancerTags: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerLookupOptions =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerLookupOptions.Builder)
      .loadBalancerArn(loadBalancerArn.orNull)
      .listenerArn(listenerArn.orNull)
      .listenerProtocol(listenerProtocol.orNull)
      .listenerPort(listenerPort.orNull)
      .loadBalancerTags(loadBalancerTags.map(_.asJava).orNull)
      .build()
}
