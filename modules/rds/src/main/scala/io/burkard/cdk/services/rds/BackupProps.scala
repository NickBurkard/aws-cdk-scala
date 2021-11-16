package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BackupProps {

  def apply(
    retention: software.amazon.awscdk.Duration,
    preferredWindow: Option[String] = None
  ): software.amazon.awscdk.services.rds.BackupProps =
    (new software.amazon.awscdk.services.rds.BackupProps.Builder)
      .retention(retention)
      .preferredWindow(preferredWindow.orNull)
      .build()
}
