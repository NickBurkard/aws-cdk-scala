package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SpotProvisioningSpecificationProperty {

  def apply(
    timeoutAction: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotTimeoutAction,
    timeoutDurationMinutes: Number,
    allocationStrategy: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotAllocationStrategy] = None,
    blockDurationMinutes: Option[Number] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotProvisioningSpecificationProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotProvisioningSpecificationProperty.Builder)
      .timeoutAction(timeoutAction)
      .timeoutDurationMinutes(timeoutDurationMinutes)
      .allocationStrategy(allocationStrategy.orNull)
      .blockDurationMinutes(blockDurationMinutes.orNull)
      .build()
}
