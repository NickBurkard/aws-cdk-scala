package io.burkard.cdk.services.datasync

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3ConfigProperty {

  def apply(
    bucketAccessRoleArn: Option[String] = None
  ): software.amazon.awscdk.services.datasync.CfnLocationS3.S3ConfigProperty =
    (new software.amazon.awscdk.services.datasync.CfnLocationS3.S3ConfigProperty.Builder)
      .bucketAccessRoleArn(bucketAccessRoleArn.orNull)
      .build()
}
