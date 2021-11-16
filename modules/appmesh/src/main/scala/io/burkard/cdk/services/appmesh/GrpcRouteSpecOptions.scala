package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GrpcRouteSpecOptions {

  def apply(
    weightedTargets: List[_ <: software.amazon.awscdk.services.appmesh.WeightedTarget],
    `match`: software.amazon.awscdk.services.appmesh.GrpcRouteMatch,
    priority: Option[Number] = None,
    retryPolicy: Option[software.amazon.awscdk.services.appmesh.GrpcRetryPolicy] = None,
    timeout: Option[software.amazon.awscdk.services.appmesh.GrpcTimeout] = None
  ): software.amazon.awscdk.services.appmesh.GrpcRouteSpecOptions =
    (new software.amazon.awscdk.services.appmesh.GrpcRouteSpecOptions.Builder)
      .weightedTargets(weightedTargets.asJava)
      .`match`(`match`)
      .priority(priority.orNull)
      .retryPolicy(retryPolicy.orNull)
      .timeout(timeout.orNull)
      .build()
}
