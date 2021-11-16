package io.burkard.cdk.services.datasync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NameNodeProperty {

  def apply(
    hostname: String,
    port: Number
  ): software.amazon.awscdk.services.datasync.CfnLocationHDFS.NameNodeProperty =
    (new software.amazon.awscdk.services.datasync.CfnLocationHDFS.NameNodeProperty.Builder)
      .hostname(hostname)
      .port(port)
      .build()
}
