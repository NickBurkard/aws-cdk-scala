package io.burkard.cdk.services.efs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BackupPolicyProperty {

  def apply(
    status: Option[String] = None
  ): software.amazon.awscdk.services.efs.CfnFileSystem.BackupPolicyProperty =
    (new software.amazon.awscdk.services.efs.CfnFileSystem.BackupPolicyProperty.Builder)
      .status(status.orNull)
      .build()
}
