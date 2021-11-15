package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MappingParametersProperty {

  def apply(
    csvMappingParameters: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplication.CSVMappingParametersProperty] = None,
    jsonMappingParameters: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplication.JSONMappingParametersProperty] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplication.MappingParametersProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplication.MappingParametersProperty.Builder)
      .csvMappingParameters(csvMappingParameters.orNull)
      .jsonMappingParameters(jsonMappingParameters.orNull)
      .build()
}
