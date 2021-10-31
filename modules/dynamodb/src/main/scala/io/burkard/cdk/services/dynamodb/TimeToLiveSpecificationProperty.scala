package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TimeToLiveSpecificationProperty {

  def apply(
    enabled: Option[Boolean] = None,
    attributeName: Option[String] = None
  ): software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TimeToLiveSpecificationProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TimeToLiveSpecificationProperty.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .attributeName(attributeName.orNull)
      .build()
}
