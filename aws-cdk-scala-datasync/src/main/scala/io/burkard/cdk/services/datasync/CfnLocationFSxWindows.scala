package io.burkard.cdk.services.datasync

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLocationFSxWindows {

  def apply(
    internalResourceId: String,
    domain: Option[String] = None,
    fsxFilesystemArn: Option[String] = None,
    subdirectory: Option[String] = None,
    user: Option[String] = None,
    password: Option[String] = None,
    securityGroupArns: Option[List[String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.datasync.CfnLocationFSxWindows =
    software.amazon.awscdk.services.datasync.CfnLocationFSxWindows.Builder
      .create(stackCtx, internalResourceId)
      .domain(domain.orNull)
      .fsxFilesystemArn(fsxFilesystemArn.orNull)
      .subdirectory(subdirectory.orNull)
      .user(user.orNull)
      .password(password.orNull)
      .securityGroupArns(securityGroupArns.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
