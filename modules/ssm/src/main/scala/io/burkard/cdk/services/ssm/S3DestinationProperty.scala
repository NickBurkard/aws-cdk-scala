package io.burkard.cdk.services.ssm

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3DestinationProperty {

  def apply(
    bucketRegion: Option[String] = None,
    kmsKeyArn: Option[String] = None,
    bucketPrefix: Option[String] = None,
    bucketName: Option[String] = None,
    syncFormat: Option[String] = None
  ): software.amazon.awscdk.services.ssm.CfnResourceDataSync.S3DestinationProperty =
    (new software.amazon.awscdk.services.ssm.CfnResourceDataSync.S3DestinationProperty.Builder)
      .bucketRegion(bucketRegion.orNull)
      .kmsKeyArn(kmsKeyArn.orNull)
      .bucketPrefix(bucketPrefix.orNull)
      .bucketName(bucketName.orNull)
      .syncFormat(syncFormat.orNull)
      .build()
}
