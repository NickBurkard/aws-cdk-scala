package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SpotProvisioningSpecificationProperty {

  def apply(
    allocationStrategy: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotAllocationStrategy] = None,
    timeoutAction: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotTimeoutAction] = None,
    blockDurationMinutes: Option[Number] = None,
    timeoutDurationMinutes: Option[Number] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotProvisioningSpecificationProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotProvisioningSpecificationProperty.Builder)
      .allocationStrategy(allocationStrategy.orNull)
      .timeoutAction(timeoutAction.orNull)
      .blockDurationMinutes(blockDurationMinutes.orNull)
      .timeoutDurationMinutes(timeoutDurationMinutes.orNull)
      .build()
}
