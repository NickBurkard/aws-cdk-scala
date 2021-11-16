package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserPoolUserToGroupAttachment {

  def apply(
    internalResourceId: String,
    username: String,
    groupName: String,
    userPoolId: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachment =
    software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachment.Builder
      .create(stackCtx, internalResourceId)
      .username(username)
      .groupName(groupName)
      .userPoolId(userPoolId)
      .build()
}
