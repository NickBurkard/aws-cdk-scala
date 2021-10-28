package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnUserPoolRiskConfigurationAttachment {

  def apply(
    internalResourceId: String,
    clientId: Option[String] = None,
    accountTakeoverRiskConfiguration: Option[software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty] = None,
    riskExceptionConfiguration: Option[software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty] = None,
    userPoolId: Option[String] = None,
    compromisedCredentialsRiskConfiguration: Option[software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment =
    software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.Builder
      .create(stackCtx, internalResourceId)
      .clientId(clientId.orNull)
      .accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration.orNull)
      .riskExceptionConfiguration(riskExceptionConfiguration.orNull)
      .userPoolId(userPoolId.orNull)
      .compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration.orNull)
      .build()
}
