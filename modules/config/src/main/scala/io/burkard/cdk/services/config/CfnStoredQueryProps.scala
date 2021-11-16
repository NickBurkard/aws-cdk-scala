package io.burkard.cdk.services.config

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStoredQueryProps {

  def apply(
    queryName: String,
    queryExpression: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    queryDescription: Option[String] = None
  ): software.amazon.awscdk.services.config.CfnStoredQueryProps =
    (new software.amazon.awscdk.services.config.CfnStoredQueryProps.Builder)
      .queryName(queryName)
      .queryExpression(queryExpression)
      .tags(tags.map(_.asJava).orNull)
      .queryDescription(queryDescription.orNull)
      .build()
}
