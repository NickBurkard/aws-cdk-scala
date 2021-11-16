package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OriginGroupMemberProperty {

  def apply(
    originId: String
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMemberProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMemberProperty.Builder)
      .originId(originId)
      .build()
}
