package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpRouteSpecOptions {

  def apply(
    weightedTargets: List[_ <: software.amazon.awscdk.services.appmesh.WeightedTarget],
    priority: Option[Number] = None,
    `match`: Option[software.amazon.awscdk.services.appmesh.HttpRouteMatch] = None,
    retryPolicy: Option[software.amazon.awscdk.services.appmesh.HttpRetryPolicy] = None,
    timeout: Option[software.amazon.awscdk.services.appmesh.HttpTimeout] = None
  ): software.amazon.awscdk.services.appmesh.HttpRouteSpecOptions =
    (new software.amazon.awscdk.services.appmesh.HttpRouteSpecOptions.Builder)
      .weightedTargets(weightedTargets.asJava)
      .priority(priority.orNull)
      .`match`(`match`.orNull)
      .retryPolicy(retryPolicy.orNull)
      .timeout(timeout.orNull)
      .build()
}
