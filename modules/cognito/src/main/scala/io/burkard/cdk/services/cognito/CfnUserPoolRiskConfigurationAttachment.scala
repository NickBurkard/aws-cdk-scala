package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserPoolRiskConfigurationAttachment {

  def apply(
    internalResourceId: String,
    clientId: String,
    userPoolId: String,
    accountTakeoverRiskConfiguration: Option[software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty] = None,
    riskExceptionConfiguration: Option[software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty] = None,
    compromisedCredentialsRiskConfiguration: Option[software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment =
    software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.Builder
      .create(stackCtx, internalResourceId)
      .clientId(clientId)
      .userPoolId(userPoolId)
      .accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration.orNull)
      .riskExceptionConfiguration(riskExceptionConfiguration.orNull)
      .compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration.orNull)
      .build()
}
