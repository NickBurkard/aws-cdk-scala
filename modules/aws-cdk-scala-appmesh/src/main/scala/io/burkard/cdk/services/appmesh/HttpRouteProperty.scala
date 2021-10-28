package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpRouteProperty {

  def apply(
    `match`: Option[software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteMatchProperty] = None,
    retryPolicy: Option[software.amazon.awscdk.services.appmesh.CfnRoute.HttpRetryPolicyProperty] = None,
    timeout: Option[software.amazon.awscdk.services.appmesh.CfnRoute.HttpTimeoutProperty] = None,
    action: Option[software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteActionProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteProperty =
    (new software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteProperty.Builder)
      .`match`(`match`.orNull)
      .retryPolicy(retryPolicy.orNull)
      .timeout(timeout.orNull)
      .action(action.orNull)
      .build()
}
