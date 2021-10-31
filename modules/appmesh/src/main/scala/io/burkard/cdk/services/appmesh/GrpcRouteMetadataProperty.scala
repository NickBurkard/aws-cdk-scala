package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GrpcRouteMetadataProperty {

  def apply(
    name: Option[String] = None,
    `match`: Option[software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataMatchMethodProperty] = None,
    invert: Option[Boolean] = None
  ): software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataProperty =
    (new software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteMetadataProperty.Builder)
      .name(name.orNull)
      .`match`(`match`.orNull)
      .invert(invert.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
