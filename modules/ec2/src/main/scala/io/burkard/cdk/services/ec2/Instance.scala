package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Instance {

  def apply(
    internalResourceId: String,
    instanceType: software.amazon.awscdk.services.ec2.InstanceType,
    machineImage: software.amazon.awscdk.services.ec2.IMachineImage,
    vpc: software.amazon.awscdk.services.ec2.IVpc,
    initOptions: Option[software.amazon.awscdk.services.ec2.ApplyCloudFormationInitOptions] = None,
    blockDevices: Option[List[_ <: software.amazon.awscdk.services.ec2.BlockDevice]] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    userDataCausesReplacement: Option[Boolean] = None,
    availabilityZone: Option[String] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    allowAllOutbound: Option[Boolean] = None,
    resourceSignalTimeout: Option[software.amazon.awscdk.Duration] = None,
    requireImdsv2: Option[Boolean] = None,
    keyName: Option[String] = None,
    privateIpAddress: Option[String] = None,
    init: Option[software.amazon.awscdk.services.ec2.CloudFormationInit] = None,
    userData: Option[software.amazon.awscdk.services.ec2.UserData] = None,
    sourceDestCheck: Option[Boolean] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None,
    instanceName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.Instance =
    software.amazon.awscdk.services.ec2.Instance.Builder
      .create(stackCtx, internalResourceId)
      .instanceType(instanceType)
      .machineImage(machineImage)
      .vpc(vpc)
      .initOptions(initOptions.orNull)
      .blockDevices(blockDevices.map(_.asJava).orNull)
      .role(role.orNull)
      .userDataCausesReplacement(userDataCausesReplacement.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .availabilityZone(availabilityZone.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .allowAllOutbound(allowAllOutbound.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .resourceSignalTimeout(resourceSignalTimeout.orNull)
      .requireImdsv2(requireImdsv2.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .keyName(keyName.orNull)
      .privateIpAddress(privateIpAddress.orNull)
      .init(init.orNull)
      .userData(userData.orNull)
      .sourceDestCheck(sourceDestCheck.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .securityGroup(securityGroup.orNull)
      .instanceName(instanceName.orNull)
      .build()
}
