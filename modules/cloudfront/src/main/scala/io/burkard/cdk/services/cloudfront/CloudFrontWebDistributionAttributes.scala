package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CloudFrontWebDistributionAttributes {

  def apply(
    domainName: Option[String] = None,
    distributionId: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionAttributes =
    (new software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionAttributes.Builder)
      .domainName(domainName.orNull)
      .distributionId(distributionId.orNull)
      .build()
}
