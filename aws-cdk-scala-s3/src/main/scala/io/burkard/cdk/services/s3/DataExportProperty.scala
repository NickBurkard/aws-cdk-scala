package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DataExportProperty {

  def apply(
    outputSchemaVersion: Option[String] = None,
    destination: Option[software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.DataExportProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.DataExportProperty.Builder)
      .outputSchemaVersion(outputSchemaVersion.orNull)
      .destination(destination.orNull)
      .build()
}
