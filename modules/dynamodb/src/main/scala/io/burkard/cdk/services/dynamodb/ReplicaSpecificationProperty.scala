package io.burkard.cdk.services.dynamodb

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ReplicaSpecificationProperty {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    sseSpecification: Option[software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSSESpecificationProperty] = None,
    readProvisionedThroughputSettings: Option[software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReadProvisionedThroughputSettingsProperty] = None,
    globalSecondaryIndexes: Option[List[_]] = None,
    pointInTimeRecoverySpecification: Option[software.amazon.awscdk.services.dynamodb.CfnGlobalTable.PointInTimeRecoverySpecificationProperty] = None,
    region: Option[String] = None,
    contributorInsightsSpecification: Option[software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ContributorInsightsSpecificationProperty] = None
  ): software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSpecificationProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSpecificationProperty.Builder)
      .tags(tags.map(_.asJava).orNull)
      .sseSpecification(sseSpecification.orNull)
      .readProvisionedThroughputSettings(readProvisionedThroughputSettings.orNull)
      .globalSecondaryIndexes(globalSecondaryIndexes.map(_.asJava).orNull)
      .pointInTimeRecoverySpecification(pointInTimeRecoverySpecification.orNull)
      .region(region.orNull)
      .contributorInsightsSpecification(contributorInsightsSpecification.orNull)
      .build()
}
