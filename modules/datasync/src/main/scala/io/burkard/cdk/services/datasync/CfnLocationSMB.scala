package io.burkard.cdk.services.datasync

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLocationSMB {

  def apply(
    internalResourceId: String,
    serverHostname: String,
    subdirectory: String,
    user: String,
    password: String,
    agentArns: List[String],
    mountOptions: Option[software.amazon.awscdk.services.datasync.CfnLocationSMB.MountOptionsProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    domain: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.datasync.CfnLocationSMB =
    software.amazon.awscdk.services.datasync.CfnLocationSMB.Builder
      .create(stackCtx, internalResourceId)
      .serverHostname(serverHostname)
      .subdirectory(subdirectory)
      .user(user)
      .password(password)
      .agentArns(agentArns.asJava)
      .mountOptions(mountOptions.orNull)
      .tags(tags.map(_.asJava).orNull)
      .domain(domain.orNull)
      .build()
}
