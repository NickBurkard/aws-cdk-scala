package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserPoolRiskConfigurationAttachmentProps {

  def apply(
    clientId: Option[String] = None,
    accountTakeoverRiskConfiguration: Option[software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty] = None,
    riskExceptionConfiguration: Option[software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty] = None,
    userPoolId: Option[String] = None,
    compromisedCredentialsRiskConfiguration: Option[software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps.Builder)
      .clientId(clientId.orNull)
      .accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration.orNull)
      .riskExceptionConfiguration(riskExceptionConfiguration.orNull)
      .userPoolId(userPoolId.orNull)
      .compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration.orNull)
      .build()
}
