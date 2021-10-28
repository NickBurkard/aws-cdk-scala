package io.burkard.cdk.services.backup

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BackupSelection {

  def apply(
    internalResourceId: String,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    allowRestores: Option[Boolean] = None,
    backupPlan: Option[software.amazon.awscdk.services.backup.IBackupPlan] = None,
    resources: Option[List[_ <: software.amazon.awscdk.services.backup.BackupResource]] = None,
    backupSelectionName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.backup.BackupSelection =
    software.amazon.awscdk.services.backup.BackupSelection.Builder
      .create(stackCtx, internalResourceId)
      .role(role.orNull)
      .allowRestores(allowRestores.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .backupPlan(backupPlan.orNull)
      .resources(resources.map(_.asJava).orNull)
      .backupSelectionName(backupSelectionName.orNull)
      .build()
}
