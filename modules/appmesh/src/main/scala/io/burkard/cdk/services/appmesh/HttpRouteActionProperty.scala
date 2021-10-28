package io.burkard.cdk.services.appmesh

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpRouteActionProperty {

  def apply(
    weightedTargets: Option[List[_]] = None
  ): software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteActionProperty =
    (new software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteActionProperty.Builder)
      .weightedTargets(weightedTargets.map(_.asJava).orNull)
      .build()
}
