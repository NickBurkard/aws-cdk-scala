package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RecordFormatProperty {

  def apply(
    recordFormatType: String,
    mappingParameters: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.MappingParametersProperty] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordFormatProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordFormatProperty.Builder)
      .recordFormatType(recordFormatType)
      .mappingParameters(mappingParameters.orNull)
      .build()
}
