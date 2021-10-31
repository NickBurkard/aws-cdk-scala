package io.burkard.cdk.services.codestarnotifications

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NotificationRuleTargetConfig {

  def apply(
    targetAddress: Option[String] = None,
    targetType: Option[String] = None
  ): software.amazon.awscdk.services.codestarnotifications.NotificationRuleTargetConfig =
    (new software.amazon.awscdk.services.codestarnotifications.NotificationRuleTargetConfig.Builder)
      .targetAddress(targetAddress.orNull)
      .targetType(targetType.orNull)
      .build()
}
