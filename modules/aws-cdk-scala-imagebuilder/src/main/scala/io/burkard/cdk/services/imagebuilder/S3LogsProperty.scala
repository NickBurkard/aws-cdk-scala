package io.burkard.cdk.services.imagebuilder

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3LogsProperty {

  def apply(
    s3BucketName: Option[String] = None,
    s3KeyPrefix: Option[String] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.S3LogsProperty =
    (new software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.S3LogsProperty.Builder)
      .s3BucketName(s3BucketName.orNull)
      .s3KeyPrefix(s3KeyPrefix.orNull)
      .build()
}
