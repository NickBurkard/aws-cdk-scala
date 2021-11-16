package io.burkard.cdk.services.backup

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnBackupSelectionProps {

  def apply(
    backupPlanId: String,
    backupSelection: software.amazon.awscdk.services.backup.CfnBackupSelection.BackupSelectionResourceTypeProperty
  ): software.amazon.awscdk.services.backup.CfnBackupSelectionProps =
    (new software.amazon.awscdk.services.backup.CfnBackupSelectionProps.Builder)
      .backupPlanId(backupPlanId)
      .backupSelection(backupSelection)
      .build()
}
