package io.burkard.cdk.services.backup

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LockConfigurationTypeProperty {

  def apply(
    minRetentionDays: Number,
    changeableForDays: Option[Number] = None,
    maxRetentionDays: Option[Number] = None
  ): software.amazon.awscdk.services.backup.CfnBackupVault.LockConfigurationTypeProperty =
    (new software.amazon.awscdk.services.backup.CfnBackupVault.LockConfigurationTypeProperty.Builder)
      .minRetentionDays(minRetentionDays)
      .changeableForDays(changeableForDays.orNull)
      .maxRetentionDays(maxRetentionDays.orNull)
      .build()
}
