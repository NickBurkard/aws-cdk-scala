package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MappingRuleProperty {

  def apply(
    claim: String,
    matchType: String,
    roleArn: String,
    value: String
  ): software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.MappingRuleProperty =
    (new software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.MappingRuleProperty.Builder)
      .claim(claim)
      .matchType(matchType)
      .roleArn(roleArn)
      .value(value)
      .build()
}
