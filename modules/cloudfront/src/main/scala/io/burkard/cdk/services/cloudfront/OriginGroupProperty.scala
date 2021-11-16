package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OriginGroupProperty {

  def apply(
    id: String,
    members: software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMembersProperty,
    failoverCriteria: software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupFailoverCriteriaProperty
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupProperty.Builder)
      .id(id)
      .members(members)
      .failoverCriteria(failoverCriteria)
      .build()
}
