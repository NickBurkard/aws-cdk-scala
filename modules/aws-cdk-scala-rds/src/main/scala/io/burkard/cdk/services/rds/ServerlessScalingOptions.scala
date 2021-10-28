package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ServerlessScalingOptions {

  def apply(
    maxCapacity: Option[software.amazon.awscdk.services.rds.AuroraCapacityUnit] = None,
    autoPause: Option[software.amazon.awscdk.Duration] = None,
    minCapacity: Option[software.amazon.awscdk.services.rds.AuroraCapacityUnit] = None
  ): software.amazon.awscdk.services.rds.ServerlessScalingOptions =
    (new software.amazon.awscdk.services.rds.ServerlessScalingOptions.Builder)
      .maxCapacity(maxCapacity.orNull)
      .autoPause(autoPause.orNull)
      .minCapacity(minCapacity.orNull)
      .build()
}
