package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SpotProvisioningSpecificationProperty {

  def apply(
    timeoutAction: String,
    timeoutDurationMinutes: Number,
    allocationStrategy: Option[String] = None,
    blockDurationMinutes: Option[Number] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.SpotProvisioningSpecificationProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.SpotProvisioningSpecificationProperty.Builder)
      .timeoutAction(timeoutAction)
      .timeoutDurationMinutes(timeoutDurationMinutes)
      .allocationStrategy(allocationStrategy.orNull)
      .blockDurationMinutes(blockDurationMinutes.orNull)
      .build()
}
