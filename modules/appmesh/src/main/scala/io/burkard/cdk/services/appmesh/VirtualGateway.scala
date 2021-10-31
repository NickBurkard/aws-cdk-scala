package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualGateway {

  def apply(
    internalResourceId: String,
    backendDefaults: Option[software.amazon.awscdk.services.appmesh.BackendDefaults] = None,
    listeners: Option[List[_ <: software.amazon.awscdk.services.appmesh.VirtualGatewayListener]] = None,
    mesh: Option[software.amazon.awscdk.services.appmesh.IMesh] = None,
    virtualGatewayName: Option[String] = None,
    accessLog: Option[software.amazon.awscdk.services.appmesh.AccessLog] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appmesh.VirtualGateway =
    software.amazon.awscdk.services.appmesh.VirtualGateway.Builder
      .create(stackCtx, internalResourceId)
      .backendDefaults(backendDefaults.orNull)
      .listeners(listeners.map(_.asJava).orNull)
      .mesh(mesh.orNull)
      .virtualGatewayName(virtualGatewayName.orNull)
      .accessLog(accessLog.orNull)
      .build()
}
