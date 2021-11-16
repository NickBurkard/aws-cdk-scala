package io.burkard.cdk.services.ec2

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NatInstanceProvider {

  def apply(
    instanceType: software.amazon.awscdk.services.ec2.InstanceType,
    allowAllTraffic: Option[Boolean] = None,
    defaultAllowedTraffic: Option[software.amazon.awscdk.services.ec2.NatTrafficDirection] = None,
    machineImage: Option[software.amazon.awscdk.services.ec2.IMachineImage] = None,
    keyName: Option[String] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None
  ): software.amazon.awscdk.services.ec2.NatInstanceProvider =
    software.amazon.awscdk.services.ec2.NatInstanceProvider.Builder
      .create()
      .instanceType(instanceType)
      .allowAllTraffic(allowAllTraffic.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .defaultAllowedTraffic(defaultAllowedTraffic.orNull)
      .machineImage(machineImage.orNull)
      .keyName(keyName.orNull)
      .securityGroup(securityGroup.orNull)
      .build()
}
