package io.burkard.cdk.services.backup

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CopyActionResourceTypeProperty {

  def apply(
    destinationBackupVaultArn: String,
    lifecycle: Option[software.amazon.awscdk.services.backup.CfnBackupPlan.LifecycleResourceTypeProperty] = None
  ): software.amazon.awscdk.services.backup.CfnBackupPlan.CopyActionResourceTypeProperty =
    (new software.amazon.awscdk.services.backup.CfnBackupPlan.CopyActionResourceTypeProperty.Builder)
      .destinationBackupVaultArn(destinationBackupVaultArn)
      .lifecycle(lifecycle.orNull)
      .build()
}
