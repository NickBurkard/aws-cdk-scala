package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserPoolUserToGroupAttachmentProps {

  def apply(
    username: String,
    groupName: String,
    userPoolId: String
  ): software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps.Builder)
      .username(username)
      .groupName(groupName)
      .userPoolId(userPoolId)
      .build()
}
