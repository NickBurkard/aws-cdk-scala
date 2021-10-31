package io.burkard.cdk.services.lightsail

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDisk {

  def apply(
    internalResourceId: String,
    addOns: Option[List[_]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    availabilityZone: Option[String] = None,
    sizeInGb: Option[Number] = None,
    diskName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lightsail.CfnDisk =
    software.amazon.awscdk.services.lightsail.CfnDisk.Builder
      .create(stackCtx, internalResourceId)
      .addOns(addOns.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .availabilityZone(availabilityZone.orNull)
      .sizeInGb(sizeInGb.orNull)
      .diskName(diskName.orNull)
      .build()
}
