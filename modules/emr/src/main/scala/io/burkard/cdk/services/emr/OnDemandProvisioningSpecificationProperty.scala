package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OnDemandProvisioningSpecificationProperty {

  def apply(
    allocationStrategy: String
  ): software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.OnDemandProvisioningSpecificationProperty =
    (new software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.OnDemandProvisioningSpecificationProperty.Builder)
      .allocationStrategy(allocationStrategy)
      .build()
}
