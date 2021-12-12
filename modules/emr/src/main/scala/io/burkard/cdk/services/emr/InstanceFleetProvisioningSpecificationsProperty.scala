package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InstanceFleetProvisioningSpecificationsProperty {

  def apply(
    spotSpecification: Option[software.amazon.awscdk.services.emr.CfnCluster.SpotProvisioningSpecificationProperty] = None,
    onDemandSpecification: Option[software.amazon.awscdk.services.emr.CfnCluster.OnDemandProvisioningSpecificationProperty] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetProvisioningSpecificationsProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.InstanceFleetProvisioningSpecificationsProperty.Builder)
      .spotSpecification(spotSpecification.orNull)
      .onDemandSpecification(onDemandSpecification.orNull)
      .build()
}
