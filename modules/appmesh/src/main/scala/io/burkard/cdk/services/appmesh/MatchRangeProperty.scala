package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MatchRangeProperty {

  def apply(
    end: Number,
    start: Number
  ): software.amazon.awscdk.services.appmesh.CfnRoute.MatchRangeProperty =
    (new software.amazon.awscdk.services.appmesh.CfnRoute.MatchRangeProperty.Builder)
      .end(end)
      .start(start)
      .build()
}
