package io.burkard.cdk.services.signer

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnProfilePermission {

  def apply(
    internalResourceId: String,
    profileVersion: Option[String] = None,
    profileName: Option[String] = None,
    principal: Option[String] = None,
    statementId: Option[String] = None,
    action: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.signer.CfnProfilePermission =
    software.amazon.awscdk.services.signer.CfnProfilePermission.Builder
      .create(stackCtx, internalResourceId)
      .profileVersion(profileVersion.orNull)
      .profileName(profileName.orNull)
      .principal(principal.orNull)
      .statementId(statementId.orNull)
      .action(action.orNull)
      .build()
}
