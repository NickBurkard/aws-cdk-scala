package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MatchRangeProperty {

  def apply(
    end: Option[Number] = None,
    start: Option[Number] = None
  ): software.amazon.awscdk.services.appmesh.CfnRoute.MatchRangeProperty =
    (new software.amazon.awscdk.services.appmesh.CfnRoute.MatchRangeProperty.Builder)
      .end(end.orNull)
      .start(start.orNull)
      .build()
}
