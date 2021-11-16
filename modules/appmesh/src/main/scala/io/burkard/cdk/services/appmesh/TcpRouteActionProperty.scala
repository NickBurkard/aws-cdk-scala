package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TcpRouteActionProperty {

  def apply(
    weightedTargets: List[_]
  ): software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteActionProperty =
    (new software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteActionProperty.Builder)
      .weightedTargets(weightedTargets.asJava)
      .build()
}
