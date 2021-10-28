package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LoggingInfoProperty {

  def apply(
    brokerLogs: Option[software.amazon.awscdk.services.msk.CfnCluster.BrokerLogsProperty] = None
  ): software.amazon.awscdk.services.msk.CfnCluster.LoggingInfoProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.LoggingInfoProperty.Builder)
      .brokerLogs(brokerLogs.orNull)
      .build()
}
