package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RestrictionsProperty {

  def apply(
    geoRestriction: software.amazon.awscdk.services.cloudfront.CfnDistribution.GeoRestrictionProperty
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.RestrictionsProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.RestrictionsProperty.Builder)
      .geoRestriction(geoRestriction)
      .build()
}
