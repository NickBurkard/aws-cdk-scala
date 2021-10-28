package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LegacyS3OriginProperty {

  def apply(
    originAccessIdentity: Option[String] = None,
    dnsName: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyS3OriginProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyS3OriginProperty.Builder)
      .originAccessIdentity(originAccessIdentity.orNull)
      .dnsName(dnsName.orNull)
      .build()
}
