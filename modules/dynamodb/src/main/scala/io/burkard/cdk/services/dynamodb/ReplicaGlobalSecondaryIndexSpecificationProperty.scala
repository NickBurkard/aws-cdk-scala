package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ReplicaGlobalSecondaryIndexSpecificationProperty {

  def apply(
    indexName: String,
    contributorInsightsSpecification: Option[software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ContributorInsightsSpecificationProperty] = None,
    readProvisionedThroughputSettings: Option[software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReadProvisionedThroughputSettingsProperty] = None
  ): software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty.Builder)
      .indexName(indexName)
      .contributorInsightsSpecification(contributorInsightsSpecification.orNull)
      .readProvisionedThroughputSettings(readProvisionedThroughputSettings.orNull)
      .build()
}
