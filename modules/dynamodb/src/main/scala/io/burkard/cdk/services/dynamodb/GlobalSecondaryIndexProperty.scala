package io.burkard.cdk.services.dynamodb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GlobalSecondaryIndexProperty {

  def apply(
    projection: Option[software.amazon.awscdk.services.dynamodb.CfnTable.ProjectionProperty] = None,
    provisionedThroughput: Option[software.amazon.awscdk.services.dynamodb.CfnTable.ProvisionedThroughputProperty] = None,
    indexName: Option[String] = None,
    contributorInsightsSpecification: Option[software.amazon.awscdk.services.dynamodb.CfnTable.ContributorInsightsSpecificationProperty] = None,
    keySchema: Option[List[_]] = None
  ): software.amazon.awscdk.services.dynamodb.CfnTable.GlobalSecondaryIndexProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnTable.GlobalSecondaryIndexProperty.Builder)
      .projection(projection.orNull)
      .provisionedThroughput(provisionedThroughput.orNull)
      .indexName(indexName.orNull)
      .contributorInsightsSpecification(contributorInsightsSpecification.orNull)
      .keySchema(keySchema.map(_.asJava).orNull)
      .build()
}
