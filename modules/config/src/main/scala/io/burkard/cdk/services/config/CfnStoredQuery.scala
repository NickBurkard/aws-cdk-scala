package io.burkard.cdk.services.config

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStoredQuery {

  def apply(
    internalResourceId: String,
    queryName: String,
    queryExpression: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    queryDescription: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.config.CfnStoredQuery =
    software.amazon.awscdk.services.config.CfnStoredQuery.Builder
      .create(stackCtx, internalResourceId)
      .queryName(queryName)
      .queryExpression(queryExpression)
      .tags(tags.map(_.asJava).orNull)
      .queryDescription(queryDescription.orNull)
      .build()
}
