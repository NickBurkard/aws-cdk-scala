package io.burkard.cdk.services.datasync

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLocationFSxWindows {

  def apply(
    internalResourceId: String,
    fsxFilesystemArn: String,
    user: String,
    password: String,
    securityGroupArns: List[String],
    domain: Option[String] = None,
    subdirectory: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.datasync.CfnLocationFSxWindows =
    software.amazon.awscdk.services.datasync.CfnLocationFSxWindows.Builder
      .create(stackCtx, internalResourceId)
      .fsxFilesystemArn(fsxFilesystemArn)
      .user(user)
      .password(password)
      .securityGroupArns(securityGroupArns.asJava)
      .domain(domain.orNull)
      .subdirectory(subdirectory.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
