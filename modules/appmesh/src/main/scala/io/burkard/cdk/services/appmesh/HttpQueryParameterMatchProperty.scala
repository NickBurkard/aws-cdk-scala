package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpQueryParameterMatchProperty {

  def apply(
    exact: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnRoute.HttpQueryParameterMatchProperty =
    (new software.amazon.awscdk.services.appmesh.CfnRoute.HttpQueryParameterMatchProperty.Builder)
      .exact(exact.orNull)
      .build()
}
