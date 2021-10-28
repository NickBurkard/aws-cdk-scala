package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GrpcRouteProperty {

  def apply(
    `match`: Option[software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMatchProperty] = None,
    retryPolicy: Option[software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRetryPolicyProperty] = None,
    timeout: Option[software.amazon.awscdk.services.appmesh.CfnRoute.GrpcTimeoutProperty] = None,
    action: Option[software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteActionProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteProperty =
    (new software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteProperty.Builder)
      .`match`(`match`.orNull)
      .retryPolicy(retryPolicy.orNull)
      .timeout(timeout.orNull)
      .action(action.orNull)
      .build()
}
