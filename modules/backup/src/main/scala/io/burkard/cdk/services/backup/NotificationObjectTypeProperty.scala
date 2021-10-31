package io.burkard.cdk.services.backup

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
