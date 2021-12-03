package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object JSONMappingParametersProperty {

  def apply(
    recordRowPath: String
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty.Builder)
      .recordRowPath(recordRowPath)
      .build()
}
