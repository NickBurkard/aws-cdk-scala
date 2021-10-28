package io.burkard.cdk.services.networkmanager

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDevice {

  def apply(
    internalResourceId: String,
    serialNumber: Option[String] = None,
    location: Option[software.amazon.awscdk.services.networkmanager.CfnDevice.LocationProperty] = None,
    model: Option[String] = None,
    siteId: Option[String] = None,
    `type`: Option[String] = None,
    vendor: Option[String] = None,
    globalNetworkId: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.networkmanager.CfnDevice =
    software.amazon.awscdk.services.networkmanager.CfnDevice.Builder
      .create(stackCtx, internalResourceId)
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
