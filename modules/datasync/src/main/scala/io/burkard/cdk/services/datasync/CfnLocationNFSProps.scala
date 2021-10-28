package io.burkard.cdk.services.datasync

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLocationNFSProps {

  def apply(
    mountOptions: Option[software.amazon.awscdk.services.datasync.CfnLocationNFS.MountOptionsProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    serverHostname: Option[String] = None,
    onPremConfig: Option[software.amazon.awscdk.services.datasync.CfnLocationNFS.OnPremConfigProperty] = None,
    subdirectory: Option[String] = None
  ): software.amazon.awscdk.services.datasync.CfnLocationNFSProps =
    (new software.amazon.awscdk.services.datasync.CfnLocationNFSProps.Builder)
      .mountOptions(mountOptions.orNull)
      .tags(tags.map(_.asJava).orNull)
      .serverHostname(serverHostname.orNull)
      .onPremConfig(onPremConfig.orNull)
      .subdirectory(subdirectory.orNull)
      .build()
}
