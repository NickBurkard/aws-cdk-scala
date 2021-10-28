package io.burkard.cdk.services.datasync

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLocationSMBProps {

  def apply(
    mountOptions: Option[software.amazon.awscdk.services.datasync.CfnLocationSMB.MountOptionsProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    serverHostname: Option[String] = None,
    subdirectory: Option[String] = None,
    user: Option[String] = None,
    password: Option[String] = None,
    domain: Option[String] = None,
    agentArns: Option[List[String]] = None
  ): software.amazon.awscdk.services.datasync.CfnLocationSMBProps =
    (new software.amazon.awscdk.services.datasync.CfnLocationSMBProps.Builder)
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
