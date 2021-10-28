package io.burkard.cdk.services.ssm

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnResourceDataSyncProps {

  def apply(
    syncType: Option[String] = None,
    bucketRegion: Option[String] = None,
    kmsKeyArn: Option[String] = None,
    s3Destination: Option[software.amazon.awscdk.services.ssm.CfnResourceDataSync.S3DestinationProperty] = None,
    syncName: Option[String] = None,
    bucketName: Option[String] = None,
    syncFormat: Option[String] = None,
    syncSource: Option[software.amazon.awscdk.services.ssm.CfnResourceDataSync.SyncSourceProperty] = None,
    bucketPrefix: Option[String] = None
  ): software.amazon.awscdk.services.ssm.CfnResourceDataSyncProps =
    (new software.amazon.awscdk.services.ssm.CfnResourceDataSyncProps.Builder)
      .syncType(syncType.orNull)
      .bucketRegion(bucketRegion.orNull)
      .kmsKeyArn(kmsKeyArn.orNull)
      .s3Destination(s3Destination.orNull)
      .syncName(syncName.orNull)
      .bucketName(bucketName.orNull)
      .syncFormat(syncFormat.orNull)
      .syncSource(syncSource.orNull)
      .bucketPrefix(bucketPrefix.orNull)
      .build()
}
