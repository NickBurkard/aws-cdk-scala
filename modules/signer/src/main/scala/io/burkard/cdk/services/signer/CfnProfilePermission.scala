package io.burkard.cdk.services.signer

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnProfilePermission {

  def apply(
    internalResourceId: String,
    profileName: String,
    principal: String,
    statementId: String,
    action: String,
    profileVersion: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.signer.CfnProfilePermission =
    software.amazon.awscdk.services.signer.CfnProfilePermission.Builder
      .create(stackCtx, internalResourceId)
      .profileName(profileName)
      .principal(principal)
      .statementId(statementId)
      .action(action)
      .profileVersion(profileVersion.orNull)
      .build()
}
