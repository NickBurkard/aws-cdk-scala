package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEIPProps {

  def apply(
    instanceId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    domain: Option[String] = None,
    publicIpv4Pool: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnEIPProps =
    (new software.amazon.awscdk.services.ec2.CfnEIPProps.Builder)
      .instanceId(instanceId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .domain(domain.orNull)
      .publicIpv4Pool(publicIpv4Pool.orNull)
      .build()
}
