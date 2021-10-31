package io.burkard.cdk.services.datasync

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLocationEFSProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    efsFilesystemArn: Option[String] = None,
    ec2Config: Option[software.amazon.awscdk.services.datasync.CfnLocationEFS.Ec2ConfigProperty] = None,
    subdirectory: Option[String] = None
  ): software.amazon.awscdk.services.datasync.CfnLocationEFSProps =
    (new software.amazon.awscdk.services.datasync.CfnLocationEFSProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .efsFilesystemArn(efsFilesystemArn.orNull)
      .ec2Config(ec2Config.orNull)
      .subdirectory(subdirectory.orNull)
      .build()
}
