package io.burkard.cdk.services.appmesh

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualGatewayProps {

  def apply(
    backendDefaults: Option[software.amazon.awscdk.services.appmesh.BackendDefaults] = None,
    listeners: Option[List[_ <: software.amazon.awscdk.services.appmesh.VirtualGatewayListener]] = None,
    mesh: Option[software.amazon.awscdk.services.appmesh.IMesh] = None,
    virtualGatewayName: Option[String] = None,
    accessLog: Option[software.amazon.awscdk.services.appmesh.AccessLog] = None
  ): software.amazon.awscdk.services.appmesh.VirtualGatewayProps =
    (new software.amazon.awscdk.services.appmesh.VirtualGatewayProps.Builder)
      .backendDefaults(backendDefaults.orNull)
      .listeners(listeners.map(_.asJava).orNull)
      .mesh(mesh.orNull)
      .virtualGatewayName(virtualGatewayName.orNull)
      .accessLog(accessLog.orNull)
      .build()
}
