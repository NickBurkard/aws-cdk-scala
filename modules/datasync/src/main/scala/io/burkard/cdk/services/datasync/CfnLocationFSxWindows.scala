package io.burkard.cdk.services.datasync

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
