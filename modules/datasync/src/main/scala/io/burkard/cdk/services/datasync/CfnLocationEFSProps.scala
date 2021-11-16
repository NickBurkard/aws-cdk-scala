package io.burkard.cdk.services.datasync

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLocationEFSProps {

  def apply(
    efsFilesystemArn: String,
    ec2Config: software.amazon.awscdk.services.datasync.CfnLocationEFS.Ec2ConfigProperty,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    subdirectory: Option[String] = None
  ): software.amazon.awscdk.services.datasync.CfnLocationEFSProps =
    (new software.amazon.awscdk.services.datasync.CfnLocationEFSProps.Builder)
      .efsFilesystemArn(efsFilesystemArn)
      .ec2Config(ec2Config)
      .tags(tags.map(_.asJava).orNull)
      .subdirectory(subdirectory.orNull)
      .build()
}
