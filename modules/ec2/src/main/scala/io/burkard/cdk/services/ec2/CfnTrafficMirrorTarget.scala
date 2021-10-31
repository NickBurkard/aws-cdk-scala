package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTrafficMirrorTarget {

  def apply(
    internalResourceId: String,
    networkLoadBalancerArn: Option[String] = None,
    networkInterfaceId: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnTrafficMirrorTarget =
    software.amazon.awscdk.services.ec2.CfnTrafficMirrorTarget.Builder
      .create(stackCtx, internalResourceId)
      .networkLoadBalancerArn(networkLoadBalancerArn.orNull)
      .networkInterfaceId(networkInterfaceId.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
