package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpRouteHeaderProperty {

  def apply(
    name: String,
    `match`: Option[software.amazon.awscdk.services.appmesh.CfnRoute.HeaderMatchMethodProperty] = None,
    invert: Option[Boolean] = None
  ): software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteHeaderProperty =
    (new software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteHeaderProperty.Builder)
      .name(name)
      .`match`(`match`.orNull)
      .invert(invert.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
