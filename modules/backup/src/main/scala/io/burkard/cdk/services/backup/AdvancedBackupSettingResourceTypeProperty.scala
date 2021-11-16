package io.burkard.cdk.services.backup

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AdvancedBackupSettingResourceTypeProperty {

  def apply(
    resourceType: String,
    backupOptions: AnyRef
  ): software.amazon.awscdk.services.backup.CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty =
    (new software.amazon.awscdk.services.backup.CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty.Builder)
      .resourceType(resourceType)
      .backupOptions(backupOptions)
      .build()
}
