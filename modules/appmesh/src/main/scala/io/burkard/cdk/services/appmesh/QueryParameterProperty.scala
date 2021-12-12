package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object QueryParameterProperty {

  def apply(
    name: String,
    `match`: Option[software.amazon.awscdk.services.appmesh.CfnRoute.HttpQueryParameterMatchProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnRoute.QueryParameterProperty =
    (new software.amazon.awscdk.services.appmesh.CfnRoute.QueryParameterProperty.Builder)
      .name(name)
      .`match`(`match`.orNull)
      .build()
}
