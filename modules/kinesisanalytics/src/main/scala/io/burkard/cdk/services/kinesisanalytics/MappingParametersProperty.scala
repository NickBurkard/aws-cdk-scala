package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MappingParametersProperty {

  def apply(
    csvMappingParameters: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.CSVMappingParametersProperty] = None,
    jsonMappingParameters: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.JSONMappingParametersProperty] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.MappingParametersProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.MappingParametersProperty.Builder)
      .csvMappingParameters(csvMappingParameters.orNull)
      .jsonMappingParameters(jsonMappingParameters.orNull)
      .build()
}
