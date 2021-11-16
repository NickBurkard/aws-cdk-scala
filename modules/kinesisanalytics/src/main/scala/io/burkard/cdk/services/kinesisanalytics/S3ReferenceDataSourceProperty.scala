package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3ReferenceDataSourceProperty {

  def apply(
    referenceRoleArn: String,
    fileKey: String,
    bucketArn: String
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty.Builder)
      .referenceRoleArn(referenceRoleArn)
      .fileKey(fileKey)
      .bucketArn(bucketArn)
      .build()
}
