package io.burkard.cdk.services.elasticache

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSubnetGroup {

  def apply(
    internalResourceId: String,
    subnetIds: List[String],
    description: String,
    cacheSubnetGroupName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticache.CfnSubnetGroup =
    software.amazon.awscdk.services.elasticache.CfnSubnetGroup.Builder
      .create(stackCtx, internalResourceId)
      .subnetIds(subnetIds.asJava)
      .description(description)
      .cacheSubnetGroupName(cacheSubnetGroupName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
