package io.burkard.cdk.services.dynamodb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GlobalSecondaryIndexProperty {

  def apply(
    projection: software.amazon.awscdk.services.dynamodb.CfnTable.ProjectionProperty,
    indexName: String,
    keySchema: List[_],
    provisionedThroughput: Option[software.amazon.awscdk.services.dynamodb.CfnTable.ProvisionedThroughputProperty] = None,
    contributorInsightsSpecification: Option[software.amazon.awscdk.services.dynamodb.CfnTable.ContributorInsightsSpecificationProperty] = None
  ): software.amazon.awscdk.services.dynamodb.CfnTable.GlobalSecondaryIndexProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnTable.GlobalSecondaryIndexProperty.Builder)
      .projection(projection)
      .indexName(indexName)
      .keySchema(keySchema.asJava)
      .provisionedThroughput(provisionedThroughput.orNull)
      .contributorInsightsSpecification(contributorInsightsSpecification.orNull)
      .build()
}
