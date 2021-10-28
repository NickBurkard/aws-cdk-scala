package io.burkard.cdk.services.backup

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnBackupPlanProps {

  def apply(
    backupPlan: Option[software.amazon.awscdk.services.backup.CfnBackupPlan.BackupPlanResourceTypeProperty] = None,
    backupPlanTags: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.backup.CfnBackupPlanProps =
    (new software.amazon.awscdk.services.backup.CfnBackupPlanProps.Builder)
      .backupPlan(backupPlan.orNull)
      .backupPlanTags(backupPlanTags.map(_.asJava).orNull)
      .build()
}
