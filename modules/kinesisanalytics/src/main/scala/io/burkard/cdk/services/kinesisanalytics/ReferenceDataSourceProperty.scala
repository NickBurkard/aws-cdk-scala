package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ReferenceDataSourceProperty {

  def apply(
    referenceSchema: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceSchemaProperty,
    tableName: Option[String] = None,
    s3ReferenceDataSource: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceDataSourceProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceDataSourceProperty.Builder)
      .referenceSchema(referenceSchema)
      .tableName(tableName.orNull)
      .s3ReferenceDataSource(s3ReferenceDataSource.orNull)
      .build()
}
