package io.burkard.cdk.cloudassembly

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LoadBalancerFilter {

  def apply(
    loadBalancerArn: Option[String] = None,
    loadBalancerType: Option[software.amazon.awscdk.cloudassembly.schema.LoadBalancerType] = None,
    loadBalancerTags: Option[List[_ <: software.amazon.awscdk.cloudassembly.schema.Tag]] = None
  ): software.amazon.awscdk.cloudassembly.schema.LoadBalancerFilter =
    (new software.amazon.awscdk.cloudassembly.schema.LoadBalancerFilter.Builder)
      .loadBalancerArn(loadBalancerArn.orNull)
      .loadBalancerType(loadBalancerType.orNull)
      .loadBalancerTags(loadBalancerTags.map(_.asJava).orNull)
      .build()
}
