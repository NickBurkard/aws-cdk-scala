package io.burkard.cdk.services.backup

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BackupPlanResourceTypeProperty {

  def apply(
    backupPlanRule: Option[List[_]] = None,
    backupPlanName: Option[String] = None,
    advancedBackupSettings: Option[List[_]] = None
  ): software.amazon.awscdk.services.backup.CfnBackupPlan.BackupPlanResourceTypeProperty =
    (new software.amazon.awscdk.services.backup.CfnBackupPlan.BackupPlanResourceTypeProperty.Builder)
      .backupPlanRule(backupPlanRule.map(_.asJava).orNull)
      .backupPlanName(backupPlanName.orNull)
      .advancedBackupSettings(advancedBackupSettings.map(_.asJava).orNull)
      .build()
}
