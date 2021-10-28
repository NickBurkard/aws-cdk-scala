package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PointInTimeRecoverySpecificationProperty {

  def apply(
    pointInTimeRecoveryEnabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.dynamodb.CfnGlobalTable.PointInTimeRecoverySpecificationProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnGlobalTable.PointInTimeRecoverySpecificationProperty.Builder)
      .pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}