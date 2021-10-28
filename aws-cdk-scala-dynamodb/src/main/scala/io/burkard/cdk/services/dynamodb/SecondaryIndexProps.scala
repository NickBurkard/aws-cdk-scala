package io.burkard.cdk.services.dynamodb

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SecondaryIndexProps {

  def apply(
    projectionType: Option[software.amazon.awscdk.services.dynamodb.ProjectionType] = None,
    nonKeyAttributes: Option[List[String]] = None,
    indexName: Option[String] = None
  ): software.amazon.awscdk.services.dynamodb.SecondaryIndexProps =
    (new software.amazon.awscdk.services.dynamodb.SecondaryIndexProps.Builder)
      .projectionType(projectionType.orNull)
      .nonKeyAttributes(nonKeyAttributes.map(_.asJava).orNull)
      .indexName(indexName.orNull)
      .build()
}
