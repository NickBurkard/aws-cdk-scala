package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NatInstanceProps {

  def apply(
    defaultAllowedTraffic: Option[software.amazon.awscdk.services.ec2.NatTrafficDirection] = None,
    machineImage: Option[software.amazon.awscdk.services.ec2.IMachineImage] = None,
    instanceType: Option[software.amazon.awscdk.services.ec2.InstanceType] = None,
    keyName: Option[String] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None
  ): software.amazon.awscdk.services.ec2.NatInstanceProps =
    (new software.amazon.awscdk.services.ec2.NatInstanceProps.Builder)
      .defaultAllowedTraffic(defaultAllowedTraffic.orNull)
      .machineImage(machineImage.orNull)
      .instanceType(instanceType.orNull)
      .keyName(keyName.orNull)
      .securityGroup(securityGroup.orNull)
      .build()
}
