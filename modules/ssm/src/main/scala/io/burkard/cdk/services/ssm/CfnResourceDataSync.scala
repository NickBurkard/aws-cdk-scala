package io.burkard.cdk.services.ssm

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceDataSync {

  def apply(
    internalResourceId: String,
    syncName: String,
    syncType: Option[String] = None,
    bucketRegion: Option[String] = None,
    kmsKeyArn: Option[String] = None,
    s3Destination: Option[software.amazon.awscdk.services.ssm.CfnResourceDataSync.S3DestinationProperty] = None,
    bucketName: Option[String] = None,
    syncFormat: Option[String] = None,
    syncSource: Option[software.amazon.awscdk.services.ssm.CfnResourceDataSync.SyncSourceProperty] = None,
    bucketPrefix: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ssm.CfnResourceDataSync =
    software.amazon.awscdk.services.ssm.CfnResourceDataSync.Builder
      .create(stackCtx, internalResourceId)
      .syncName(syncName)
      .syncType(syncType.orNull)
      .bucketRegion(bucketRegion.orNull)
      .kmsKeyArn(kmsKeyArn.orNull)
      .s3Destination(s3Destination.orNull)
      .bucketName(bucketName.orNull)
      .syncFormat(syncFormat.orNull)
      .syncSource(syncSource.orNull)
      .bucketPrefix(bucketPrefix.orNull)
      .build()
}
