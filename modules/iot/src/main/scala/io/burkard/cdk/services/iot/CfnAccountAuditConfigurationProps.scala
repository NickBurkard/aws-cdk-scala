package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAccountAuditConfigurationProps {

  def apply(
    accountId: String,
    roleArn: String,
    auditCheckConfigurations: software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty,
    auditNotificationTargetConfigurations: Option[software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty] = None
  ): software.amazon.awscdk.services.iot.CfnAccountAuditConfigurationProps =
    (new software.amazon.awscdk.services.iot.CfnAccountAuditConfigurationProps.Builder)
      .accountId(accountId)
      .roleArn(roleArn)
      .auditCheckConfigurations(auditCheckConfigurations)
      .auditNotificationTargetConfigurations(auditNotificationTargetConfigurations.orNull)
      .build()
}
