package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object QueryParameterProperty {

  def apply(
    name: String,
    `match`: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpQueryParameterMatchProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.QueryParameterProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.QueryParameterProperty.Builder)
      .name(name)
      .`match`(`match`.orNull)
      .build()
}
