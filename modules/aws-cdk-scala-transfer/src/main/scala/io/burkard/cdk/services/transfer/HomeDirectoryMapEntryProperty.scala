package io.burkard.cdk.services.transfer

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HomeDirectoryMapEntryProperty {

  def apply(
    entry: Option[String] = None,
    target: Option[String] = None
  ): software.amazon.awscdk.services.transfer.CfnUser.HomeDirectoryMapEntryProperty =
    (new software.amazon.awscdk.services.transfer.CfnUser.HomeDirectoryMapEntryProperty.Builder)
      .entry(entry.orNull)
      .target(target.orNull)
      .build()
}
