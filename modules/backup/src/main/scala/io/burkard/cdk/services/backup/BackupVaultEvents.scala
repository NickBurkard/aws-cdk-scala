package io.burkard.cdk.services.backup


sealed abstract class BackupVaultEvents(val underlying: software.amazon.awscdk.services.backup.BackupVaultEvents)
  extends Product
    with Serializable


object BackupVaultEvents {
  implicit def toAws(value: BackupVaultEvents): software.amazon.awscdk.services.backup.BackupVaultEvents =
    Option(value).map(_.underlying).orNull

  case object BackupJobStarted
    extends BackupVaultEvents(software.amazon.awscdk.services.backup.BackupVaultEvents.BACKUP_JOB_STARTED)

  case object BackupJobCompleted
    extends BackupVaultEvents(software.amazon.awscdk.services.backup.BackupVaultEvents.BACKUP_JOB_COMPLETED)

  case object BackupJobSuccessful
    extends BackupVaultEvents(software.amazon.awscdk.services.backup.BackupVaultEvents.BACKUP_JOB_SUCCESSFUL)

  case object BackupJobFailed
    extends BackupVaultEvents(software.amazon.awscdk.services.backup.BackupVaultEvents.BACKUP_JOB_FAILED)

  case object BackupJobExpired
    extends BackupVaultEvents(software.amazon.awscdk.services.backup.BackupVaultEvents.BACKUP_JOB_EXPIRED)

  case object RestoreJobStarted
    extends BackupVaultEvents(software.amazon.awscdk.services.backup.BackupVaultEvents.RESTORE_JOB_STARTED)

  case object RestoreJobCompleted
    extends BackupVaultEvents(software.amazon.awscdk.services.backup.BackupVaultEvents.RESTORE_JOB_COMPLETED)

  case object RestoreJobSuccessful
    extends BackupVaultEvents(software.amazon.awscdk.services.backup.BackupVaultEvents.RESTORE_JOB_SUCCESSFUL)

  case object RestoreJobFailed
    extends BackupVaultEvents(software.amazon.awscdk.services.backup.BackupVaultEvents.RESTORE_JOB_FAILED)

  case object CopyJobStarted
    extends BackupVaultEvents(software.amazon.awscdk.services.backup.BackupVaultEvents.COPY_JOB_STARTED)

  case object CopyJobSuccessful
    extends BackupVaultEvents(software.amazon.awscdk.services.backup.BackupVaultEvents.COPY_JOB_SUCCESSFUL)

  case object CopyJobFailed
    extends BackupVaultEvents(software.amazon.awscdk.services.backup.BackupVaultEvents.COPY_JOB_FAILED)

  case object RecoveryPointModified
    extends BackupVaultEvents(software.amazon.awscdk.services.backup.BackupVaultEvents.RECOVERY_POINT_MODIFIED)

  case object BackupPlanCreated
    extends BackupVaultEvents(software.amazon.awscdk.services.backup.BackupVaultEvents.BACKUP_PLAN_CREATED)

  case object BackupPlanModified
    extends BackupVaultEvents(software.amazon.awscdk.services.backup.BackupVaultEvents.BACKUP_PLAN_MODIFIED)
}
