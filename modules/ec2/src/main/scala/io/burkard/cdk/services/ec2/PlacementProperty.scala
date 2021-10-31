package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PlacementProperty {

  def apply(
    affinity: Option[String] = None,
    availabilityZone: Option[String] = None,
    hostId: Option[String] = None,
    partitionNumber: Option[Number] = None,
    groupName: Option[String] = None,
    tenancy: Option[String] = None,
    spreadDomain: Option[String] = None,
    hostResourceGroupArn: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PlacementProperty =
    (new software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PlacementProperty.Builder)
      .affinity(affinity.orNull)
      .availabilityZone(availabilityZone.orNull)
      .hostId(hostId.orNull)
      .partitionNumber(partitionNumber.orNull)
      .groupName(groupName.orNull)
      .tenancy(tenancy.orNull)
      .spreadDomain(spreadDomain.orNull)
      .hostResourceGroupArn(hostResourceGroupArn.orNull)
      .build()
}
