package io.burkard.cdk.services.backup

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LifecycleResourceTypeProperty {

  def apply(
    deleteAfterDays: Option[Number] = None,
    moveToColdStorageAfterDays: Option[Number] = None
  ): software.amazon.awscdk.services.backup.CfnBackupPlan.LifecycleResourceTypeProperty =
    (new software.amazon.awscdk.services.backup.CfnBackupPlan.LifecycleResourceTypeProperty.Builder)
      .deleteAfterDays(deleteAfterDays.orNull)
      .moveToColdStorageAfterDays(moveToColdStorageAfterDays.orNull)
      .build()
}
