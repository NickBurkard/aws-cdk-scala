package io.burkard.cdk.services.datasync

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLocationFSxWindowsProps {

  def apply(
    domain: Option[String] = None,
    fsxFilesystemArn: Option[String] = None,
    subdirectory: Option[String] = None,
    user: Option[String] = None,
    password: Option[String] = None,
    securityGroupArns: Option[List[String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.datasync.CfnLocationFSxWindowsProps =
    (new software.amazon.awscdk.services.datasync.CfnLocationFSxWindowsProps.Builder)
      .domain(domain.orNull)
      .fsxFilesystemArn(fsxFilesystemArn.orNull)
      .subdirectory(subdirectory.orNull)
      .user(user.orNull)
      .password(password.orNull)
      .securityGroupArns(securityGroupArns.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
