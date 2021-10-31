package io.burkard.cdk.services.elasticache

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSubnetGroup {

  def apply(
    internalResourceId: String,
    subnetIds: Option[List[String]] = None,
    cacheSubnetGroupName: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticache.CfnSubnetGroup =
    software.amazon.awscdk.services.elasticache.CfnSubnetGroup.Builder
      .create(stackCtx, internalResourceId)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .cacheSubnetGroupName(cacheSubnetGroupName.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
