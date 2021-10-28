package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BrokerLogsProperty {

  def apply(
    s3: Option[software.amazon.awscdk.services.msk.CfnCluster.S3Property] = None,
    cloudWatchLogs: Option[software.amazon.awscdk.services.msk.CfnCluster.CloudWatchLogsProperty] = None,
    firehose: Option[software.amazon.awscdk.services.msk.CfnCluster.FirehoseProperty] = None
  ): software.amazon.awscdk.services.msk.CfnCluster.BrokerLogsProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.BrokerLogsProperty.Builder)
      .s3(s3.orNull)
      .cloudWatchLogs(cloudWatchLogs.orNull)
      .firehose(firehose.orNull)
      .build()
}
