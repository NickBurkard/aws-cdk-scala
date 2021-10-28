package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BastionHostLinuxProps {

  def apply(
    blockDevices: Option[List[_ <: software.amazon.awscdk.services.ec2.BlockDevice]] = None,
    machineImage: Option[software.amazon.awscdk.services.ec2.IMachineImage] = None,
    availabilityZone: Option[String] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    instanceType: Option[software.amazon.awscdk.services.ec2.InstanceType] = None,
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None,
    instanceName: Option[String] = None
  ): software.amazon.awscdk.services.ec2.BastionHostLinuxProps =
    (new software.amazon.awscdk.services.ec2.BastionHostLinuxProps.Builder)
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
