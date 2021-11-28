package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NatInstanceProps {

  def apply(
    instanceType: software.amazon.awscdk.services.ec2.InstanceType,
    defaultAllowedTraffic: Option[software.amazon.awscdk.services.ec2.NatTrafficDirection] = None,
    machineImage: Option[software.amazon.awscdk.services.ec2.IMachineImage] = None,
    keyName: Option[String] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None
  ): software.amazon.awscdk.services.ec2.NatInstanceProps =
    (new software.amazon.awscdk.services.ec2.NatInstanceProps.Builder)
      .instanceType(instanceType)
      .defaultAllowedTraffic(defaultAllowedTraffic.orNull)
      .machineImage(machineImage.orNull)
      .keyName(keyName.orNull)
      .securityGroup(securityGroup.orNull)
      .build()
}
