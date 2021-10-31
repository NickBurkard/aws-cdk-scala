package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
