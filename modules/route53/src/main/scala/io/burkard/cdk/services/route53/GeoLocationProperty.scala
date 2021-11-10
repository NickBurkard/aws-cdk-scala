package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GeoLocationProperty {

  def apply(
    continentCode: Option[String] = None,
    countryCode: Option[String] = None,
    subdivisionCode: Option[String] = None
  ): software.amazon.awscdk.services.route53.CfnRecordSetGroup.GeoLocationProperty =
    (new software.amazon.awscdk.services.route53.CfnRecordSetGroup.GeoLocationProperty.Builder)
      .continentCode(continentCode.orNull)
      .countryCode(countryCode.orNull)
      .subdivisionCode(subdivisionCode.orNull)
      .build()
}
