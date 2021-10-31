package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TcpRouteSpecOptions {

  def apply(
    priority: Option[Number] = None,
    weightedTargets: Option[List[_ <: software.amazon.awscdk.services.appmesh.WeightedTarget]] = None,
    timeout: Option[software.amazon.awscdk.services.appmesh.TcpTimeout] = None
  ): software.amazon.awscdk.services.appmesh.TcpRouteSpecOptions =
    (new software.amazon.awscdk.services.appmesh.TcpRouteSpecOptions.Builder)
      .priority(priority.orNull)
      .weightedTargets(weightedTargets.map(_.asJava).orNull)
      .timeout(timeout.orNull)
      .build()
}
