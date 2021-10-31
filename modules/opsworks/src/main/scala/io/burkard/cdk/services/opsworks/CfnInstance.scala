package io.burkard.cdk.services.opsworks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnInstance {

  def apply(
    internalResourceId: String,
    ebsOptimized: Option[Boolean] = None,
    sshKeyName: Option[String] = None,
    timeBasedAutoScaling: Option[software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty] = None,
    stackId: Option[String] = None,
    amiId: Option[String] = None,
    tenancy: Option[String] = None,
    agentVersion: Option[String] = None,
    hostname: Option[String] = None,
    installUpdatesOnBoot: Option[Boolean] = None,
    availabilityZone: Option[String] = None,
    os: Option[String] = None,
    subnetId: Option[String] = None,
    architecture: Option[String] = None,
    instanceType: Option[String] = None,
    volumes: Option[List[String]] = None,
    rootDeviceType: Option[String] = None,
    layerIds: Option[List[String]] = None,
    blockDeviceMappings: Option[List[_]] = None,
    elasticIps: Option[List[String]] = None,
    virtualizationType: Option[String] = None,
    autoScalingType: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.opsworks.CfnInstance =
    software.amazon.awscdk.services.opsworks.CfnInstance.Builder
      .create(stackCtx, internalResourceId)
      .ebsOptimized(ebsOptimized.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sshKeyName(sshKeyName.orNull)
      .timeBasedAutoScaling(timeBasedAutoScaling.orNull)
      .stackId(stackId.orNull)
      .amiId(amiId.orNull)
      .tenancy(tenancy.orNull)
      .agentVersion(agentVersion.orNull)
      .hostname(hostname.orNull)
      .installUpdatesOnBoot(installUpdatesOnBoot.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .availabilityZone(availabilityZone.orNull)
      .os(os.orNull)
      .subnetId(subnetId.orNull)
      .architecture(architecture.orNull)
      .instanceType(instanceType.orNull)
      .volumes(volumes.map(_.asJava).orNull)
      .rootDeviceType(rootDeviceType.orNull)
      .layerIds(layerIds.map(_.asJava).orNull)
      .blockDeviceMappings(blockDeviceMappings.map(_.asJava).orNull)
      .elasticIps(elasticIps.map(_.asJava).orNull)
      .virtualizationType(virtualizationType.orNull)
      .autoScalingType(autoScalingType.orNull)
      .build()
}
