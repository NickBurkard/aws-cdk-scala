package io.burkard.cdk.services.appmesh

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GrpcRouteMatch {

  def apply(
    methodName: Option[String] = None,
    serviceName: Option[String] = None,
    metadata: Option[List[_ <: software.amazon.awscdk.services.appmesh.HeaderMatch]] = None
  ): software.amazon.awscdk.services.appmesh.GrpcRouteMatch =
    (new software.amazon.awscdk.services.appmesh.GrpcRouteMatch.Builder)
      .methodName(methodName.orNull)
      .serviceName(serviceName.orNull)
      .metadata(metadata.map(_.asJava).orNull)
      .build()
}
