package io.burkard.cdk.services.datasync

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLocationEFS {

  def apply(
    internalResourceId: String,
    efsFilesystemArn: String,
    ec2Config: software.amazon.awscdk.services.datasync.CfnLocationEFS.Ec2ConfigProperty,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    subdirectory: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.datasync.CfnLocationEFS =
    software.amazon.awscdk.services.datasync.CfnLocationEFS.Builder
      .create(stackCtx, internalResourceId)
      .efsFilesystemArn(efsFilesystemArn)
      .ec2Config(ec2Config)
      .tags(tags.map(_.asJava).orNull)
      .subdirectory(subdirectory.orNull)
      .build()
}
