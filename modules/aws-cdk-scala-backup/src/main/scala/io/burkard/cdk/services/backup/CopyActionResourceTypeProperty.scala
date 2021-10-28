package io.burkard.cdk.services.backup

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CopyActionResourceTypeProperty {

  def apply(
    lifecycle: Option[software.amazon.awscdk.services.backup.CfnBackupPlan.LifecycleResourceTypeProperty] = None,
    destinationBackupVaultArn: Option[String] = None
  ): software.amazon.awscdk.services.backup.CfnBackupPlan.CopyActionResourceTypeProperty =
    (new software.amazon.awscdk.services.backup.CfnBackupPlan.CopyActionResourceTypeProperty.Builder)
      .lifecycle(lifecycle.orNull)
      .destinationBackupVaultArn(destinationBackupVaultArn.orNull)
      .build()
}
