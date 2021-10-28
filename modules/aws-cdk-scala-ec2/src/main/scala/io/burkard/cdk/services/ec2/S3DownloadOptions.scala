package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3DownloadOptions {

  def apply(
    bucket: Option[software.amazon.awscdk.services.s3.IBucket] = None,
    localFile: Option[String] = None,
    bucketKey: Option[String] = None
  ): software.amazon.awscdk.services.ec2.S3DownloadOptions =
    (new software.amazon.awscdk.services.ec2.S3DownloadOptions.Builder)
      .bucket(bucket.orNull)
      .localFile(localFile.orNull)
      .bucketKey(bucketKey.orNull)
      .build()
}
