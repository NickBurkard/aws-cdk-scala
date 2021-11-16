package io.burkard.cdk.services.transfer

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HomeDirectoryMapEntryProperty {

  def apply(
    entry: String,
    target: String
  ): software.amazon.awscdk.services.transfer.CfnUser.HomeDirectoryMapEntryProperty =
    (new software.amazon.awscdk.services.transfer.CfnUser.HomeDirectoryMapEntryProperty.Builder)
      .entry(entry)
      .target(target)
      .build()
}
