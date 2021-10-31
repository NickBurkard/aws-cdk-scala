package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OriginShieldProperty {

  def apply(
    enabled: Option[Boolean] = None,
    originShieldRegion: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginShieldProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginShieldProperty.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .originShieldRegion(originShieldRegion.orNull)
      .build()
}
