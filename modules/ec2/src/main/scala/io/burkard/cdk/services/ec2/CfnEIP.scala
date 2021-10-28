package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnEIP {

  def apply(
    internalResourceId: String,
    instanceId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    domain: Option[String] = None,
    publicIpv4Pool: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnEIP =
    software.amazon.awscdk.services.ec2.CfnEIP.Builder
      .create(stackCtx, internalResourceId)
      .instanceId(instanceId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .domain(domain.orNull)
      .publicIpv4Pool(publicIpv4Pool.orNull)
      .build()
}
