package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DataExportProperty {

  def apply(
    outputSchemaVersion: String,
    destination: software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty
  ): software.amazon.awscdk.services.s3.CfnBucket.DataExportProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.DataExportProperty.Builder)
      .outputSchemaVersion(outputSchemaVersion)
      .destination(destination)
      .build()
}
