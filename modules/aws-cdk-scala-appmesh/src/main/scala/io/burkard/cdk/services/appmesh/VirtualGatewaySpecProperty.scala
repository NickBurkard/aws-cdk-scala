package io.burkard.cdk.services.appmesh

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualGatewaySpecProperty {

  def apply(
    backendDefaults: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayBackendDefaultsProperty] = None,
    logging: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayLoggingProperty] = None,
    listeners: Option[List[_]] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewaySpecProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewaySpecProperty.Builder)
      .backendDefaults(backendDefaults.orNull)
      .logging(logging.orNull)
      .listeners(listeners.map(_.asJava).orNull)
      .build()
}
