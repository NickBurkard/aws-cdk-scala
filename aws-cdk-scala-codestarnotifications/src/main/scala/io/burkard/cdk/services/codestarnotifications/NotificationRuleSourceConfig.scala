package io.burkard.cdk.services.codestarnotifications

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NotificationRuleSourceConfig {

  def apply(
    sourceArn: Option[String] = None
  ): software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig =
    (new software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig.Builder)
      .sourceArn(sourceArn.orNull)
      .build()
}
