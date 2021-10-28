package io.burkard.cdk.services.config

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnStoredQueryProps {

  def apply(
    queryName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    queryDescription: Option[String] = None,
    queryExpression: Option[String] = None
  ): software.amazon.awscdk.services.config.CfnStoredQueryProps =
    (new software.amazon.awscdk.services.config.CfnStoredQueryProps.Builder)
      .queryName(queryName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .queryDescription(queryDescription.orNull)
      .queryExpression(queryExpression.orNull)
      .build()
}
