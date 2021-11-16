package io.burkard.cdk.services.iotsitewise

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGatewayProps {

  def apply(
    gatewayName: String,
    gatewayPlatform: software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayPlatformProperty,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    gatewayCapabilitySummaries: Option[List[_]] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnGatewayProps =
    (new software.amazon.awscdk.services.iotsitewise.CfnGatewayProps.Builder)
      .gatewayName(gatewayName)
      .gatewayPlatform(gatewayPlatform)
      .tags(tags.map(_.asJava).orNull)
      .gatewayCapabilitySummaries(gatewayCapabilitySummaries.map(_.asJava).orNull)
      .build()
}
