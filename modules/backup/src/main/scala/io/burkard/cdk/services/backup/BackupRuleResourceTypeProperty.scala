package io.burkard.cdk.services.backup

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BackupRuleResourceTypeProperty {

  def apply(
    ruleName: String,
    targetBackupVault: String,
    lifecycle: Option[software.amazon.awscdk.services.backup.CfnBackupPlan.LifecycleResourceTypeProperty] = None,
    completionWindowMinutes: Option[Number] = None,
    copyActions: Option[List[_]] = None,
    scheduleExpression: Option[String] = None,
    enableContinuousBackup: Option[Boolean] = None,
    recoveryPointTags: Option[Map[String, String]] = None,
    startWindowMinutes: Option[Number] = None
  ): software.amazon.awscdk.services.backup.CfnBackupPlan.BackupRuleResourceTypeProperty =
    (new software.amazon.awscdk.services.backup.CfnBackupPlan.BackupRuleResourceTypeProperty.Builder)
      .ruleName(ruleName)
      .targetBackupVault(targetBackupVault)
      .lifecycle(lifecycle.orNull)
      .completionWindowMinutes(completionWindowMinutes.orNull)
      .copyActions(copyActions.map(_.asJava).orNull)
      .scheduleExpression(scheduleExpression.orNull)
      .enableContinuousBackup(enableContinuousBackup.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .recoveryPointTags(recoveryPointTags.map(_.asJava).orNull)
      .startWindowMinutes(startWindowMinutes.orNull)
      .build()
}
