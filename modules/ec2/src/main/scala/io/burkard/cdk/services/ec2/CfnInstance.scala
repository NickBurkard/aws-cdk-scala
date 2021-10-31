package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnInstance {

  def apply(
    internalResourceId: String,
    ebsOptimized: Option[Boolean] = None,
    networkInterfaces: Option[List[_]] = None,
    affinity: Option[String] = None,
    userData: Option[String] = None,
    elasticGpuSpecifications: Option[List[_]] = None,
    elasticInferenceAccelerators: Option[List[_]] = None,
    hostId: Option[String] = None,
    instanceInitiatedShutdownBehavior: Option[String] = None,
    hostResourceGroupArn: Option[String] = None,
    licenseSpecifications: Option[List[_]] = None,
    blockDeviceMappings: Option[List[_]] = None,
    cpuOptions: Option[software.amazon.awscdk.services.ec2.CfnInstance.CpuOptionsProperty] = None,
    disableApiTermination: Option[Boolean] = None,
    monitoring: Option[Boolean] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    securityGroupIds: Option[List[String]] = None,
    availabilityZone: Option[String] = None,
    launchTemplate: Option[software.amazon.awscdk.services.ec2.CfnInstance.LaunchTemplateSpecificationProperty] = None,
    iamInstanceProfile: Option[String] = None,
    subnetId: Option[String] = None,
    ramdiskId: Option[String] = None,
    instanceType: Option[String] = None,
    volumes: Option[List[_]] = None,
    creditSpecification: Option[software.amazon.awscdk.services.ec2.CfnInstance.CreditSpecificationProperty] = None,
    ssmAssociations: Option[List[_]] = None,
    ipv6Addresses: Option[List[_]] = None,
    hibernationOptions: Option[software.amazon.awscdk.services.ec2.CfnInstance.HibernationOptionsProperty] = None,
    tenancy: Option[String] = None,
    imageId: Option[String] = None,
    enclaveOptions: Option[software.amazon.awscdk.services.ec2.CfnInstance.EnclaveOptionsProperty] = None,
    ipv6AddressCount: Option[Number] = None,
    securityGroups: Option[List[String]] = None,
    keyName: Option[String] = None,
    additionalInfo: Option[String] = None,
    placementGroupName: Option[String] = None,
    sourceDestCheck: Option[Boolean] = None,
    privateIpAddress: Option[String] = None,
    kernelId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnInstance =
    software.amazon.awscdk.services.ec2.CfnInstance.Builder
      .create(stackCtx, internalResourceId)
      .ebsOptimized(ebsOptimized.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .networkInterfaces(networkInterfaces.map(_.asJava).orNull)
      .affinity(affinity.orNull)
      .userData(userData.orNull)
      .elasticGpuSpecifications(elasticGpuSpecifications.map(_.asJava).orNull)
      .elasticInferenceAccelerators(elasticInferenceAccelerators.map(_.asJava).orNull)
      .hostId(hostId.orNull)
      .instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior.orNull)
      .hostResourceGroupArn(hostResourceGroupArn.orNull)
      .licenseSpecifications(licenseSpecifications.map(_.asJava).orNull)
      .blockDeviceMappings(blockDeviceMappings.map(_.asJava).orNull)
      .cpuOptions(cpuOptions.orNull)
      .disableApiTermination(disableApiTermination.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .monitoring(monitoring.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tags(tags.map(_.asJava).orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .availabilityZone(availabilityZone.orNull)
      .launchTemplate(launchTemplate.orNull)
      .iamInstanceProfile(iamInstanceProfile.orNull)
      .subnetId(subnetId.orNull)
      .ramdiskId(ramdiskId.orNull)
      .instanceType(instanceType.orNull)
      .volumes(volumes.map(_.asJava).orNull)
      .creditSpecification(creditSpecification.orNull)
      .ssmAssociations(ssmAssociations.map(_.asJava).orNull)
      .ipv6Addresses(ipv6Addresses.map(_.asJava).orNull)
      .hibernationOptions(hibernationOptions.orNull)
      .tenancy(tenancy.orNull)
      .imageId(imageId.orNull)
      .enclaveOptions(enclaveOptions.orNull)
      .ipv6AddressCount(ipv6AddressCount.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .keyName(keyName.orNull)
      .additionalInfo(additionalInfo.orNull)
      .placementGroupName(placementGroupName.orNull)
      .sourceDestCheck(sourceDestCheck.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .privateIpAddress(privateIpAddress.orNull)
      .kernelId(kernelId.orNull)
      .build()
}
