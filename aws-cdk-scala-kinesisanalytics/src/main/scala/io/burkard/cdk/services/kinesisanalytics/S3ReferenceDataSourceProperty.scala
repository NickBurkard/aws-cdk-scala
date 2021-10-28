package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3ReferenceDataSourceProperty {

  def apply(
    fileKey: Option[String] = None,
    bucketArn: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty.Builder)
      .fileKey(fileKey.orNull)
      .bucketArn(bucketArn.orNull)
      .build()
}
