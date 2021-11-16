package io.burkard.cdk.services.elasticache

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnParameterGroupProps {

  def apply(
    cacheParameterGroupFamily: String,
    description: String,
    properties: Option[Map[String, String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.elasticache.CfnParameterGroupProps =
    (new software.amazon.awscdk.services.elasticache.CfnParameterGroupProps.Builder)
      .cacheParameterGroupFamily(cacheParameterGroupFamily)
      .description(description)
      .properties(properties.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
