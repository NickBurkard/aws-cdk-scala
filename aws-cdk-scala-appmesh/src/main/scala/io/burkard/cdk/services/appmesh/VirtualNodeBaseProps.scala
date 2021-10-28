package io.burkard.cdk.services.appmesh

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualNodeBaseProps {

  def apply(
    backendDefaults: Option[software.amazon.awscdk.services.appmesh.BackendDefaults] = None,
    listeners: Option[List[_ <: software.amazon.awscdk.services.appmesh.VirtualNodeListener]] = None,
    backends: Option[List[_ <: software.amazon.awscdk.services.appmesh.Backend]] = None,
    serviceDiscovery: Option[software.amazon.awscdk.services.appmesh.ServiceDiscovery] = None,
    virtualNodeName: Option[String] = None,
    accessLog: Option[software.amazon.awscdk.services.appmesh.AccessLog] = None
  ): software.amazon.awscdk.services.appmesh.VirtualNodeBaseProps =
    (new software.amazon.awscdk.services.appmesh.VirtualNodeBaseProps.Builder)
      .backendDefaults(backendDefaults.orNull)
      .listeners(listeners.map(_.asJava).orNull)
      .backends(backends.map(_.asJava).orNull)
      .serviceDiscovery(serviceDiscovery.orNull)
      .virtualNodeName(virtualNodeName.orNull)
      .accessLog(accessLog.orNull)
      .build()
}
