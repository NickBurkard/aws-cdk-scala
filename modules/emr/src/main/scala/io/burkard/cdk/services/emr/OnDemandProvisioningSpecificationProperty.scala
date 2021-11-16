package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OnDemandProvisioningSpecificationProperty {

  def apply(
    allocationStrategy: String
  ): software.amazon.awscdk.services.emr.CfnCluster.OnDemandProvisioningSpecificationProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.OnDemandProvisioningSpecificationProperty.Builder)
      .allocationStrategy(allocationStrategy)
      .build()
}
