package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3DownloadOptions {

  def apply(
    bucket: software.amazon.awscdk.services.s3.IBucket,
    bucketKey: String,
    region: Option[String] = None,
    localFile: Option[String] = None
  ): software.amazon.awscdk.services.ec2.S3DownloadOptions =
    (new software.amazon.awscdk.services.ec2.S3DownloadOptions.Builder)
      .bucket(bucket)
      .bucketKey(bucketKey)
      .region(region.orNull)
      .localFile(localFile.orNull)
      .build()
}
