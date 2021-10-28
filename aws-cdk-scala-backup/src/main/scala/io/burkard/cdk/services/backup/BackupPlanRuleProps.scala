package io.burkard.cdk.services.backup

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BackupPlanRuleProps {

  def apply(
    ruleName: Option[String] = None,
    completionWindow: Option[software.amazon.awscdk.Duration] = None,
    deleteAfter: Option[software.amazon.awscdk.Duration] = None,
    scheduleExpression: Option[software.amazon.awscdk.services.events.Schedule] = None,
    backupVault: Option[software.amazon.awscdk.services.backup.IBackupVault] = None,
    startWindow: Option[software.amazon.awscdk.Duration] = None,
    moveToColdStorageAfter: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.backup.BackupPlanRuleProps =
    (new software.amazon.awscdk.services.backup.BackupPlanRuleProps.Builder)
      .ruleName(ruleName.orNull)
      .completionWindow(completionWindow.orNull)
      .deleteAfter(deleteAfter.orNull)
      .scheduleExpression(scheduleExpression.orNull)
      .backupVault(backupVault.orNull)
      .startWindow(startWindow.orNull)
      .moveToColdStorageAfter(moveToColdStorageAfter.orNull)
      .build()
}
