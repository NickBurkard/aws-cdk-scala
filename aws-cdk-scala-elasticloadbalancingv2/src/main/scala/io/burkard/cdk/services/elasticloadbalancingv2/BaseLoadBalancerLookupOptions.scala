package io.burkard.cdk.services.elasticloadbalancingv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BaseLoadBalancerLookupOptions {

  def apply(
    loadBalancerArn: Option[String] = None,
    loadBalancerTags: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerLookupOptions =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerLookupOptions.Builder)
      .loadBalancerArn(loadBalancerArn.orNull)
      .loadBalancerTags(loadBalancerTags.map(_.asJava).orNull)
      .build()
}
