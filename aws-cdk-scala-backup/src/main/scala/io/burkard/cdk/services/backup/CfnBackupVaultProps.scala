package io.burkard.cdk.services.backup

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnBackupVaultProps {

  def apply(
    backupVaultName: Option[String] = None,
    encryptionKeyArn: Option[String] = None,
    backupVaultTags: Option[Map[String, String]] = None,
    notifications: Option[software.amazon.awscdk.services.backup.CfnBackupVault.NotificationObjectTypeProperty] = None,
    accessPolicy: Option[AnyRef] = None,
    lockConfiguration: Option[software.amazon.awscdk.services.backup.CfnBackupVault.LockConfigurationTypeProperty] = None
  ): software.amazon.awscdk.services.backup.CfnBackupVaultProps =
    (new software.amazon.awscdk.services.backup.CfnBackupVaultProps.Builder)
      .backupVaultName(backupVaultName.orNull)
      .encryptionKeyArn(encryptionKeyArn.orNull)
      .backupVaultTags(backupVaultTags.map(_.asJava).orNull)
      .notifications(notifications.orNull)
      .accessPolicy(accessPolicy.orNull)
      .lockConfiguration(lockConfiguration.orNull)
      .build()
}
