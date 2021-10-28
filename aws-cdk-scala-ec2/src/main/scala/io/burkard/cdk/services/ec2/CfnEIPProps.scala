package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
