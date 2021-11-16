package io.burkard.cdk.services.backup

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NotificationObjectTypeProperty {

  def apply(
    backupVaultEvents: List[String],
    snsTopicArn: String
  ): software.amazon.awscdk.services.backup.CfnBackupVault.NotificationObjectTypeProperty =
    (new software.amazon.awscdk.services.backup.CfnBackupVault.NotificationObjectTypeProperty.Builder)
      .backupVaultEvents(backupVaultEvents.asJava)
      .snsTopicArn(snsTopicArn)
      .build()
}
