package io.burkard.cdk.services.fsx

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AuditLogConfigurationProperty {

  def apply(
    auditLogDestination: Option[String] = None,
    fileAccessAuditLogLevel: Option[String] = None,
    fileShareAccessAuditLogLevel: Option[String] = None
  ): software.amazon.awscdk.services.fsx.CfnFileSystem.AuditLogConfigurationProperty =
    (new software.amazon.awscdk.services.fsx.CfnFileSystem.AuditLogConfigurationProperty.Builder)
      .auditLogDestination(auditLogDestination.orNull)
      .fileAccessAuditLogLevel(fileAccessAuditLogLevel.orNull)
      .fileShareAccessAuditLogLevel(fileShareAccessAuditLogLevel.orNull)
      .build()
}
