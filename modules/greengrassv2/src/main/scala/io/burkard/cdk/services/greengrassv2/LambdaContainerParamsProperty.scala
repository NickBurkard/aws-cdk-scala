package io.burkard.cdk.services.greengrassv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LambdaContainerParamsProperty {

  def apply(
    mountRoSysfs: Option[Boolean] = None,
    volumes: Option[List[_]] = None,
    memorySizeInKb: Option[Number] = None,
    devices: Option[List[_]] = None
  ): software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaContainerParamsProperty =
    (new software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaContainerParamsProperty.Builder)
      .mountRoSysfs(mountRoSysfs.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .volumes(volumes.map(_.asJava).orNull)
      .memorySizeInKb(memorySizeInKb.orNull)
      .devices(devices.map(_.asJava).orNull)
      .build()
}
