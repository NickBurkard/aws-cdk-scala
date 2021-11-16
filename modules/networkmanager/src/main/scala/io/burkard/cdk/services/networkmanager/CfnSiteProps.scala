package io.burkard.cdk.services.networkmanager

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSiteProps {

  def apply(
    globalNetworkId: String,
    location: Option[software.amazon.awscdk.services.networkmanager.CfnSite.LocationProperty] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.networkmanager.CfnSiteProps =
    (new software.amazon.awscdk.services.networkmanager.CfnSiteProps.Builder)
      .globalNetworkId(globalNetworkId)
      .location(location.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
