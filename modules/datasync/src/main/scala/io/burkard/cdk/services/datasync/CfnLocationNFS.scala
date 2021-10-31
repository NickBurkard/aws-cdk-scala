package io.burkard.cdk.services.datasync

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLocationNFS {

  def apply(
    internalResourceId: String,
    mountOptions: Option[software.amazon.awscdk.services.datasync.CfnLocationNFS.MountOptionsProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    serverHostname: Option[String] = None,
    onPremConfig: Option[software.amazon.awscdk.services.datasync.CfnLocationNFS.OnPremConfigProperty] = None,
    subdirectory: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.datasync.CfnLocationNFS =
    software.amazon.awscdk.services.datasync.CfnLocationNFS.Builder
      .create(stackCtx, internalResourceId)
      .mountOptions(mountOptions.orNull)
      .tags(tags.map(_.asJava).orNull)
      .serverHostname(serverHostname.orNull)
      .onPremConfig(onPremConfig.orNull)
      .subdirectory(subdirectory.orNull)
      .build()
}
