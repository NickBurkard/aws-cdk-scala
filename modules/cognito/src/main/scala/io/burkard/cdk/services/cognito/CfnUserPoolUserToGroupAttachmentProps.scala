package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserPoolUserToGroupAttachmentProps {

  def apply(
    username: Option[String] = None,
    groupName: Option[String] = None,
    userPoolId: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps.Builder)
      .username(username.orNull)
      .groupName(groupName.orNull)
      .userPoolId(userPoolId.orNull)
      .build()
}
