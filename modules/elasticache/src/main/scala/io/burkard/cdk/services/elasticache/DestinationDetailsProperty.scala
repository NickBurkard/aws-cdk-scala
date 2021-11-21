package io.burkard.cdk.services.elasticache

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DestinationDetailsProperty {

  def apply(
    kinesisFirehoseDetails: Option[software.amazon.awscdk.services.elasticache.CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty] = None,
    cloudWatchLogsDetails: Option[software.amazon.awscdk.services.elasticache.CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty] = None
  ): software.amazon.awscdk.services.elasticache.CfnReplicationGroup.DestinationDetailsProperty =
    (new software.amazon.awscdk.services.elasticache.CfnReplicationGroup.DestinationDetailsProperty.Builder)
      .kinesisFirehoseDetails(kinesisFirehoseDetails.orNull)
      .cloudWatchLogsDetails(cloudWatchLogsDetails.orNull)
      .build()
}
