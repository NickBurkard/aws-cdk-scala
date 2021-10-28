package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnEIPAssociation {

  def apply(
    internalResourceId: String,
    instanceId: Option[String] = None,
    eip: Option[String] = None,
    allocationId: Option[String] = None,
    privateIpAddress: Option[String] = None,
    networkInterfaceId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnEIPAssociation =
    software.amazon.awscdk.services.ec2.CfnEIPAssociation.Builder
      .create(stackCtx, internalResourceId)
      .instanceId(instanceId.orNull)
      .eip(eip.orNull)
      .allocationId(allocationId.orNull)
      .privateIpAddress(privateIpAddress.orNull)
      .networkInterfaceId(networkInterfaceId.orNull)
      .build()
}
