package io.burkard.cdk.cloudassembly

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoadBalancerFilter {

  def apply(
    loadBalancerType: software.amazon.awscdk.cloudassembly.schema.LoadBalancerType,
    loadBalancerArn: Option[String] = None,
    loadBalancerTags: Option[List[_ <: software.amazon.awscdk.cloudassembly.schema.Tag]] = None
  ): software.amazon.awscdk.cloudassembly.schema.LoadBalancerFilter =
    (new software.amazon.awscdk.cloudassembly.schema.LoadBalancerFilter.Builder)
      .loadBalancerType(loadBalancerType)
      .loadBalancerArn(loadBalancerArn.orNull)
      .loadBalancerTags(loadBalancerTags.map(_.asJava).orNull)
      .build()
}
