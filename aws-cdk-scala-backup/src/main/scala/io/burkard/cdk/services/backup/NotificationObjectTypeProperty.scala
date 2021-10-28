package io.burkard.cdk.services.backup

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NotificationObjectTypeProperty {

  def apply(
    backupVaultEvents: Option[List[String]] = None,
    snsTopicArn: Option[String] = None
  ): software.amazon.awscdk.services.backup.CfnBackupVault.NotificationObjectTypeProperty =
    (new software.amazon.awscdk.services.backup.CfnBackupVault.NotificationObjectTypeProperty.Builder)
      .backupVaultEvents(backupVaultEvents.map(_.asJava).orNull)
      .snsTopicArn(snsTopicArn.orNull)
      .build()
}
