package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
