package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
