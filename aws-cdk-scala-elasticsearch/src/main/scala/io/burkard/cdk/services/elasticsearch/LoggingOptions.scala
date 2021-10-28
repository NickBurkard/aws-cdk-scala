package io.burkard.cdk.services.elasticsearch

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LoggingOptions {

  def apply(
    slowSearchLogGroup: Option[software.amazon.awscdk.services.logs.ILogGroup] = None,
    slowIndexLogEnabled: Option[Boolean] = None,
    appLogEnabled: Option[Boolean] = None,
    appLogGroup: Option[software.amazon.awscdk.services.logs.ILogGroup] = None,
    auditLogEnabled: Option[Boolean] = None,
    slowSearchLogEnabled: Option[Boolean] = None,
    slowIndexLogGroup: Option[software.amazon.awscdk.services.logs.ILogGroup] = None,
    auditLogGroup: Option[software.amazon.awscdk.services.logs.ILogGroup] = None
  ): software.amazon.awscdk.services.elasticsearch.LoggingOptions =
    (new software.amazon.awscdk.services.elasticsearch.LoggingOptions.Builder)
      .slowSearchLogGroup(slowSearchLogGroup.orNull)
      .slowIndexLogEnabled(slowIndexLogEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .appLogEnabled(appLogEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .appLogGroup(appLogGroup.orNull)
      .auditLogEnabled(auditLogEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .slowSearchLogEnabled(slowSearchLogEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .slowIndexLogGroup(slowIndexLogGroup.orNull)
      .auditLogGroup(auditLogGroup.orNull)
      .build()
}
