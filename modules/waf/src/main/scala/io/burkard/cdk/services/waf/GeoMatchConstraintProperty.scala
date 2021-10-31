package io.burkard.cdk.services.waf

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GeoMatchConstraintProperty {

  def apply(
    `type`: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet.GeoMatchConstraintProperty =
    (new software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet.GeoMatchConstraintProperty.Builder)
      .`type`(`type`.orNull)
      .value(value.orNull)
      .build()
}
