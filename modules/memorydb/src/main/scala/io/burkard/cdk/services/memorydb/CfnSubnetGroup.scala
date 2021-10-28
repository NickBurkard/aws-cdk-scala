package io.burkard.cdk.services.memorydb

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSubnetGroup {

  def apply(
    internalResourceId: String,
    subnetIds: Option[List[String]] = None,
    subnetGroupName: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.memorydb.CfnSubnetGroup =
    software.amazon.awscdk.services.memorydb.CfnSubnetGroup.Builder
      .create(stackCtx, internalResourceId)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .subnetGroupName(subnetGroupName.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
