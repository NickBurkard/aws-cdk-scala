package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AccountTakeoverActionsTypeProperty {

  def apply(
    mediumAction: Option[software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty] = None,
    lowAction: Option[software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty] = None,
    highAction: Option[software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionsTypeProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionsTypeProperty.Builder)
      .mediumAction(mediumAction.orNull)
      .lowAction(lowAction.orNull)
      .highAction(highAction.orNull)
      .build()
}
