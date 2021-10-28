package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ReplicaGlobalSecondaryIndexSpecificationProperty {

  def apply(
    indexName: Option[String] = None,
    contributorInsightsSpecification: Option[software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ContributorInsightsSpecificationProperty] = None,
    readProvisionedThroughputSettings: Option[software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReadProvisionedThroughputSettingsProperty] = None
  ): software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty.Builder)
      .indexName(indexName.orNull)
      .contributorInsightsSpecification(contributorInsightsSpecification.orNull)
      .readProvisionedThroughputSettings(readProvisionedThroughputSettings.orNull)
      .build()
}
