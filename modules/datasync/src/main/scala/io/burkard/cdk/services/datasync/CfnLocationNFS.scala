package io.burkard.cdk.services.datasync

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLocationNFS {

  def apply(
    internalResourceId: String,
    serverHostname: String,
    onPremConfig: software.amazon.awscdk.services.datasync.CfnLocationNFS.OnPremConfigProperty,
    subdirectory: String,
    mountOptions: Option[software.amazon.awscdk.services.datasync.CfnLocationNFS.MountOptionsProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.datasync.CfnLocationNFS =
    software.amazon.awscdk.services.datasync.CfnLocationNFS.Builder
      .create(stackCtx, internalResourceId)
      .serverHostname(serverHostname)
      .onPremConfig(onPremConfig)
      .subdirectory(subdirectory)
      .mountOptions(mountOptions.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
