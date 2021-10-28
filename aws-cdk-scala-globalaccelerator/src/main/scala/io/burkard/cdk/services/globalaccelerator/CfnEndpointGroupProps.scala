package io.burkard.cdk.services.globalaccelerator

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnEndpointGroupProps {

  def apply(
    healthCheckIntervalSeconds: Option[Number] = None,
    healthCheckProtocol: Option[String] = None,
    listenerArn: Option[String] = None,
    endpointGroupRegion: Option[String] = None,
    trafficDialPercentage: Option[Number] = None,
    healthCheckPath: Option[String] = None,
    healthCheckPort: Option[Number] = None,
    portOverrides: Option[List[_]] = None,
    endpointConfigurations: Option[List[_]] = None,
    thresholdCount: Option[Number] = None
  ): software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroupProps =
    (new software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroupProps.Builder)
      .healthCheckIntervalSeconds(healthCheckIntervalSeconds.orNull)
      .healthCheckProtocol(healthCheckProtocol.orNull)
      .listenerArn(listenerArn.orNull)
      .endpointGroupRegion(endpointGroupRegion.orNull)
      .trafficDialPercentage(trafficDialPercentage.orNull)
      .healthCheckPath(healthCheckPath.orNull)
      .healthCheckPort(healthCheckPort.orNull)
      .portOverrides(portOverrides.map(_.asJava).orNull)
      .endpointConfigurations(endpointConfigurations.map(_.asJava).orNull)
      .thresholdCount(thresholdCount.orNull)
      .build()
}
