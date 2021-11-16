package io.burkard.cdk.services.backup

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BackupSelection {

  def apply(
    internalResourceId: String,
    backupPlan: software.amazon.awscdk.services.backup.IBackupPlan,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    allowRestores: Option[Boolean] = None,
    resources: Option[List[_ <: software.amazon.awscdk.services.backup.BackupResource]] = None,
    backupSelectionName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.backup.BackupSelection =
    software.amazon.awscdk.services.backup.BackupSelection.Builder
      .create(stackCtx, internalResourceId)
      .backupPlan(backupPlan)
      .role(role.orNull)
      .allowRestores(allowRestores.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .resources(resources.map(_.asJava).orNull)
      .backupSelectionName(backupSelectionName.orNull)
      .build()
}
