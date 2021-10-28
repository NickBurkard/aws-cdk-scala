package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OnDemandProvisioningSpecificationProperty {

  def apply(
    allocationStrategy: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.OnDemandProvisioningSpecificationProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.OnDemandProvisioningSpecificationProperty.Builder)
      .allocationStrategy(allocationStrategy.orNull)
      .build()
}
