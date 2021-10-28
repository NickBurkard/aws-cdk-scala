package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object QueryParameterProperty {

  def apply(
    name: Option[String] = None,
    `match`: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpQueryParameterMatchProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.QueryParameterProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.QueryParameterProperty.Builder)
      .name(name.orNull)
      .`match`(`match`.orNull)
      .build()
}
