package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TimeToLiveSpecificationProperty {

  def apply(
    enabled: Option[Boolean] = None,
    attributeName: Option[String] = None
  ): software.amazon.awscdk.services.dynamodb.CfnTable.TimeToLiveSpecificationProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnTable.TimeToLiveSpecificationProperty.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .attributeName(attributeName.orNull)
      .build()
}
