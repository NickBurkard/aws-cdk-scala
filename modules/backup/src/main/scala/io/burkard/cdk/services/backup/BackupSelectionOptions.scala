package io.burkard.cdk.services.backup

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BackupSelectionOptions {

  def apply(
    resources: List[_ <: software.amazon.awscdk.services.backup.BackupResource],
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    allowRestores: Option[Boolean] = None,
    backupSelectionName: Option[String] = None
  ): software.amazon.awscdk.services.backup.BackupSelectionOptions =
    (new software.amazon.awscdk.services.backup.BackupSelectionOptions.Builder)
      .resources(resources.asJava)
      .role(role.orNull)
      .allowRestores(allowRestores.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .backupSelectionName(backupSelectionName.orNull)
      .build()
}
