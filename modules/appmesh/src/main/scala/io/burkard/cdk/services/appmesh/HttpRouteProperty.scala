package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpRouteProperty {

  def apply(
    `match`: software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteMatchProperty,
    action: software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteActionProperty,
    retryPolicy: Option[software.amazon.awscdk.services.appmesh.CfnRoute.HttpRetryPolicyProperty] = None,
    timeout: Option[software.amazon.awscdk.services.appmesh.CfnRoute.HttpTimeoutProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteProperty =
    (new software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteProperty.Builder)
      .`match`(`match`)
      .action(action)
      .retryPolicy(retryPolicy.orNull)
      .timeout(timeout.orNull)
      .build()
}
