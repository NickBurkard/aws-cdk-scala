package io.burkard.cdk.services.lightsail

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
