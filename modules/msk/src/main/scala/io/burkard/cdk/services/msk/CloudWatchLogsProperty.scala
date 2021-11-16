package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CloudWatchLogsProperty {

  def apply(
    enabled: Boolean,
    logGroup: Option[String] = None
  ): software.amazon.awscdk.services.msk.CfnCluster.CloudWatchLogsProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.CloudWatchLogsProperty.Builder)
      .enabled(enabled)
      .logGroup(logGroup.orNull)
      .build()
}
