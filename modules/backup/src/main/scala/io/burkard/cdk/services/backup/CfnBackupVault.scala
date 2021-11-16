package io.burkard.cdk.services.backup

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnBackupVault {

  def apply(
    internalResourceId: String,
    backupVaultName: String,
    encryptionKeyArn: Option[String] = None,
    backupVaultTags: Option[Map[String, String]] = None,
    notifications: Option[software.amazon.awscdk.services.backup.CfnBackupVault.NotificationObjectTypeProperty] = None,
    accessPolicy: Option[AnyRef] = None,
    lockConfiguration: Option[software.amazon.awscdk.services.backup.CfnBackupVault.LockConfigurationTypeProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.backup.CfnBackupVault =
    software.amazon.awscdk.services.backup.CfnBackupVault.Builder
      .create(stackCtx, internalResourceId)
      .backupVaultName(backupVaultName)
      .encryptionKeyArn(encryptionKeyArn.orNull)
      .backupVaultTags(backupVaultTags.map(_.asJava).orNull)
      .notifications(notifications.orNull)
      .accessPolicy(accessPolicy.orNull)
      .lockConfiguration(lockConfiguration.orNull)
      .build()
}
