package io.burkard.cdk.services.memorydb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSubnetGroupProps {

  def apply(
    subnetIds: Option[List[String]] = None,
    subnetGroupName: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.memorydb.CfnSubnetGroupProps =
    (new software.amazon.awscdk.services.memorydb.CfnSubnetGroupProps.Builder)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .subnetGroupName(subnetGroupName.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
