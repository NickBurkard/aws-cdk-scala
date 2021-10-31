package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OriginGroupProperty {

  def apply(
    id: Option[String] = None,
    members: Option[software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMembersProperty] = None,
    failoverCriteria: Option[software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupFailoverCriteriaProperty] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupProperty.Builder)
      .id(id.orNull)
      .members(members.orNull)
      .failoverCriteria(failoverCriteria.orNull)
      .build()
}
