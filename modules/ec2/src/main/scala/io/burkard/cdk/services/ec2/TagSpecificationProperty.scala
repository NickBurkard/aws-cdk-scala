package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TagSpecificationProperty {

  def apply(
    resourceType: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.ec2.CfnEC2Fleet.TagSpecificationProperty =
    (new software.amazon.awscdk.services.ec2.CfnEC2Fleet.TagSpecificationProperty.Builder)
      .resourceType(resourceType.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
