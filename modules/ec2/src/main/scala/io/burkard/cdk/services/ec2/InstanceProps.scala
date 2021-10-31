package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InstanceProps {

  def apply(
    initOptions: Option[software.amazon.awscdk.services.ec2.ApplyCloudFormationInitOptions] = None,
    blockDevices: Option[List[_ <: software.amazon.awscdk.services.ec2.BlockDevice]] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    userDataCausesReplacement: Option[Boolean] = None,
    availabilityZone: Option[String] = None,
    instanceType: Option[software.amazon.awscdk.services.ec2.InstanceType] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    allowAllOutbound: Option[Boolean] = None,
    resourceSignalTimeout: Option[software.amazon.awscdk.Duration] = None,
    requireImdsv2: Option[Boolean] = None,
    keyName: Option[String] = None,
    privateIpAddress: Option[String] = None,
    init: Option[software.amazon.awscdk.services.ec2.CloudFormationInit] = None,
    machineImage: Option[software.amazon.awscdk.services.ec2.IMachineImage] = None,
    userData: Option[software.amazon.awscdk.services.ec2.UserData] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    sourceDestCheck: Option[Boolean] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None,
    instanceName: Option[String] = None
  ): software.amazon.awscdk.services.ec2.InstanceProps =
    (new software.amazon.awscdk.services.ec2.InstanceProps.Builder)
      .initOptions(initOptions.orNull)
      .blockDevices(blockDevices.map(_.asJava).orNull)
      .role(role.orNull)
      .userDataCausesReplacement(userDataCausesReplacement.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .availabilityZone(availabilityZone.orNull)
      .instanceType(instanceType.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .allowAllOutbound(allowAllOutbound.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .resourceSignalTimeout(resourceSignalTimeout.orNull)
      .requireImdsv2(requireImdsv2.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .keyName(keyName.orNull)
      .privateIpAddress(privateIpAddress.orNull)
      .init(init.orNull)
      .machineImage(machineImage.orNull)
      .userData(userData.orNull)
      .vpc(vpc.orNull)
      .sourceDestCheck(sourceDestCheck.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .securityGroup(securityGroup.orNull)
      .instanceName(instanceName.orNull)
      .build()
}
