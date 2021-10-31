package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object QueryParameterMatchConfig {

  def apply(
    queryParameterMatch: Option[software.amazon.awscdk.services.appmesh.CfnRoute.QueryParameterProperty] = None
  ): software.amazon.awscdk.services.appmesh.QueryParameterMatchConfig =
    (new software.amazon.awscdk.services.appmesh.QueryParameterMatchConfig.Builder)
      .queryParameterMatch(queryParameterMatch.orNull)
      .build()
}
