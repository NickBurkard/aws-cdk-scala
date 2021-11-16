package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3OriginProperty {

  def apply(
    originAccessIdentity: String,
    domainName: String
  ): software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.S3OriginProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution.S3OriginProperty.Builder)
      .originAccessIdentity(originAccessIdentity)
      .domainName(domainName)
      .build()
}
