package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnEIPAssociationProps {

  def apply(
    instanceId: Option[String] = None,
    eip: Option[String] = None,
    allocationId: Option[String] = None,
    privateIpAddress: Option[String] = None,
    networkInterfaceId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnEIPAssociationProps =
    (new software.amazon.awscdk.services.ec2.CfnEIPAssociationProps.Builder)
      .instanceId(instanceId.orNull)
      .eip(eip.orNull)
      .allocationId(allocationId.orNull)
      .privateIpAddress(privateIpAddress.orNull)
      .networkInterfaceId(networkInterfaceId.orNull)
      .build()
}
