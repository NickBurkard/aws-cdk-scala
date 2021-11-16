package io.burkard.cdk.services.ssm

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3DestinationProperty {

  def apply(
    bucketRegion: String,
    bucketName: String,
    syncFormat: String,
    kmsKeyArn: Option[String] = None,
    bucketPrefix: Option[String] = None
  ): software.amazon.awscdk.services.ssm.CfnResourceDataSync.S3DestinationProperty =
    (new software.amazon.awscdk.services.ssm.CfnResourceDataSync.S3DestinationProperty.Builder)
      .bucketRegion(bucketRegion)
      .bucketName(bucketName)
      .syncFormat(syncFormat)
      .kmsKeyArn(kmsKeyArn.orNull)
      .bucketPrefix(bucketPrefix.orNull)
      .build()
}
