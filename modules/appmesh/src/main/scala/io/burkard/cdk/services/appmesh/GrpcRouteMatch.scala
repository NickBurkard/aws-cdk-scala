package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
