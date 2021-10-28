package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpGatewayRoutePrefixRewriteProperty {

  def apply(
    value: Option[String] = None,
    defaultPrefix: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty.Builder)
      .value(value.orNull)
      .defaultPrefix(defaultPrefix.orNull)
      .build()
}
