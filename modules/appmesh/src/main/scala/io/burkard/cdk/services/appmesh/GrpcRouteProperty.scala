package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GrpcRouteProperty {

  def apply(
    `match`: software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMatchProperty,
    action: software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteActionProperty,
    retryPolicy: Option[software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRetryPolicyProperty] = None,
    timeout: Option[software.amazon.awscdk.services.appmesh.CfnRoute.GrpcTimeoutProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteProperty =
    (new software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteProperty.Builder)
      .`match`(`match`)
      .action(action)
      .retryPolicy(retryPolicy.orNull)
      .timeout(timeout.orNull)
      .build()
}
