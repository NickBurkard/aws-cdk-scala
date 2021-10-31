package io.burkard.cdk.services.elasticache

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnParameterGroupProps {

  def apply(
    properties: Option[Map[String, String]] = None,
    cacheParameterGroupFamily: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.elasticache.CfnParameterGroupProps =
    (new software.amazon.awscdk.services.elasticache.CfnParameterGroupProps.Builder)
      .properties(properties.map(_.asJava).orNull)
      .cacheParameterGroupFamily(cacheParameterGroupFamily.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
