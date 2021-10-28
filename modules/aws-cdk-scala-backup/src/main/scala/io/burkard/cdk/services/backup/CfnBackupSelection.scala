package io.burkard.cdk.services.backup

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnBackupSelection {

  def apply(
    internalResourceId: String,
    backupPlanId: Option[String] = None,
    backupSelection: Option[software.amazon.awscdk.services.backup.CfnBackupSelection.BackupSelectionResourceTypeProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.backup.CfnBackupSelection =
    software.amazon.awscdk.services.backup.CfnBackupSelection.Builder
      .create(stackCtx, internalResourceId)
      .backupPlanId(backupPlanId.orNull)
      .backupSelection(backupSelection.orNull)
      .build()
}
