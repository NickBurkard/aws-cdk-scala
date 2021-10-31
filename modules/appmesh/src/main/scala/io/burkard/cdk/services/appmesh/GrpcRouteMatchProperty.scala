package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GrpcRouteMatchProperty {

  def apply(
    methodName: Option[String] = None,
    serviceName: Option[String] = None,
    metadata: Option[List[_]] = None
  ): software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMatchProperty =
    (new software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMatchProperty.Builder)
      .methodName(methodName.orNull)
      .serviceName(serviceName.orNull)
      .metadata(metadata.map(_.asJava).orNull)
      .build()
}
