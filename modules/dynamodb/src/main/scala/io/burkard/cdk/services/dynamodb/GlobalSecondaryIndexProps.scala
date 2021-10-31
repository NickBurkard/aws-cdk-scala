package io.burkard.cdk.services.dynamodb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GlobalSecondaryIndexProps {

  def apply(
    partitionKey: Option[software.amazon.awscdk.services.dynamodb.Attribute] = None,
    projectionType: Option[software.amazon.awscdk.services.dynamodb.ProjectionType] = None,
    readCapacity: Option[Number] = None,
    nonKeyAttributes: Option[List[String]] = None,
    indexName: Option[String] = None,
    sortKey: Option[software.amazon.awscdk.services.dynamodb.Attribute] = None,
    writeCapacity: Option[Number] = None
  ): software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps =
    (new software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps.Builder)
      .partitionKey(partitionKey.orNull)
      .projectionType(projectionType.orNull)
      .readCapacity(readCapacity.orNull)
      .nonKeyAttributes(nonKeyAttributes.map(_.asJava).orNull)
      .indexName(indexName.orNull)
      .sortKey(sortKey.orNull)
      .writeCapacity(writeCapacity.orNull)
      .build()
}
