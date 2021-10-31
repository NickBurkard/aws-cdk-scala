package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CSVMappingParametersProperty {

  def apply(
    recordRowDelimiter: Option[String] = None,
    recordColumnDelimiter: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CSVMappingParametersProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CSVMappingParametersProperty.Builder)
      .recordRowDelimiter(recordRowDelimiter.orNull)
      .recordColumnDelimiter(recordColumnDelimiter.orNull)
      .build()
}
