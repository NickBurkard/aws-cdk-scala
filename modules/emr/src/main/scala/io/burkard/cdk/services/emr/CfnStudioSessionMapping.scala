package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStudioSessionMapping {

  def apply(
    internalResourceId: String,
    studioId: String,
    identityName: String,
    sessionPolicyArn: String,
    identityType: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.emr.CfnStudioSessionMapping =
    software.amazon.awscdk.services.emr.CfnStudioSessionMapping.Builder
      .create(stackCtx, internalResourceId)
      .studioId(studioId)
      .identityName(identityName)
      .sessionPolicyArn(sessionPolicyArn)
      .identityType(identityType)
      .build()
}
