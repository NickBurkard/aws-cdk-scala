package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LaunchTemplateDataProperty {

  def apply(
    tagSpecifications: Option[List[_]] = None,
    monitoring: Option[software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MonitoringProperty] = None,
    userData: Option[String] = None,
    securityGroupIds: Option[List[String]] = None,
    iamInstanceProfile: Option[software.amazon.awscdk.services.ec2.CfnLaunchTemplate.IamInstanceProfileProperty] = None,
    elasticGpuSpecifications: Option[List[_]] = None,
    elasticInferenceAccelerators: Option[List[_]] = None,
    placement: Option[software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PlacementProperty] = None,
    metadataOptions: Option[software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MetadataOptionsProperty] = None,
    ramDiskId: Option[String] = None,
    instanceInitiatedShutdownBehavior: Option[String] = None,
    kernelId: Option[String] = None,
    licenseSpecifications: Option[List[_]] = None,
    blockDeviceMappings: Option[List[_]] = None,
    instanceMarketOptions: Option[software.amazon.awscdk.services.ec2.CfnLaunchTemplate.InstanceMarketOptionsProperty] = None,
    ebsOptimized: Option[Boolean] = None,
    cpuOptions: Option[software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CpuOptionsProperty] = None,
    disableApiTermination: Option[Boolean] = None,
    networkInterfaces: Option[List[_]] = None,
    capacityReservationSpecification: Option[software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationSpecificationProperty] = None,
    instanceType: Option[String] = None,
    creditSpecification: Option[software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CreditSpecificationProperty] = None,
    hibernationOptions: Option[software.amazon.awscdk.services.ec2.CfnLaunchTemplate.HibernationOptionsProperty] = None,
    imageId: Option[String] = None,
    enclaveOptions: Option[software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnclaveOptionsProperty] = None,
    securityGroups: Option[List[String]] = None,
    keyName: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateDataProperty =
    (new software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateDataProperty.Builder)
      .tagSpecifications(tagSpecifications.map(_.asJava).orNull)
      .monitoring(monitoring.orNull)
      .userData(userData.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .iamInstanceProfile(iamInstanceProfile.orNull)
      .elasticGpuSpecifications(elasticGpuSpecifications.map(_.asJava).orNull)
      .elasticInferenceAccelerators(elasticInferenceAccelerators.map(_.asJava).orNull)
      .placement(placement.orNull)
      .metadataOptions(metadataOptions.orNull)
      .ramDiskId(ramDiskId.orNull)
      .instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior.orNull)
      .kernelId(kernelId.orNull)
      .licenseSpecifications(licenseSpecifications.map(_.asJava).orNull)
      .blockDeviceMappings(blockDeviceMappings.map(_.asJava).orNull)
      .instanceMarketOptions(instanceMarketOptions.orNull)
      .ebsOptimized(ebsOptimized.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cpuOptions(cpuOptions.orNull)
      .disableApiTermination(disableApiTermination.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .networkInterfaces(networkInterfaces.map(_.asJava).orNull)
      .capacityReservationSpecification(capacityReservationSpecification.orNull)
      .instanceType(instanceType.orNull)
      .creditSpecification(creditSpecification.orNull)
      .hibernationOptions(hibernationOptions.orNull)
      .imageId(imageId.orNull)
      .enclaveOptions(enclaveOptions.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .keyName(keyName.orNull)
      .build()
}
