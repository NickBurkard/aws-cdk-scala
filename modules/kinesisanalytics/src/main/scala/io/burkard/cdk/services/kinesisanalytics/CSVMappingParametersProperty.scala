package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CSVMappingParametersProperty {

  def apply(
    recordRowDelimiter: String,
    recordColumnDelimiter: String
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty.Builder)
      .recordRowDelimiter(recordRowDelimiter)
      .recordColumnDelimiter(recordColumnDelimiter)
      .build()
}
