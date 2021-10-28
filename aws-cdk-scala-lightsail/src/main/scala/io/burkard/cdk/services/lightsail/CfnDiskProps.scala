package io.burkard.cdk.services.lightsail

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDiskProps {

  def apply(
    addOns: Option[List[_]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    availabilityZone: Option[String] = None,
    sizeInGb: Option[Number] = None,
    diskName: Option[String] = None
  ): software.amazon.awscdk.services.lightsail.CfnDiskProps =
    (new software.amazon.awscdk.services.lightsail.CfnDiskProps.Builder)
      .addOns(addOns.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .availabilityZone(availabilityZone.orNull)
      .sizeInGb(sizeInGb.orNull)
      .diskName(diskName.orNull)
      .build()
}
