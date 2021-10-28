package io.burkard.cdk.services.elasticache

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CloudWatchLogsDestinationDetailsProperty {

  def apply(
    logGroup: Option[String] = None
  ): software.amazon.awscdk.services.elasticache.CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty =
    (new software.amazon.awscdk.services.elasticache.CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty.Builder)
      .logGroup(logGroup.orNull)
      .build()
}
