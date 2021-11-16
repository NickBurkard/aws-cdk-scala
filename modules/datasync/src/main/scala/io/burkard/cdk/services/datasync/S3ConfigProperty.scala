package io.burkard.cdk.services.datasync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3ConfigProperty {

  def apply(
    bucketAccessRoleArn: String
  ): software.amazon.awscdk.services.datasync.CfnLocationS3.S3ConfigProperty =
    (new software.amazon.awscdk.services.datasync.CfnLocationS3.S3ConfigProperty.Builder)
      .bucketAccessRoleArn(bucketAccessRoleArn)
      .build()
}
