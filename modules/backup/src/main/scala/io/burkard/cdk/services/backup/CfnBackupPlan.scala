package io.burkard.cdk.services.backup

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnBackupPlan {

  def apply(
    internalResourceId: String,
    backupPlan: software.amazon.awscdk.services.backup.CfnBackupPlan.BackupPlanResourceTypeProperty,
    backupPlanTags: Option[Map[String, String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.backup.CfnBackupPlan =
    software.amazon.awscdk.services.backup.CfnBackupPlan.Builder
      .create(stackCtx, internalResourceId)
      .backupPlan(backupPlan)
      .backupPlanTags(backupPlanTags.map(_.asJava).orNull)
      .build()
}
