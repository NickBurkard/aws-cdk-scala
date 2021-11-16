package io.burkard.cdk.services.datasync

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLocationNFSProps {

  def apply(
    serverHostname: String,
    onPremConfig: software.amazon.awscdk.services.datasync.CfnLocationNFS.OnPremConfigProperty,
    subdirectory: String,
    mountOptions: Option[software.amazon.awscdk.services.datasync.CfnLocationNFS.MountOptionsProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.datasync.CfnLocationNFSProps =
    (new software.amazon.awscdk.services.datasync.CfnLocationNFSProps.Builder)
      .serverHostname(serverHostname)
      .onPremConfig(onPremConfig)
      .subdirectory(subdirectory)
      .mountOptions(mountOptions.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
