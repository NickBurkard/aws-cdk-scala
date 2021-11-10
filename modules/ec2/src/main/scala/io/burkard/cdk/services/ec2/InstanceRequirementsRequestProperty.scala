package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InstanceRequirementsRequestProperty {

  def apply(
    spotMaxPricePercentageOverLowestPrice: Option[Number] = None,
    localStorage: Option[String] = None,
    baselineEbsBandwidthMbps: Option[software.amazon.awscdk.services.ec2.CfnEC2Fleet.BaselineEbsBandwidthMbpsRequestProperty] = None,
    totalLocalStorageGb: Option[software.amazon.awscdk.services.ec2.CfnEC2Fleet.TotalLocalStorageGBRequestProperty] = None,
    burstablePerformance: Option[String] = None,
    onDemandMaxPricePercentageOverLowestPrice: Option[Number] = None,
    instanceGenerations: Option[List[String]] = None,
    memoryGiBPerVCpu: Option[software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryGiBPerVCpuRequestProperty] = None,
    requireHibernateSupport: Option[Boolean] = None,
    excludedInstanceTypes: Option[List[String]] = None,
    vCpuCount: Option[software.amazon.awscdk.services.ec2.CfnEC2Fleet.VCpuCountRangeRequestProperty] = None,
    acceleratorNames: Option[List[String]] = None,
    networkInterfaceCount: Option[software.amazon.awscdk.services.ec2.CfnEC2Fleet.NetworkInterfaceCountRequestProperty] = None,
    acceleratorTypes: Option[List[String]] = None,
    acceleratorCount: Option[software.amazon.awscdk.services.ec2.CfnEC2Fleet.AcceleratorCountRequestProperty] = None,
    memoryMiB: Option[software.amazon.awscdk.services.ec2.CfnEC2Fleet.MemoryMiBRequestProperty] = None,
    cpuManufacturers: Option[List[String]] = None,
    bareMetal: Option[String] = None,
    localStorageTypes: Option[List[String]] = None,
    acceleratorTotalMemoryMiB: Option[software.amazon.awscdk.services.ec2.CfnEC2Fleet.AcceleratorTotalMemoryMiBRequestProperty] = None,
    acceleratorManufacturers: Option[List[String]] = None
  ): software.amazon.awscdk.services.ec2.CfnEC2Fleet.InstanceRequirementsRequestProperty =
    (new software.amazon.awscdk.services.ec2.CfnEC2Fleet.InstanceRequirementsRequestProperty.Builder)
      .spotMaxPricePercentageOverLowestPrice(spotMaxPricePercentageOverLowestPrice.orNull)
      .localStorage(localStorage.orNull)
      .baselineEbsBandwidthMbps(baselineEbsBandwidthMbps.orNull)
      .totalLocalStorageGb(totalLocalStorageGb.orNull)
      .burstablePerformance(burstablePerformance.orNull)
      .onDemandMaxPricePercentageOverLowestPrice(onDemandMaxPricePercentageOverLowestPrice.orNull)
      .instanceGenerations(instanceGenerations.map(_.asJava).orNull)
      .memoryGiBPerVCpu(memoryGiBPerVCpu.orNull)
      .requireHibernateSupport(requireHibernateSupport.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .excludedInstanceTypes(excludedInstanceTypes.map(_.asJava).orNull)
      .vCpuCount(vCpuCount.orNull)
      .acceleratorNames(acceleratorNames.map(_.asJava).orNull)
      .networkInterfaceCount(networkInterfaceCount.orNull)
      .acceleratorTypes(acceleratorTypes.map(_.asJava).orNull)
      .acceleratorCount(acceleratorCount.orNull)
      .memoryMiB(memoryMiB.orNull)
      .cpuManufacturers(cpuManufacturers.map(_.asJava).orNull)
      .bareMetal(bareMetal.orNull)
      .localStorageTypes(localStorageTypes.map(_.asJava).orNull)
      .acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB.orNull)
      .acceleratorManufacturers(acceleratorManufacturers.map(_.asJava).orNull)
      .build()
}
