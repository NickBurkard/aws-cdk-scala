package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3ReferenceDataSourceProperty {

  def apply(
    referenceRoleArn: Option[String] = None,
    fileKey: Option[String] = None,
    bucketArn: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty.Builder)
      .referenceRoleArn(referenceRoleArn.orNull)
      .fileKey(fileKey.orNull)
      .bucketArn(bucketArn.orNull)
      .build()
}
