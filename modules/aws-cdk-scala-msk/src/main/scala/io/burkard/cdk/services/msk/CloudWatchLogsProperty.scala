package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CloudWatchLogsProperty {

  def apply(
    logGroup: Option[String] = None,
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.msk.CfnCluster.CloudWatchLogsProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.CloudWatchLogsProperty.Builder)
      .logGroup(logGroup.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
