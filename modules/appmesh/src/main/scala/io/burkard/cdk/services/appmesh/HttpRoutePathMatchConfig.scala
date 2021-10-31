package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpRoutePathMatchConfig {

  def apply(
    wholePathMatch: Option[software.amazon.awscdk.services.appmesh.CfnRoute.HttpPathMatchProperty] = None,
    prefixPathMatch: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.HttpRoutePathMatchConfig =
    (new software.amazon.awscdk.services.appmesh.HttpRoutePathMatchConfig.Builder)
      .wholePathMatch(wholePathMatch.orNull)
      .prefixPathMatch(prefixPathMatch.orNull)
      .build()
}
