package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object JSONMappingParametersProperty {

  def apply(
    recordRowPath: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplication.JSONMappingParametersProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplication.JSONMappingParametersProperty.Builder)
      .recordRowPath(recordRowPath.orNull)
      .build()
}
