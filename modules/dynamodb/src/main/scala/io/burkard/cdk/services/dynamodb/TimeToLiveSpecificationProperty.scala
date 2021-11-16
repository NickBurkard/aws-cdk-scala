package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TimeToLiveSpecificationProperty {

  def apply(
    enabled: Boolean,
    attributeName: String
  ): software.amazon.awscdk.services.dynamodb.CfnTable.TimeToLiveSpecificationProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnTable.TimeToLiveSpecificationProperty.Builder)
      .enabled(enabled)
      .attributeName(attributeName)
      .build()
}
