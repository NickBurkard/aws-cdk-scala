package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpPathMatchProperty {

  def apply(
    regex: Option[String] = None,
    exact: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnRoute.HttpPathMatchProperty =
    (new software.amazon.awscdk.services.appmesh.CfnRoute.HttpPathMatchProperty.Builder)
      .regex(regex.orNull)
      .exact(exact.orNull)
      .build()
}
