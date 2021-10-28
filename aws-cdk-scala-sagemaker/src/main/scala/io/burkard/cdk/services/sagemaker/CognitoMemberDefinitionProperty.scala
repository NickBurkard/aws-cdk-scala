package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CognitoMemberDefinitionProperty {

  def apply(
    cognitoClientId: Option[String] = None,
    cognitoUserGroup: Option[String] = None,
    cognitoUserPool: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnWorkteam.CognitoMemberDefinitionProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnWorkteam.CognitoMemberDefinitionProperty.Builder)
      .cognitoClientId(cognitoClientId.orNull)
      .cognitoUserGroup(cognitoUserGroup.orNull)
      .cognitoUserPool(cognitoUserPool.orNull)
      .build()
}
