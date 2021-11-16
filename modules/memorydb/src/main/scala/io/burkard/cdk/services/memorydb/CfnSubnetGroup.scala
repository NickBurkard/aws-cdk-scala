package io.burkard.cdk.services.memorydb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSubnetGroup {

  def apply(
    internalResourceId: String,
    subnetIds: List[String],
    subnetGroupName: String,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.memorydb.CfnSubnetGroup =
    software.amazon.awscdk.services.memorydb.CfnSubnetGroup.Builder
      .create(stackCtx, internalResourceId)
      .subnetIds(subnetIds.asJava)
      .subnetGroupName(subnetGroupName)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
