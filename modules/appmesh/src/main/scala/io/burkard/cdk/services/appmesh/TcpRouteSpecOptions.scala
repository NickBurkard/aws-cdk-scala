package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TcpRouteSpecOptions {

  def apply(
    weightedTargets: List[_ <: software.amazon.awscdk.services.appmesh.WeightedTarget],
    priority: Option[Number] = None,
    timeout: Option[software.amazon.awscdk.services.appmesh.TcpTimeout] = None
  ): software.amazon.awscdk.services.appmesh.TcpRouteSpecOptions =
    (new software.amazon.awscdk.services.appmesh.TcpRouteSpecOptions.Builder)
      .weightedTargets(weightedTargets.asJava)
      .priority(priority.orNull)
      .timeout(timeout.orNull)
      .build()
}
