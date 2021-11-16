package io.burkard.cdk.services.opsworks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserProfileProps {

  def apply(
    iamUserArn: String,
    sshPublicKey: Option[String] = None,
    allowSelfManagement: Option[Boolean] = None,
    sshUsername: Option[String] = None
  ): software.amazon.awscdk.services.opsworks.CfnUserProfileProps =
    (new software.amazon.awscdk.services.opsworks.CfnUserProfileProps.Builder)
      .iamUserArn(iamUserArn)
      .sshPublicKey(sshPublicKey.orNull)
      .allowSelfManagement(allowSelfManagement.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sshUsername(sshUsername.orNull)
      .build()
}
