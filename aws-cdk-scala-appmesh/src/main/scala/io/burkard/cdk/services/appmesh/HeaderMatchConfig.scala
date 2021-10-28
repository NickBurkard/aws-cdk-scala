package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HeaderMatchConfig {

  def apply(
    headerMatch: Option[software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteHeaderProperty] = None
  ): software.amazon.awscdk.services.appmesh.HeaderMatchConfig =
    (new software.amazon.awscdk.services.appmesh.HeaderMatchConfig.Builder)
      .headerMatch(headerMatch.orNull)
      .build()
}
