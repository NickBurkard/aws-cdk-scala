package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InstanceFleetProvisioningSpecificationsProperty {

  def apply(
    spotSpecification: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotProvisioningSpecificationProperty
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty.Builder)
      .spotSpecification(spotSpecification)
      .build()
}
