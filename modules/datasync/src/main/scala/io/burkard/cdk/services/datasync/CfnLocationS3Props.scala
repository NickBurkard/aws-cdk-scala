package io.burkard.cdk.services.datasync

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLocationS3Props {

  def apply(
    s3Config: software.amazon.awscdk.services.datasync.CfnLocationS3.S3ConfigProperty,
    s3BucketArn: String,
    s3StorageClass: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    subdirectory: Option[String] = None
  ): software.amazon.awscdk.services.datasync.CfnLocationS3Props =
    (new software.amazon.awscdk.services.datasync.CfnLocationS3Props.Builder)
      .s3Config(s3Config)
      .s3BucketArn(s3BucketArn)
      .s3StorageClass(s3StorageClass.orNull)
      .tags(tags.map(_.asJava).orNull)
      .subdirectory(subdirectory.orNull)
      .build()
}
