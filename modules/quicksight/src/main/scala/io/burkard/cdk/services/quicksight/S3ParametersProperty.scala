package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3ParametersProperty {

  def apply(
    manifestFileLocation: Option[software.amazon.awscdk.services.quicksight.CfnDataSource.ManifestFileLocationProperty] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.S3ParametersProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.S3ParametersProperty.Builder)
      .manifestFileLocation(manifestFileLocation.orNull)
      .build()
}