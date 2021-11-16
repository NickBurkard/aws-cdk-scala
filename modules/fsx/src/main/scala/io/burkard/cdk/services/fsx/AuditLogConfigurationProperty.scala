package io.burkard.cdk.services.fsx

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AuditLogConfigurationProperty {

  def apply(
    fileAccessAuditLogLevel: String,
    fileShareAccessAuditLogLevel: String,
    auditLogDestination: Option[String] = None
  ): software.amazon.awscdk.services.fsx.CfnFileSystem.AuditLogConfigurationProperty =
    (new software.amazon.awscdk.services.fsx.CfnFileSystem.AuditLogConfigurationProperty.Builder)
      .fileAccessAuditLogLevel(fileAccessAuditLogLevel)
      .fileShareAccessAuditLogLevel(fileShareAccessAuditLogLevel)
      .auditLogDestination(auditLogDestination.orNull)
      .build()
}
