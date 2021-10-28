package io.burkard.cdk.services.docdb

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BackupProps {

  def apply(
    retention: Option[software.amazon.awscdk.Duration] = None,
    preferredWindow: Option[String] = None
  ): software.amazon.awscdk.services.docdb.BackupProps =
    (new software.amazon.awscdk.services.docdb.BackupProps.Builder)
      .retention(retention.orNull)
      .preferredWindow(preferredWindow.orNull)
      .build()
}
