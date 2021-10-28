package io.burkard.cdk.services.backup

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnBackupPlan {

  def apply(
    internalResourceId: String,
    backupPlan: Option[software.amazon.awscdk.services.backup.CfnBackupPlan.BackupPlanResourceTypeProperty] = None,
    backupPlanTags: Option[Map[String, String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.backup.CfnBackupPlan =
    software.amazon.awscdk.services.backup.CfnBackupPlan.Builder
      .create(stackCtx, internalResourceId)
      .backupPlan(backupPlan.orNull)
      .backupPlanTags(backupPlanTags.map(_.asJava).orNull)
      .build()
}
