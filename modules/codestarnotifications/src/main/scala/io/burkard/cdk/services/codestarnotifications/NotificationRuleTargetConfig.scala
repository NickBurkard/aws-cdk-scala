package io.burkard.cdk.services.codestarnotifications

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NotificationRuleTargetConfig {

  def apply(
    targetAddress: String,
    targetType: String
  ): software.amazon.awscdk.services.codestarnotifications.NotificationRuleTargetConfig =
    (new software.amazon.awscdk.services.codestarnotifications.NotificationRuleTargetConfig.Builder)
      .targetAddress(targetAddress)
      .targetType(targetType)
      .build()
}
