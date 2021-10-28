package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OriginGroupFailoverCriteriaProperty {

  def apply(
    statusCodes: Option[software.amazon.awscdk.services.cloudfront.CfnDistribution.StatusCodesProperty] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupFailoverCriteriaProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupFailoverCriteriaProperty.Builder)
      .statusCodes(statusCodes.orNull)
      .build()
}
