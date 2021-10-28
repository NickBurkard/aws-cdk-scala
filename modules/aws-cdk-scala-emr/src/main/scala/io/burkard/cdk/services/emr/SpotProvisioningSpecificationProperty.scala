package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SpotProvisioningSpecificationProperty {

  def apply(
    allocationStrategy: Option[String] = None,
    timeoutAction: Option[String] = None,
    blockDurationMinutes: Option[Number] = None,
    timeoutDurationMinutes: Option[Number] = None
  ): software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty =
    (new software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty.Builder)
      .allocationStrategy(allocationStrategy.orNull)
      .timeoutAction(timeoutAction.orNull)
      .blockDurationMinutes(blockDurationMinutes.orNull)
      .timeoutDurationMinutes(timeoutDurationMinutes.orNull)
      .build()
}
