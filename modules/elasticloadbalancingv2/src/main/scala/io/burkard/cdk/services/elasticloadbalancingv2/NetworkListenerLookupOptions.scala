package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
