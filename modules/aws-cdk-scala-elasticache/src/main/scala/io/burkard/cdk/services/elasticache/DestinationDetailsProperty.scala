package io.burkard.cdk.services.elasticache

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DestinationDetailsProperty {

  def apply(
    kinesisFirehoseDetails: Option[software.amazon.awscdk.services.elasticache.CfnCacheCluster.KinesisFirehoseDestinationDetailsProperty] = None,
    cloudWatchLogsDetails: Option[software.amazon.awscdk.services.elasticache.CfnCacheCluster.CloudWatchLogsDestinationDetailsProperty] = None
  ): software.amazon.awscdk.services.elasticache.CfnCacheCluster.DestinationDetailsProperty =
    (new software.amazon.awscdk.services.elasticache.CfnCacheCluster.DestinationDetailsProperty.Builder)
      .kinesisFirehoseDetails(kinesisFirehoseDetails.orNull)
      .cloudWatchLogsDetails(cloudWatchLogsDetails.orNull)
      .build()
}
