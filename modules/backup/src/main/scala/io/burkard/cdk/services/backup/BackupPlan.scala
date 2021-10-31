package io.burkard.cdk.services.backup

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BackupPlan {

  def apply(
    internalResourceId: String,
    backupPlanRules: Option[List[_ <: software.amazon.awscdk.services.backup.BackupPlanRule]] = None,
    backupPlanName: Option[String] = None,
    backupVault: Option[software.amazon.awscdk.services.backup.IBackupVault] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.backup.BackupPlan =
    software.amazon.awscdk.services.backup.BackupPlan.Builder
      .create(stackCtx, internalResourceId)
      .backupPlanRules(backupPlanRules.map(_.asJava).orNull)
      .backupPlanName(backupPlanName.orNull)
      .backupVault(backupVault.orNull)
      .build()
}
