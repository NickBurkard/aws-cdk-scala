package io.burkard.cdk.services.dynamodb

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
