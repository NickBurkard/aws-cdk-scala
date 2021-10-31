package io.burkard.cdk.services.opsworks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserProfile {

  def apply(
    internalResourceId: String,
    sshPublicKey: Option[String] = None,
    allowSelfManagement: Option[Boolean] = None,
    sshUsername: Option[String] = None,
    iamUserArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.opsworks.CfnUserProfile =
    software.amazon.awscdk.services.opsworks.CfnUserProfile.Builder
      .create(stackCtx, internalResourceId)
      .sshPublicKey(sshPublicKey.orNull)
      .allowSelfManagement(allowSelfManagement.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sshUsername(sshUsername.orNull)
      .iamUserArn(iamUserArn.orNull)
      .build()
}
