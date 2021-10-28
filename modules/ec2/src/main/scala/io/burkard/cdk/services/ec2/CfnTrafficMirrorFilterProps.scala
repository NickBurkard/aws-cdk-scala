package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTrafficMirrorFilterProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    networkServices: Option[List[String]] = None,
    description: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterProps =
    (new software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .networkServices(networkServices.map(_.asJava).orNull)
      .description(description.orNull)
      .build()
}
