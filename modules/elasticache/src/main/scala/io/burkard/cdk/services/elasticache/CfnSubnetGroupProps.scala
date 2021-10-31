package io.burkard.cdk.services.elasticache

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSubnetGroupProps {

  def apply(
    subnetIds: Option[List[String]] = None,
    cacheSubnetGroupName: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.elasticache.CfnSubnetGroupProps =
    (new software.amazon.awscdk.services.elasticache.CfnSubnetGroupProps.Builder)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .cacheSubnetGroupName(cacheSubnetGroupName.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
