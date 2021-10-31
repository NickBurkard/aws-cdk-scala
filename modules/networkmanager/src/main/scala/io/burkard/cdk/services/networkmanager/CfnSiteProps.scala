package io.burkard.cdk.services.networkmanager

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSiteProps {

  def apply(
    location: Option[software.amazon.awscdk.services.networkmanager.CfnSite.LocationProperty] = None,
    globalNetworkId: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.networkmanager.CfnSiteProps =
    (new software.amazon.awscdk.services.networkmanager.CfnSiteProps.Builder)
      .location(location.orNull)
      .globalNetworkId(globalNetworkId.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
