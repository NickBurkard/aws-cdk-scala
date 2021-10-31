package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BastionHostLinux {

  def apply(
    internalResourceId: String,
    blockDevices: Option[List[_ <: software.amazon.awscdk.services.ec2.BlockDevice]] = None,
    machineImage: Option[software.amazon.awscdk.services.ec2.IMachineImage] = None,
    availabilityZone: Option[String] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    instanceType: Option[software.amazon.awscdk.services.ec2.InstanceType] = None,
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None,
    instanceName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.BastionHostLinux =
    software.amazon.awscdk.services.ec2.BastionHostLinux.Builder
      .create(stackCtx, internalResourceId)
      .blockDevices(blockDevices.map(_.asJava).orNull)
      .machineImage(machineImage.orNull)
      .availabilityZone(availabilityZone.orNull)
      .vpc(vpc.orNull)
      .instanceType(instanceType.orNull)
      .subnetSelection(subnetSelection.orNull)
      .securityGroup(securityGroup.orNull)
      .instanceName(instanceName.orNull)
      .build()
}
