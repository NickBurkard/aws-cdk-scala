package io.burkard.cdk.services.backup

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BackupRuleResourceTypeProperty {

  def apply(
    ruleName: Option[String] = None,
    lifecycle: Option[software.amazon.awscdk.services.backup.CfnBackupPlan.LifecycleResourceTypeProperty] = None,
    completionWindowMinutes: Option[Number] = None,
    targetBackupVault: Option[String] = None,
    copyActions: Option[List[_]] = None,
    scheduleExpression: Option[String] = None,
    enableContinuousBackup: Option[Boolean] = None,
    recoveryPointTags: Option[Map[String, String]] = None,
    startWindowMinutes: Option[Number] = None
  ): software.amazon.awscdk.services.backup.CfnBackupPlan.BackupRuleResourceTypeProperty =
    (new software.amazon.awscdk.services.backup.CfnBackupPlan.BackupRuleResourceTypeProperty.Builder)
      .ruleName(ruleName.orNull)
      .lifecycle(lifecycle.orNull)
      .completionWindowMinutes(completionWindowMinutes.orNull)
      .targetBackupVault(targetBackupVault.orNull)
      .copyActions(copyActions.map(_.asJava).orNull)
      .scheduleExpression(scheduleExpression.orNull)
      .enableContinuousBackup(enableContinuousBackup.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .recoveryPointTags(recoveryPointTags.map(_.asJava).orNull)
      .startWindowMinutes(startWindowMinutes.orNull)
      .build()
}
