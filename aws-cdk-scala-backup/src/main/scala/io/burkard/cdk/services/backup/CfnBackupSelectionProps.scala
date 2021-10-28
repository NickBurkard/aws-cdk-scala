package io.burkard.cdk.services.backup

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnBackupSelectionProps {

  def apply(
    backupPlanId: Option[String] = None,
    backupSelection: Option[software.amazon.awscdk.services.backup.CfnBackupSelection.BackupSelectionResourceTypeProperty] = None
  ): software.amazon.awscdk.services.backup.CfnBackupSelectionProps =
    (new software.amazon.awscdk.services.backup.CfnBackupSelectionProps.Builder)
      .backupPlanId(backupPlanId.orNull)
      .backupSelection(backupSelection.orNull)
      .build()
}
