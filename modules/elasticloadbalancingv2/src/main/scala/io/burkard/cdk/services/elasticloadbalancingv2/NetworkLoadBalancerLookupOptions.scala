package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkLoadBalancerLookupOptions {

  def apply(
    loadBalancerArn: Option[String] = None,
    loadBalancerTags: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerLookupOptions =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerLookupOptions.Builder)
      .loadBalancerArn(loadBalancerArn.orNull)
      .loadBalancerTags(loadBalancerTags.map(_.asJava).orNull)
      .build()
}
