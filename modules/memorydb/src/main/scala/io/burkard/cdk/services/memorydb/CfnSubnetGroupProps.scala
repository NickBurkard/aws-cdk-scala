package io.burkard.cdk.services.memorydb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSubnetGroupProps {

  def apply(
    subnetIds: List[String],
    subnetGroupName: String,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.memorydb.CfnSubnetGroupProps =
    (new software.amazon.awscdk.services.memorydb.CfnSubnetGroupProps.Builder)
      .subnetIds(subnetIds.asJava)
      .subnetGroupName(subnetGroupName)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
