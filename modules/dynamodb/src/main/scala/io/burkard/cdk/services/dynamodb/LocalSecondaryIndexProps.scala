package io.burkard.cdk.services.dynamodb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LocalSecondaryIndexProps {

  def apply(
    sortKey: Option[software.amazon.awscdk.services.dynamodb.Attribute] = None,
    projectionType: Option[software.amazon.awscdk.services.dynamodb.ProjectionType] = None,
    nonKeyAttributes: Option[List[String]] = None,
    indexName: Option[String] = None
  ): software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps =
    (new software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps.Builder)
      .sortKey(sortKey.orNull)
      .projectionType(projectionType.orNull)
      .nonKeyAttributes(nonKeyAttributes.map(_.asJava).orNull)
      .indexName(indexName.orNull)
      .build()
}
