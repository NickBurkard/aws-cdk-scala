package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GrpcRouteSpecOptions {

  def apply(
    priority: Option[Number] = None,
    weightedTargets: Option[List[_ <: software.amazon.awscdk.services.appmesh.WeightedTarget]] = None,
    `match`: Option[software.amazon.awscdk.services.appmesh.GrpcRouteMatch] = None,
    retryPolicy: Option[software.amazon.awscdk.services.appmesh.GrpcRetryPolicy] = None,
    timeout: Option[software.amazon.awscdk.services.appmesh.GrpcTimeout] = None
  ): software.amazon.awscdk.services.appmesh.GrpcRouteSpecOptions =
    (new software.amazon.awscdk.services.appmesh.GrpcRouteSpecOptions.Builder)
      .priority(priority.orNull)
      .weightedTargets(weightedTargets.map(_.asJava).orNull)
      .`match`(`match`.orNull)
      .retryPolicy(retryPolicy.orNull)
      .timeout(timeout.orNull)
      .build()
}
