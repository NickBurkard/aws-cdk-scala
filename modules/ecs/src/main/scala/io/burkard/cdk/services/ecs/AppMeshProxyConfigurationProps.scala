package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AppMeshProxyConfigurationProps {

  def apply(
    proxyEgressPort: Option[Number] = None,
    appPorts: Option[List[_ <: Number]] = None,
    proxyIngressPort: Option[Number] = None,
    egressIgnoredIPs: Option[List[String]] = None,
    ignoredUid: Option[Number] = None,
    ignoredGid: Option[Number] = None,
    egressIgnoredPorts: Option[List[_ <: Number]] = None
  ): software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps =
    (new software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps.Builder)
      .proxyEgressPort(proxyEgressPort.orNull)
      .appPorts(appPorts.map(_.asJava).orNull)
      .proxyIngressPort(proxyIngressPort.orNull)
      .egressIgnoredIPs(egressIgnoredIPs.map(_.asJava).orNull)
      .ignoredUid(ignoredUid.orNull)
      .ignoredGid(ignoredGid.orNull)
      .egressIgnoredPorts(egressIgnoredPorts.map(_.asJava).orNull)
      .build()
}
