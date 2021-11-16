package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoggingInfoProperty {

  def apply(
    brokerLogs: software.amazon.awscdk.services.msk.CfnCluster.BrokerLogsProperty
  ): software.amazon.awscdk.services.msk.CfnCluster.LoggingInfoProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.LoggingInfoProperty.Builder)
      .brokerLogs(brokerLogs)
      .build()
}
