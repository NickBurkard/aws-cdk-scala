package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AuditNotificationTargetConfigurationsProperty {

  def apply(
    sns: Option[software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetProperty] = None
  ): software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty =
    (new software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty.Builder)
      .sns(sns.orNull)
      .build()
}
