package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MappingRuleProperty {

  def apply(
    claim: Option[String] = None,
    matchType: Option[String] = None,
    roleArn: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.MappingRuleProperty =
    (new software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.MappingRuleProperty.Builder)
      .claim(claim.orNull)
      .matchType(matchType.orNull)
      .roleArn(roleArn.orNull)
      .value(value.orNull)
      .build()
}
