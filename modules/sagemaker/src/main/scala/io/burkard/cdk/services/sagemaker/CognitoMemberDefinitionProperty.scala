package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CognitoMemberDefinitionProperty {

  def apply(
    cognitoClientId: String,
    cognitoUserGroup: String,
    cognitoUserPool: String
  ): software.amazon.awscdk.services.sagemaker.CfnWorkteam.CognitoMemberDefinitionProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnWorkteam.CognitoMemberDefinitionProperty.Builder)
      .cognitoClientId(cognitoClientId)
      .cognitoUserGroup(cognitoUserGroup)
      .cognitoUserPool(cognitoUserPool)
      .build()
}
