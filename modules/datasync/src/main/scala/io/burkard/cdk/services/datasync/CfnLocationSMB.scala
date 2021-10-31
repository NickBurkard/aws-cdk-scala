package io.burkard.cdk.services.datasync

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLocationSMB {

  def apply(
    internalResourceId: String,
    mountOptions: Option[software.amazon.awscdk.services.datasync.CfnLocationSMB.MountOptionsProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    serverHostname: Option[String] = None,
    subdirectory: Option[String] = None,
    user: Option[String] = None,
    password: Option[String] = None,
    domain: Option[String] = None,
    agentArns: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.datasync.CfnLocationSMB =
    software.amazon.awscdk.services.datasync.CfnLocationSMB.Builder
      .create(stackCtx, internalResourceId)
      .mountOptions(mountOptions.orNull)
      .tags(tags.map(_.asJava).orNull)
      .serverHostname(serverHostname.orNull)
      .subdirectory(subdirectory.orNull)
      .user(user.orNull)
      .password(password.orNull)
      .domain(domain.orNull)
      .agentArns(agentArns.map(_.asJava).orNull)
      .build()
}
