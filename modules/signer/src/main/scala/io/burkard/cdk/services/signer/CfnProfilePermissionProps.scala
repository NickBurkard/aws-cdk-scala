package io.burkard.cdk.services.signer

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnProfilePermissionProps {

  def apply(
    profileName: String,
    principal: String,
    statementId: String,
    action: String,
    profileVersion: Option[String] = None
  ): software.amazon.awscdk.services.signer.CfnProfilePermissionProps =
    (new software.amazon.awscdk.services.signer.CfnProfilePermissionProps.Builder)
      .profileName(profileName)
      .principal(principal)
      .statementId(statementId)
      .action(action)
      .profileVersion(profileVersion.orNull)
      .build()
}
