package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LegacyS3OriginProperty {

  def apply(
    dnsName: String,
    originAccessIdentity: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyS3OriginProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyS3OriginProperty.Builder)
      .dnsName(dnsName)
      .originAccessIdentity(originAccessIdentity.orNull)
      .build()
}
