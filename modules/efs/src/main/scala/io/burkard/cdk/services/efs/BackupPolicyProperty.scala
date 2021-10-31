package io.burkard.cdk.services.efs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BackupPolicyProperty {

  def apply(
    status: Option[String] = None
  ): software.amazon.awscdk.services.efs.CfnFileSystem.BackupPolicyProperty =
    (new software.amazon.awscdk.services.efs.CfnFileSystem.BackupPolicyProperty.Builder)
      .status(status.orNull)
      .build()
}
