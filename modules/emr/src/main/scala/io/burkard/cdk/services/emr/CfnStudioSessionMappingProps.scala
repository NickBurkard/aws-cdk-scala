package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStudioSessionMappingProps {

  def apply(
    studioId: String,
    identityName: String,
    sessionPolicyArn: String,
    identityType: String
  ): software.amazon.awscdk.services.emr.CfnStudioSessionMappingProps =
    (new software.amazon.awscdk.services.emr.CfnStudioSessionMappingProps.Builder)
      .studioId(studioId)
      .identityName(identityName)
      .sessionPolicyArn(sessionPolicyArn)
      .identityType(identityType)
      .build()
}
