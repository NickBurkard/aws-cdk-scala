package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DataExportProperty {

  def apply(
    s3BucketDestination: Option[software.amazon.awscdk.services.s3.CfnStorageLens.S3BucketDestinationProperty] = None
  ): software.amazon.awscdk.services.s3.CfnStorageLens.DataExportProperty =
    (new software.amazon.awscdk.services.s3.CfnStorageLens.DataExportProperty.Builder)
      .s3BucketDestination(s3BucketDestination.orNull)
      .build()
}
