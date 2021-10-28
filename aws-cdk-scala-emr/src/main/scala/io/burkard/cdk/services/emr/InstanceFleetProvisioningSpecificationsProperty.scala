package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InstanceFleetProvisioningSpecificationsProperty {

  def apply(
    spotSpecification: Option[software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty] = None,
    onDemandSpecification: Option[software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.OnDemandProvisioningSpecificationProperty] = None
  ): software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty =
    (new software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty.Builder)
      .spotSpecification(spotSpecification.orNull)
      .onDemandSpecification(onDemandSpecification.orNull)
      .build()
}
