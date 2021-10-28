package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAccountAuditConfigurationProps {

  def apply(
    accountId: Option[String] = None,
    roleArn: Option[String] = None,
    auditCheckConfigurations: Option[software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty] = None,
    auditNotificationTargetConfigurations: Option[software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty] = None
  ): software.amazon.awscdk.services.iot.CfnAccountAuditConfigurationProps =
    (new software.amazon.awscdk.services.iot.CfnAccountAuditConfigurationProps.Builder)
      .accountId(accountId.orNull)
      .roleArn(roleArn.orNull)
      .auditCheckConfigurations(auditCheckConfigurations.orNull)
      .auditNotificationTargetConfigurations(auditNotificationTargetConfigurations.orNull)
      .build()
}
