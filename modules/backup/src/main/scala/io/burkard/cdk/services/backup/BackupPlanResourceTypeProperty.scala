package io.burkard.cdk.services.backup

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BackupPlanResourceTypeProperty {

  def apply(
    backupPlanRule: List[_],
    backupPlanName: String,
    advancedBackupSettings: Option[List[_]] = None
  ): software.amazon.awscdk.services.backup.CfnBackupPlan.BackupPlanResourceTypeProperty =
    (new software.amazon.awscdk.services.backup.CfnBackupPlan.BackupPlanResourceTypeProperty.Builder)
      .backupPlanRule(backupPlanRule.asJava)
      .backupPlanName(backupPlanName)
      .advancedBackupSettings(advancedBackupSettings.map(_.asJava).orNull)
      .build()
}
