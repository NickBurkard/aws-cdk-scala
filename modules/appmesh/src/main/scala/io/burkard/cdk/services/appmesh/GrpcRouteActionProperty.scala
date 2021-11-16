package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GrpcRouteActionProperty {

  def apply(
    weightedTargets: List[_]
  ): software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteActionProperty =
    (new software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteActionProperty.Builder)
      .weightedTargets(weightedTargets.asJava)
      .build()
}
