package io.burkard.cdk.services.iotsitewise

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnGatewayProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    gatewayName: Option[String] = None,
    gatewayPlatform: Option[software.amazon.awscdk.services.iotsitewise.CfnGateway.GatewayPlatformProperty] = None,
    gatewayCapabilitySummaries: Option[List[_]] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnGatewayProps =
    (new software.amazon.awscdk.services.iotsitewise.CfnGatewayProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .gatewayName(gatewayName.orNull)
      .gatewayPlatform(gatewayPlatform.orNull)
      .gatewayCapabilitySummaries(gatewayCapabilitySummaries.map(_.asJava).orNull)
      .build()
}
