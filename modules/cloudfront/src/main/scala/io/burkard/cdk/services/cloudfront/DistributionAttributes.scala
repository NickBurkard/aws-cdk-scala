package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DistributionAttributes {

  def apply(
    domainName: Option[String] = None,
    distributionId: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.DistributionAttributes =
    (new software.amazon.awscdk.services.cloudfront.DistributionAttributes.Builder)
      .domainName(domainName.orNull)
      .distributionId(distributionId.orNull)
      .build()
}
