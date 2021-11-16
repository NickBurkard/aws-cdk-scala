package io.burkard.cdk.services.dynamodb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTableProps {

  def apply(
    keySchema: List[_],
    streamSpecification: Option[software.amazon.awscdk.services.dynamodb.CfnTable.StreamSpecificationProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    timeToLiveSpecification: Option[software.amazon.awscdk.services.dynamodb.CfnTable.TimeToLiveSpecificationProperty] = None,
    provisionedThroughput: Option[software.amazon.awscdk.services.dynamodb.CfnTable.ProvisionedThroughputProperty] = None,
    sseSpecification: Option[software.amazon.awscdk.services.dynamodb.CfnTable.SSESpecificationProperty] = None,
    tableName: Option[String] = None,
    attributeDefinitions: Option[List[_]] = None,
    globalSecondaryIndexes: Option[List[_]] = None,
    pointInTimeRecoverySpecification: Option[software.amazon.awscdk.services.dynamodb.CfnTable.PointInTimeRecoverySpecificationProperty] = None,
    billingMode: Option[String] = None,
    kinesisStreamSpecification: Option[software.amazon.awscdk.services.dynamodb.CfnTable.KinesisStreamSpecificationProperty] = None,
    localSecondaryIndexes: Option[List[_]] = None,
    contributorInsightsSpecification: Option[software.amazon.awscdk.services.dynamodb.CfnTable.ContributorInsightsSpecificationProperty] = None
  ): software.amazon.awscdk.services.dynamodb.CfnTableProps =
    (new software.amazon.awscdk.services.dynamodb.CfnTableProps.Builder)
      .keySchema(keySchema.asJava)
      .streamSpecification(streamSpecification.orNull)
      .tags(tags.map(_.asJava).orNull)
      .timeToLiveSpecification(timeToLiveSpecification.orNull)
      .provisionedThroughput(provisionedThroughput.orNull)
      .sseSpecification(sseSpecification.orNull)
      .tableName(tableName.orNull)
      .attributeDefinitions(attributeDefinitions.map(_.asJava).orNull)
      .globalSecondaryIndexes(globalSecondaryIndexes.map(_.asJava).orNull)
      .pointInTimeRecoverySpecification(pointInTimeRecoverySpecification.orNull)
      .billingMode(billingMode.orNull)
      .kinesisStreamSpecification(kinesisStreamSpecification.orNull)
      .localSecondaryIndexes(localSecondaryIndexes.map(_.asJava).orNull)
      .contributorInsightsSpecification(contributorInsightsSpecification.orNull)
      .build()
}
