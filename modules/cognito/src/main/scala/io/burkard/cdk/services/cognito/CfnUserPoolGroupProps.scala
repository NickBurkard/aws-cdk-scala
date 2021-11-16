package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserPoolGroupProps {

  def apply(
    userPoolId: String,
    description: Option[String] = None,
    precedence: Option[Number] = None,
    roleArn: Option[String] = None,
    groupName: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps.Builder)
      .userPoolId(userPoolId)
      .description(description.orNull)
      .precedence(precedence.orNull)
      .roleArn(roleArn.orNull)
      .groupName(groupName.orNull)
      .build()
}
