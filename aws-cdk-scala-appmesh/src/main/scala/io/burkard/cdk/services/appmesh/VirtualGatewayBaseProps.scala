package io.burkard.cdk.services.appmesh

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualGatewayBaseProps {

  def apply(
    backendDefaults: Option[software.amazon.awscdk.services.appmesh.BackendDefaults] = None,
    listeners: Option[List[_ <: software.amazon.awscdk.services.appmesh.VirtualGatewayListener]] = None,
    virtualGatewayName: Option[String] = None,
    accessLog: Option[software.amazon.awscdk.services.appmesh.AccessLog] = None
  ): software.amazon.awscdk.services.appmesh.VirtualGatewayBaseProps =
    (new software.amazon.awscdk.services.appmesh.VirtualGatewayBaseProps.Builder)
      .backendDefaults(backendDefaults.orNull)
      .listeners(listeners.map(_.asJava).orNull)
      .virtualGatewayName(virtualGatewayName.orNull)
      .accessLog(accessLog.orNull)
      .build()
}
