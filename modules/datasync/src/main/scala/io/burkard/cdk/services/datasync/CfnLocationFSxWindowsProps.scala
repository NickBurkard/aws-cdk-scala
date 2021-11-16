package io.burkard.cdk.services.datasync

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLocationFSxWindowsProps {

  def apply(
    fsxFilesystemArn: String,
    user: String,
    password: String,
    securityGroupArns: List[String],
    domain: Option[String] = None,
    subdirectory: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.datasync.CfnLocationFSxWindowsProps =
    (new software.amazon.awscdk.services.datasync.CfnLocationFSxWindowsProps.Builder)
      .fsxFilesystemArn(fsxFilesystemArn)
      .user(user)
      .password(password)
      .securityGroupArns(securityGroupArns.asJava)
      .domain(domain.orNull)
      .subdirectory(subdirectory.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
