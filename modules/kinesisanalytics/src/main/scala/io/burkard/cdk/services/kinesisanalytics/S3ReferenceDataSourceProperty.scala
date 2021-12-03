package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3ReferenceDataSourceProperty {

  def apply(
    fileKey: String,
    bucketArn: String
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty.Builder)
      .fileKey(fileKey)
      .bucketArn(bucketArn)
      .build()
}
