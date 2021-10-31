package io.burkard.cdk.services.elasticache

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnParameterGroup {

  def apply(
    internalResourceId: String,
    properties: Option[Map[String, String]] = None,
    cacheParameterGroupFamily: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticache.CfnParameterGroup =
    software.amazon.awscdk.services.elasticache.CfnParameterGroup.Builder
      .create(stackCtx, internalResourceId)
      .properties(properties.map(_.asJava).orNull)
      .cacheParameterGroupFamily(cacheParameterGroupFamily.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
