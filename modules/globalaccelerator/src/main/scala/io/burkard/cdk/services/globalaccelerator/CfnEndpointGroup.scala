package io.burkard.cdk.services.globalaccelerator

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEndpointGroup {

  def apply(
    internalResourceId: String,
    listenerArn: String,
    endpointGroupRegion: String,
    healthCheckIntervalSeconds: Option[Number] = None,
    healthCheckProtocol: Option[String] = None,
    trafficDialPercentage: Option[Number] = None,
    healthCheckPath: Option[String] = None,
    healthCheckPort: Option[Number] = None,
    portOverrides: Option[List[_]] = None,
    endpointConfigurations: Option[List[_]] = None,
    thresholdCount: Option[Number] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup =
    software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup.Builder
      .create(stackCtx, internalResourceId)
      .listenerArn(listenerArn)
      .endpointGroupRegion(endpointGroupRegion)
      .healthCheckIntervalSeconds(healthCheckIntervalSeconds.orNull)
      .healthCheckProtocol(healthCheckProtocol.orNull)
      .trafficDialPercentage(trafficDialPercentage.orNull)
      .healthCheckPath(healthCheckPath.orNull)
      .healthCheckPort(healthCheckPort.orNull)
      .portOverrides(portOverrides.map(_.asJava).orNull)
      .endpointConfigurations(endpointConfigurations.map(_.asJava).orNull)
      .thresholdCount(thresholdCount.orNull)
      .build()
}
