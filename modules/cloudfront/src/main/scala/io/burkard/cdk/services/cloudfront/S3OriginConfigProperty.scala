package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3OriginConfigProperty {

  def apply(
    originAccessIdentity: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.S3OriginConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.S3OriginConfigProperty.Builder)
      .originAccessIdentity(originAccessIdentity.orNull)
      .build()
}
