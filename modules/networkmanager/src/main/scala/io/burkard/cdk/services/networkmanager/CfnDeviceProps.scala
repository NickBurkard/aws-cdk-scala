package io.burkard.cdk.services.networkmanager

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDeviceProps {

  def apply(
    serialNumber: Option[String] = None,
    location: Option[software.amazon.awscdk.services.networkmanager.CfnDevice.LocationProperty] = None,
    model: Option[String] = None,
    siteId: Option[String] = None,
    `type`: Option[String] = None,
    vendor: Option[String] = None,
    globalNetworkId: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.networkmanager.CfnDeviceProps =
    (new software.amazon.awscdk.services.networkmanager.CfnDeviceProps.Builder)
      .serialNumber(serialNumber.orNull)
      .location(location.orNull)
      .model(model.orNull)
      .siteId(siteId.orNull)
      .`type`(`type`.orNull)
      .vendor(vendor.orNull)
      .globalNetworkId(globalNetworkId.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
