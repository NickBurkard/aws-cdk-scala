package io.burkard.cdk.services.lightsail

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDisk {

  def apply(
    internalResourceId: String,
    sizeInGb: Number,
    diskName: String,
    addOns: Option[List[_]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    availabilityZone: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lightsail.CfnDisk =
    software.amazon.awscdk.services.lightsail.CfnDisk.Builder
      .create(stackCtx, internalResourceId)
      .sizeInGb(sizeInGb)
      .diskName(diskName)
      .addOns(addOns.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .availabilityZone(availabilityZone.orNull)
      .build()
}
