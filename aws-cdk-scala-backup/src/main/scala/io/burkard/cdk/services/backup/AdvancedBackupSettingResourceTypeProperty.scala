package io.burkard.cdk.services.backup

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AdvancedBackupSettingResourceTypeProperty {

  def apply(
    resourceType: Option[String] = None,
    backupOptions: Option[AnyRef] = None
  ): software.amazon.awscdk.services.backup.CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty =
    (new software.amazon.awscdk.services.backup.CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty.Builder)
      .resourceType(resourceType.orNull)
      .backupOptions(backupOptions.orNull)
      .build()
}
