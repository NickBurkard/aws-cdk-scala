package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserPoolUserToGroupAttachment {

  def apply(
    internalResourceId: String,
    username: Option[String] = None,
    groupName: Option[String] = None,
    userPoolId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachment =
    software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachment.Builder
      .create(stackCtx, internalResourceId)
      .username(username.orNull)
      .groupName(groupName.orNull)
      .userPoolId(userPoolId.orNull)
      .build()
}
