package io.burkard.cdk.services.datasync

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLocationEFS {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    efsFilesystemArn: Option[String] = None,
    ec2Config: Option[software.amazon.awscdk.services.datasync.CfnLocationEFS.Ec2ConfigProperty] = None,
    subdirectory: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.datasync.CfnLocationEFS =
    software.amazon.awscdk.services.datasync.CfnLocationEFS.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .efsFilesystemArn(efsFilesystemArn.orNull)
      .ec2Config(ec2Config.orNull)
      .subdirectory(subdirectory.orNull)
      .build()
}
