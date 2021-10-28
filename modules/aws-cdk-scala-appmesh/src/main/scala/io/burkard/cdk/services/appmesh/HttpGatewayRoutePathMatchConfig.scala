package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpGatewayRoutePathMatchConfig {

  def apply(
    prefixPathRewrite: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty] = None,
    wholePathMatch: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpPathMatchProperty] = None,
    prefixPathMatch: Option[String] = None,
    wholePathRewrite: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty] = None
  ): software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatchConfig =
    (new software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatchConfig.Builder)
      .prefixPathRewrite(prefixPathRewrite.orNull)
      .wholePathMatch(wholePathMatch.orNull)
      .prefixPathMatch(prefixPathMatch.orNull)
      .wholePathRewrite(wholePathRewrite.orNull)
      .build()
}
