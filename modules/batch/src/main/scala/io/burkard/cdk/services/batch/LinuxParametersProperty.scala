package io.burkard.cdk.services.batch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LinuxParametersProperty {

  def apply(
    initProcessEnabled: Option[Boolean] = None,
    sharedMemorySize: Option[Number] = None,
    swappiness: Option[Number] = None,
    maxSwap: Option[Number] = None,
    devices: Option[List[_]] = None,
    tmpfs: Option[List[_]] = None
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.LinuxParametersProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.LinuxParametersProperty.Builder)
      .initProcessEnabled(initProcessEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sharedMemorySize(sharedMemorySize.orNull)
      .swappiness(swappiness.orNull)
      .maxSwap(maxSwap.orNull)
      .devices(devices.map(_.asJava).orNull)
      .tmpfs(tmpfs.map(_.asJava).orNull)
      .build()
}
