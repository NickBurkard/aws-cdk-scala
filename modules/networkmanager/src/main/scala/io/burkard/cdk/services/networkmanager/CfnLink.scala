package io.burkard.cdk.services.networkmanager

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLink {

  def apply(
    internalResourceId: String,
    provider: Option[String] = None,
    bandwidth: Option[software.amazon.awscdk.services.networkmanager.CfnLink.BandwidthProperty] = None,
    siteId: Option[String] = None,
    `type`: Option[String] = None,
    globalNetworkId: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.networkmanager.CfnLink =
    software.amazon.awscdk.services.networkmanager.CfnLink.Builder
      .create(stackCtx, internalResourceId)
      .provider(provider.orNull)
      .bandwidth(bandwidth.orNull)
      .siteId(siteId.orNull)
      .`type`(`type`.orNull)
      .globalNetworkId(globalNetworkId.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
