package io.burkard.cdk.services.backup

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LockConfigurationTypeProperty {

  def apply(
    minRetentionDays: Option[Number] = None,
    changeableForDays: Option[Number] = None,
    maxRetentionDays: Option[Number] = None
  ): software.amazon.awscdk.services.backup.CfnBackupVault.LockConfigurationTypeProperty =
    (new software.amazon.awscdk.services.backup.CfnBackupVault.LockConfigurationTypeProperty.Builder)
      .minRetentionDays(minRetentionDays.orNull)
      .changeableForDays(changeableForDays.orNull)
      .maxRetentionDays(maxRetentionDays.orNull)
      .build()
}
