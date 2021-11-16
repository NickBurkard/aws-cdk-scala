package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserPoolRiskConfigurationAttachmentProps {

  def apply(
    clientId: String,
    userPoolId: String,
    accountTakeoverRiskConfiguration: Option[software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty] = None,
    riskExceptionConfiguration: Option[software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty] = None,
    compromisedCredentialsRiskConfiguration: Option[software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps.Builder)
      .clientId(clientId)
      .userPoolId(userPoolId)
      .accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration.orNull)
      .riskExceptionConfiguration(riskExceptionConfiguration.orNull)
      .compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration.orNull)
      .build()
}
