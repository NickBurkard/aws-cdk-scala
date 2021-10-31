package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RecordFormatProperty {

  def apply(
    recordFormatType: Option[String] = None,
    mappingParameters: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.MappingParametersProperty] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordFormatProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordFormatProperty.Builder)
      .recordFormatType(recordFormatType.orNull)
      .mappingParameters(mappingParameters.orNull)
      .build()
}
