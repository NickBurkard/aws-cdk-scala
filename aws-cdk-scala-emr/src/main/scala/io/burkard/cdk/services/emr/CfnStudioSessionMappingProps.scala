package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnStudioSessionMappingProps {

  def apply(
    studioId: Option[String] = None,
    identityName: Option[String] = None,
    sessionPolicyArn: Option[String] = None,
    identityType: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnStudioSessionMappingProps =
    (new software.amazon.awscdk.services.emr.CfnStudioSessionMappingProps.Builder)
      .studioId(studioId.orNull)
      .identityName(identityName.orNull)
      .sessionPolicyArn(sessionPolicyArn.orNull)
      .identityType(identityType.orNull)
      .build()
}
