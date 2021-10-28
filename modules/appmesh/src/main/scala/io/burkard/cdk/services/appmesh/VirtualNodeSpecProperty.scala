package io.burkard.cdk.services.appmesh

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualNodeSpecProperty {

  def apply(
    backendDefaults: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendDefaultsProperty] = None,
    logging: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.LoggingProperty] = None,
    listeners: Option[List[_]] = None,
    backends: Option[List[_]] = None,
    serviceDiscovery: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.ServiceDiscoveryProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeSpecProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeSpecProperty.Builder)
      .backendDefaults(backendDefaults.orNull)
      .logging(logging.orNull)
      .listeners(listeners.map(_.asJava).orNull)
      .backends(backends.map(_.asJava).orNull)
      .serviceDiscovery(serviceDiscovery.orNull)
      .build()
}