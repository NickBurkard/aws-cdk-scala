package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpTimeoutProperty {

  def apply(
    perRequest: Option[software.amazon.awscdk.services.appmesh.CfnRoute.DurationProperty] = None,
    idle: Option[software.amazon.awscdk.services.appmesh.CfnRoute.DurationProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnRoute.HttpTimeoutProperty =
    (new software.amazon.awscdk.services.appmesh.CfnRoute.HttpTimeoutProperty.Builder)
      .perRequest(perRequest.orNull)
      .idle(idle.orNull)
      .build()
}
