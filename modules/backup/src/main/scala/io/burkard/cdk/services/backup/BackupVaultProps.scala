package io.burkard.cdk.services.backup

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BackupVaultProps {

  def apply(
    notificationTopic: Option[software.amazon.awscdk.services.sns.ITopic] = None,
    notificationEvents: Option[List[_ <: software.amazon.awscdk.services.backup.BackupVaultEvents]] = None,
    backupVaultName: Option[String] = None,
    blockRecoveryPointDeletion: Option[Boolean] = None,
    accessPolicy: Option[software.amazon.awscdk.services.iam.PolicyDocument] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  ): software.amazon.awscdk.services.backup.BackupVaultProps =
    (new software.amazon.awscdk.services.backup.BackupVaultProps.Builder)
      .notificationTopic(notificationTopic.orNull)
      .notificationEvents(notificationEvents.map(_.asJava).orNull)
      .backupVaultName(backupVaultName.orNull)
      .blockRecoveryPointDeletion(blockRecoveryPointDeletion.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .accessPolicy(accessPolicy.orNull)
      .encryptionKey(encryptionKey.orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
