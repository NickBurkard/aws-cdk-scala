package io.burkard.cdk.services.datasync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MountOptionsProperty {

  def apply(
    version: Option[String] = None
  ): software.amazon.awscdk.services.datasync.CfnLocationSMB.MountOptionsProperty =
    (new software.amazon.awscdk.services.datasync.CfnLocationSMB.MountOptionsProperty.Builder)
      .version(version.orNull)
      .build()
}
