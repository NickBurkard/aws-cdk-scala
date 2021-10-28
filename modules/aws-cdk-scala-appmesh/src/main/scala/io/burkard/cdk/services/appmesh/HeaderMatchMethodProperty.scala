package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HeaderMatchMethodProperty {

  def apply(
    regex: Option[String] = None,
    prefix: Option[String] = None,
    suffix: Option[String] = None,
    exact: Option[String] = None,
    range: Option[software.amazon.awscdk.services.appmesh.CfnRoute.MatchRangeProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnRoute.HeaderMatchMethodProperty =
    (new software.amazon.awscdk.services.appmesh.CfnRoute.HeaderMatchMethodProperty.Builder)
      .regex(regex.orNull)
      .prefix(prefix.orNull)
      .suffix(suffix.orNull)
      .exact(exact.orNull)
      .range(range.orNull)
      .build()
}
