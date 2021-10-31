package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RestrictionsProperty {

  def apply(
    geoRestriction: Option[software.amazon.awscdk.services.cloudfront.CfnDistribution.GeoRestrictionProperty] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.RestrictionsProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.RestrictionsProperty.Builder)
      .geoRestriction(geoRestriction.orNull)
      .build()
}
