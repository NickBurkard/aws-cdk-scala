package io.burkard.cdk.services.config

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnStoredQuery {

  def apply(
    internalResourceId: String,
    queryName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    queryDescription: Option[String] = None,
    queryExpression: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.config.CfnStoredQuery =
    software.amazon.awscdk.services.config.CfnStoredQuery.Builder
      .create(stackCtx, internalResourceId)
      .queryName(queryName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .queryDescription(queryDescription.orNull)
      .queryExpression(queryExpression.orNull)
      .build()
}
