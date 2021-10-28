package io.burkard.cdk.services.globalaccelerator

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EndpointGroupProps {

  def apply(
    endpoints: Option[List[_ <: software.amazon.awscdk.services.globalaccelerator.IEndpoint]] = None,
    endpointGroupName: Option[String] = None,
    healthCheckInterval: Option[software.amazon.awscdk.Duration] = None,
    trafficDialPercentage: Option[Number] = None,
    healthCheckPath: Option[String] = None,
    healthCheckPort: Option[Number] = None,
    region: Option[String] = None,
    healthCheckThreshold: Option[Number] = None,
    portOverrides: Option[List[_ <: software.amazon.awscdk.services.globalaccelerator.PortOverride]] = None,
    listener: Option[software.amazon.awscdk.services.globalaccelerator.IListener] = None,
    healthCheckProtocol: Option[software.amazon.awscdk.services.globalaccelerator.HealthCheckProtocol] = None
  ): software.amazon.awscdk.services.globalaccelerator.EndpointGroupProps =
    (new software.amazon.awscdk.services.globalaccelerator.EndpointGroupProps.Builder)
      .endpoints(endpoints.map(_.asJava).orNull)
      .endpointGroupName(endpointGroupName.orNull)
      .healthCheckInterval(healthCheckInterval.orNull)
      .trafficDialPercentage(trafficDialPercentage.orNull)
      .healthCheckPath(healthCheckPath.orNull)
      .healthCheckPort(healthCheckPort.orNull)
      .region(region.orNull)
      .healthCheckThreshold(healthCheckThreshold.orNull)
      .portOverrides(portOverrides.map(_.asJava).orNull)
      .listener(listener.orNull)
      .healthCheckProtocol(healthCheckProtocol.orNull)
      .build()
}
