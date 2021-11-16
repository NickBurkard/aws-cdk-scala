package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ContributorInsightsSpecificationProperty {

  def apply(
    enabled: Boolean
  ): software.amazon.awscdk.services.dynamodb.CfnTable.ContributorInsightsSpecificationProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnTable.ContributorInsightsSpecificationProperty.Builder)
      .enabled(enabled)
      .build()
}
