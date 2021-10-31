package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GrpcGatewayRouteMatch {

  def apply(
    serviceName: Option[String] = None,
    metadata: Option[List[_ <: software.amazon.awscdk.services.appmesh.HeaderMatch]] = None,
    hostname: Option[software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatch] = None,
    rewriteRequestHostname: Option[Boolean] = None
  ): software.amazon.awscdk.services.appmesh.GrpcGatewayRouteMatch =
    (new software.amazon.awscdk.services.appmesh.GrpcGatewayRouteMatch.Builder)
      .serviceName(serviceName.orNull)
      .metadata(metadata.map(_.asJava).orNull)
      .hostname(hostname.orNull)
      .rewriteRequestHostname(rewriteRequestHostname.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
