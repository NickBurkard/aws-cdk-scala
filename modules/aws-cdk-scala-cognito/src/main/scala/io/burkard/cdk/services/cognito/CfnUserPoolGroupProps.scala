package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnUserPoolGroupProps {

  def apply(
    description: Option[String] = None,
    userPoolId: Option[String] = None,
    precedence: Option[Number] = None,
    roleArn: Option[String] = None,
    groupName: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps.Builder)
      .description(description.orNull)
      .userPoolId(userPoolId.orNull)
      .precedence(precedence.orNull)
      .roleArn(roleArn.orNull)
      .groupName(groupName.orNull)
      .build()
}
