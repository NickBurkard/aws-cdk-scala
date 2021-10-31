package io.burkard.cdk.services.backup

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BackupResource {

  def apply(
    key: Option[String] = None,
    operation: Option[software.amazon.awscdk.services.backup.TagOperation] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.backup.BackupResource =
    software.amazon.awscdk.services.backup.BackupResource.Builder
      .create()
      .key(key.orNull)
      .operation(operation.orNull)
      .value(value.orNull)
      .build()
}
