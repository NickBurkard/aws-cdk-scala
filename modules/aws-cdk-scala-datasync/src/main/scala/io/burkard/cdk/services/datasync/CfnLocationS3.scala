package io.burkard.cdk.services.datasync

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLocationS3 {

  def apply(
    internalResourceId: String,
    s3StorageClass: Option[String] = None,
    s3Config: Option[software.amazon.awscdk.services.datasync.CfnLocationS3.S3ConfigProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    s3BucketArn: Option[String] = None,
    subdirectory: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.datasync.CfnLocationS3 =
    software.amazon.awscdk.services.datasync.CfnLocationS3.Builder
      .create(stackCtx, internalResourceId)
      .s3StorageClass(s3StorageClass.orNull)
      .s3Config(s3Config.orNull)
      .tags(tags.map(_.asJava).orNull)
      .s3BucketArn(s3BucketArn.orNull)
      .subdirectory(subdirectory.orNull)
      .build()
}
