package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GrpcGatewayRouteMatchProperty {

  def apply(
    hostname: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameMatchProperty] = None,
    serviceName: Option[String] = None,
    metadata: Option[List[_]] = None
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMatchProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMatchProperty.Builder)
      .hostname(hostname.orNull)
      .serviceName(serviceName.orNull)
      .metadata(metadata.map(_.asJava).orNull)
      .build()
}
