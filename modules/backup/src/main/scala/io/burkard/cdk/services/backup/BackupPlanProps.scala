package io.burkard.cdk.services.backup

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BackupPlanProps {

  def apply(
    backupPlanRules: Option[List[_ <: software.amazon.awscdk.services.backup.BackupPlanRule]] = None,
    backupPlanName: Option[String] = None,
    backupVault: Option[software.amazon.awscdk.services.backup.IBackupVault] = None,
    windowsVss: Option[Boolean] = None
  ): software.amazon.awscdk.services.backup.BackupPlanProps =
    (new software.amazon.awscdk.services.backup.BackupPlanProps.Builder)
      .backupPlanRules(backupPlanRules.map(_.asJava).orNull)
      .backupPlanName(backupPlanName.orNull)
      .backupVault(backupVault.orNull)
      .windowsVss(windowsVss.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
