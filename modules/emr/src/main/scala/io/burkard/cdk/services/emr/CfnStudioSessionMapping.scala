package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStudioSessionMapping {

  def apply(
    internalResourceId: String,
    studioId: Option[String] = None,
    identityName: Option[String] = None,
    sessionPolicyArn: Option[String] = None,
    identityType: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.emr.CfnStudioSessionMapping =
    software.amazon.awscdk.services.emr.CfnStudioSessionMapping.Builder
      .create(stackCtx, internalResourceId)
      .studioId(studioId.orNull)
      .identityName(identityName.orNull)
      .sessionPolicyArn(sessionPolicyArn.orNull)
      .identityType(identityType.orNull)
      .build()
}
