package io.burkard.cdk.services.elasticache

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CloudWatchLogsDestinationDetailsProperty {

  def apply(
    logGroup: Option[String] = None
  ): software.amazon.awscdk.services.elasticache.CfnCacheCluster.CloudWatchLogsDestinationDetailsProperty =
    (new software.amazon.awscdk.services.elasticache.CfnCacheCluster.CloudWatchLogsDestinationDetailsProperty.Builder)
      .logGroup(logGroup.orNull)
      .build()
}
