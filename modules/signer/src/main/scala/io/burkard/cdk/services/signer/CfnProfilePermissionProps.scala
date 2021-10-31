package io.burkard.cdk.services.signer

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnProfilePermissionProps {

  def apply(
    profileVersion: Option[String] = None,
    profileName: Option[String] = None,
    principal: Option[String] = None,
    statementId: Option[String] = None,
    action: Option[String] = None
  ): software.amazon.awscdk.services.signer.CfnProfilePermissionProps =
    (new software.amazon.awscdk.services.signer.CfnProfilePermissionProps.Builder)
      .profileVersion(profileVersion.orNull)
      .profileName(profileName.orNull)
      .principal(principal.orNull)
      .statementId(statementId.orNull)
      .action(action.orNull)
      .build()
}
