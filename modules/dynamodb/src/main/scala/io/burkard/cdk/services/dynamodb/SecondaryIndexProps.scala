package io.burkard.cdk.services.dynamodb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SecondaryIndexProps {

  def apply(
    indexName: String,
    projectionType: Option[software.amazon.awscdk.services.dynamodb.ProjectionType] = None,
    nonKeyAttributes: Option[List[String]] = None
  ): software.amazon.awscdk.services.dynamodb.SecondaryIndexProps =
    (new software.amazon.awscdk.services.dynamodb.SecondaryIndexProps.Builder)
      .indexName(indexName)
      .projectionType(projectionType.orNull)
      .nonKeyAttributes(nonKeyAttributes.map(_.asJava).orNull)
      .build()
}
