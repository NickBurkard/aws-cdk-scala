package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AccountTakeoverActionTypeProperty {

  def apply(
    eventAction: String
  ): software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty.Builder)
      .eventAction(eventAction)
      .build()
}
