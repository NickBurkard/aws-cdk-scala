package io.burkard.cdk.services.codestarnotifications

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NotificationRuleSourceConfig {

  def apply(
    sourceArn: Option[String] = None
  ): software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig =
    (new software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig.Builder)
      .sourceArn(sourceArn.orNull)
      .build()
}
