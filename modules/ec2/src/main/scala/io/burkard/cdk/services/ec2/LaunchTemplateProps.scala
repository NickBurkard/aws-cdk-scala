package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LaunchTemplateProps {

  def apply(
    ebsOptimized: Option[Boolean] = None,
    blockDevices: Option[List[_ <: software.amazon.awscdk.services.ec2.BlockDevice]] = None,
    disableApiTermination: Option[Boolean] = None,
    nitroEnclaveEnabled: Option[Boolean] = None,
    instanceType: Option[software.amazon.awscdk.services.ec2.InstanceType] = None,
    spotOptions: Option[software.amazon.awscdk.services.ec2.LaunchTemplateSpotOptions] = None,
    cpuCredits: Option[software.amazon.awscdk.services.ec2.CpuCredits] = None,
    launchTemplateName: Option[String] = None,
    instanceInitiatedShutdownBehavior: Option[software.amazon.awscdk.services.ec2.InstanceInitiatedShutdownBehavior] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None,
    hibernationConfigured: Option[Boolean] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    machineImage: Option[software.amazon.awscdk.services.ec2.IMachineImage] = None,
    userData: Option[software.amazon.awscdk.services.ec2.UserData] = None,
    keyName: Option[String] = None,
    detailedMonitoring: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.LaunchTemplateProps =
    (new software.amazon.awscdk.services.ec2.LaunchTemplateProps.Builder)
      .ebsOptimized(ebsOptimized.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .blockDevices(blockDevices.map(_.asJava).orNull)
      .disableApiTermination(disableApiTermination.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .nitroEnclaveEnabled(nitroEnclaveEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .instanceType(instanceType.orNull)
      .spotOptions(spotOptions.orNull)
      .cpuCredits(cpuCredits.orNull)
      .launchTemplateName(launchTemplateName.orNull)
      .instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior.orNull)
      .securityGroup(securityGroup.orNull)
      .hibernationConfigured(hibernationConfigured.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .role(role.orNull)
      .machineImage(machineImage.orNull)
      .userData(userData.orNull)
      .keyName(keyName.orNull)
      .detailedMonitoring(detailedMonitoring.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
