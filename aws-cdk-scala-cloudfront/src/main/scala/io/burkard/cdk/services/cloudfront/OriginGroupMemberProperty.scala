package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OriginGroupMemberProperty {

  def apply(
    originId: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMemberProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMemberProperty.Builder)
      .originId(originId.orNull)
      .build()
}
