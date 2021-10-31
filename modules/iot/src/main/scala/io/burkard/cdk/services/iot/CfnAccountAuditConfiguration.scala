package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAccountAuditConfiguration {

  def apply(
    internalResourceId: String,
    accountId: Option[String] = None,
    roleArn: Option[String] = None,
    auditCheckConfigurations: Option[software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty] = None,
    auditNotificationTargetConfigurations: Option[software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration =
    software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration.Builder
      .create(stackCtx, internalResourceId)
      .accountId(accountId.orNull)
      .roleArn(roleArn.orNull)
      .auditCheckConfigurations(auditCheckConfigurations.orNull)
      .auditNotificationTargetConfigurations(auditNotificationTargetConfigurations.orNull)
      .build()
}
