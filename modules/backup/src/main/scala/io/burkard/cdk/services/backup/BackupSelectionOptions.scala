package io.burkard.cdk.services.backup

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BackupSelectionOptions {

  def apply(
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    allowRestores: Option[Boolean] = None,
    resources: Option[List[_ <: software.amazon.awscdk.services.backup.BackupResource]] = None,
    backupSelectionName: Option[String] = None
  ): software.amazon.awscdk.services.backup.BackupSelectionOptions =
    (new software.amazon.awscdk.services.backup.BackupSelectionOptions.Builder)
      .role(role.orNull)
      .allowRestores(allowRestores.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .resources(resources.map(_.asJava).orNull)
      .backupSelectionName(backupSelectionName.orNull)
      .build()
}
