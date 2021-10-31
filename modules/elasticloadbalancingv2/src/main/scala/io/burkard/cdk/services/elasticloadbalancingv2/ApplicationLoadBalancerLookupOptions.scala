package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ApplicationLoadBalancerLookupOptions {

  def apply(
    loadBalancerArn: Option[String] = None,
    loadBalancerTags: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerLookupOptions =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerLookupOptions.Builder)
      .loadBalancerArn(loadBalancerArn.orNull)
      .loadBalancerTags(loadBalancerTags.map(_.asJava).orNull)
      .build()
}
