package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3ParametersProperty {

  def apply(
    manifestFileLocation: software.amazon.awscdk.services.quicksight.CfnDataSource.ManifestFileLocationProperty
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.S3ParametersProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.S3ParametersProperty.Builder)
      .manifestFileLocation(manifestFileLocation)
      .build()
}
