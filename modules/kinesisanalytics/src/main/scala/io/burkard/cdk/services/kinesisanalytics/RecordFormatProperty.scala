package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RecordFormatProperty {

  def apply(
    recordFormatType: String,
    mappingParameters: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplication.MappingParametersProperty] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordFormatProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordFormatProperty.Builder)
      .recordFormatType(recordFormatType)
      .mappingParameters(mappingParameters.orNull)
      .build()
}
