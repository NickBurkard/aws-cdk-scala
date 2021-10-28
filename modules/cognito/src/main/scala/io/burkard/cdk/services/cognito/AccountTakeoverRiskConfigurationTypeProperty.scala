package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AccountTakeoverRiskConfigurationTypeProperty {

  def apply(
    notifyConfiguration: Option[software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyConfigurationTypeProperty] = None,
    actions: Option[software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionsTypeProperty] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty.Builder)
      .notifyConfiguration(notifyConfiguration.orNull)
      .actions(actions.orNull)
      .build()
}
