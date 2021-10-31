package io.burkard.cdk.services.lightsail

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HardwareProperty {

  def apply(
    cpuCount: Option[Number] = None,
    disks: Option[List[_]] = None,
    ramSizeInGb: Option[Number] = None
  ): software.amazon.awscdk.services.lightsail.CfnInstance.HardwareProperty =
    (new software.amazon.awscdk.services.lightsail.CfnInstance.HardwareProperty.Builder)
      .cpuCount(cpuCount.orNull)
      .disks(disks.map(_.asJava).orNull)
      .ramSizeInGb(ramSizeInGb.orNull)
      .build()
}
