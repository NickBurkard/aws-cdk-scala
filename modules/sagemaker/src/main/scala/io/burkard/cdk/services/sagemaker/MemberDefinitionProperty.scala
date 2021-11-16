package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MemberDefinitionProperty {

  def apply(
    cognitoMemberDefinition: software.amazon.awscdk.services.sagemaker.CfnWorkteam.CognitoMemberDefinitionProperty
  ): software.amazon.awscdk.services.sagemaker.CfnWorkteam.MemberDefinitionProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnWorkteam.MemberDefinitionProperty.Builder)
      .cognitoMemberDefinition(cognitoMemberDefinition)
      .build()
}
