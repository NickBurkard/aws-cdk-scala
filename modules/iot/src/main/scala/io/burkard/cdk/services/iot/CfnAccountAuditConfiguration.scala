package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAccountAuditConfiguration {

  def apply(
    internalResourceId: String,
    accountId: String,
    roleArn: String,
    auditCheckConfigurations: software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty,
    auditNotificationTargetConfigurations: Option[software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration =
    software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.Builder
      .create(stackCtx, internalResourceId)
      .accountId(accountId)
      .roleArn(roleArn)
      .auditCheckConfigurations(auditCheckConfigurations)
      .auditNotificationTargetConfigurations(auditNotificationTargetConfigurations.orNull)
      .build()
}
