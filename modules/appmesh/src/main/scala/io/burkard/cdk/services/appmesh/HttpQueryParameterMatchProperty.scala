package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpQueryParameterMatchProperty {

  def apply(
    exact: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpQueryParameterMatchProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpQueryParameterMatchProperty.Builder)
      .exact(exact.orNull)
      .build()
}
