package io.burkard.cdk.services.networkmanager

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLinkProps {

  def apply(
    provider: Option[String] = None,
    bandwidth: Option[software.amazon.awscdk.services.networkmanager.CfnLink.BandwidthProperty] = None,
    siteId: Option[String] = None,
    `type`: Option[String] = None,
    globalNetworkId: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.networkmanager.CfnLinkProps =
    (new software.amazon.awscdk.services.networkmanager.CfnLinkProps.Builder)
      .provider(provider.orNull)
      .bandwidth(bandwidth.orNull)
      .siteId(siteId.orNull)
      .`type`(`type`.orNull)
      .globalNetworkId(globalNetworkId.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
