package io.burkard.cdk.services.appmesh

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpRouteSpecOptions {

  def apply(
    priority: Option[Number] = None,
    weightedTargets: Option[List[_ <: software.amazon.awscdk.services.appmesh.WeightedTarget]] = None,
    `match`: Option[software.amazon.awscdk.services.appmesh.HttpRouteMatch] = None,
    retryPolicy: Option[software.amazon.awscdk.services.appmesh.HttpRetryPolicy] = None,
    timeout: Option[software.amazon.awscdk.services.appmesh.HttpTimeout] = None
  ): software.amazon.awscdk.services.appmesh.HttpRouteSpecOptions =
    (new software.amazon.awscdk.services.appmesh.HttpRouteSpecOptions.Builder)
      .priority(priority.orNull)
      .weightedTargets(weightedTargets.map(_.asJava).orNull)
      .`match`(`match`.orNull)
      .retryPolicy(retryPolicy.orNull)
      .timeout(timeout.orNull)
      .build()
}
