package io.burkard.cdk.services.docdb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BackupProps {

  def apply(
    retention: software.amazon.awscdk.Duration,
    preferredWindow: Option[String] = None
  ): software.amazon.awscdk.services.docdb.BackupProps =
    (new software.amazon.awscdk.services.docdb.BackupProps.Builder)
      .retention(retention)
      .preferredWindow(preferredWindow.orNull)
      .build()
}
