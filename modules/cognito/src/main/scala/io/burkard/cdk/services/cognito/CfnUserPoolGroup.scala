package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserPoolGroup {

  def apply(
    internalResourceId: String,
    description: Option[String] = None,
    userPoolId: Option[String] = None,
    precedence: Option[Number] = None,
    roleArn: Option[String] = None,
    groupName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cognito.CfnUserPoolGroup =
    software.amazon.awscdk.services.cognito.CfnUserPoolGroup.Builder
      .create(stackCtx, internalResourceId)
      .description(description.orNull)
      .userPoolId(userPoolId.orNull)
      .precedence(precedence.orNull)
      .roleArn(roleArn.orNull)
      .groupName(groupName.orNull)
      .build()
}
