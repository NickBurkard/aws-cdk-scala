package io.burkard.cdk.services.networkmanager

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnGlobalNetworkProps {

  def apply(
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.networkmanager.CfnGlobalNetworkProps =
    (new software.amazon.awscdk.services.networkmanager.CfnGlobalNetworkProps.Builder)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
