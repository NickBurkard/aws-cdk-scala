package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OriginGroupFailoverCriteriaProperty {

  def apply(
    statusCodes: software.amazon.awscdk.services.cloudfront.CfnDistribution.StatusCodesProperty
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupFailoverCriteriaProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupFailoverCriteriaProperty.Builder)
      .statusCodes(statusCodes)
      .build()
}
