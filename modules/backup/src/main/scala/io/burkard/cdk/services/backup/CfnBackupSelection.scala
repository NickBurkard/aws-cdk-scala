package io.burkard.cdk.services.backup

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnBackupSelection {

  def apply(
    internalResourceId: String,
    backupPlanId: String,
    backupSelection: software.amazon.awscdk.services.backup.CfnBackupSelection.BackupSelectionResourceTypeProperty
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.backup.CfnBackupSelection =
    software.amazon.awscdk.services.backup.CfnBackupSelection.Builder
      .create(stackCtx, internalResourceId)
      .backupPlanId(backupPlanId)
      .backupSelection(backupSelection)
      .build()
}
