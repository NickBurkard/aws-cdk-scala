package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCluster {

  def apply(
    internalResourceId: String,
    kafkaVersion: String,
    numberOfBrokerNodes: Number,
    clusterName: String,
    brokerNodeGroupInfo: software.amazon.awscdk.services.msk.CfnCluster.BrokerNodeGroupInfoProperty,
    configurationInfo: Option[software.amazon.awscdk.services.msk.CfnCluster.ConfigurationInfoProperty] = None,
    tags: Option[AnyRef] = None,
    clientAuthentication: Option[software.amazon.awscdk.services.msk.CfnCluster.ClientAuthenticationProperty] = None,
    openMonitoring: Option[software.amazon.awscdk.services.msk.CfnCluster.OpenMonitoringProperty] = None,
    encryptionInfo: Option[software.amazon.awscdk.services.msk.CfnCluster.EncryptionInfoProperty] = None,
    loggingInfo: Option[software.amazon.awscdk.services.msk.CfnCluster.LoggingInfoProperty] = None,
    enhancedMonitoring: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.msk.CfnCluster =
    software.amazon.awscdk.services.msk.CfnCluster.Builder
      .create(stackCtx, internalResourceId)
      .kafkaVersion(kafkaVersion)
      .numberOfBrokerNodes(numberOfBrokerNodes)
      .clusterName(clusterName)
      .brokerNodeGroupInfo(brokerNodeGroupInfo)
      .configurationInfo(configurationInfo.orNull)
      .tags(tags.orNull)
      .clientAuthentication(clientAuthentication.orNull)
      .openMonitoring(openMonitoring.orNull)
      .encryptionInfo(encryptionInfo.orNull)
      .loggingInfo(loggingInfo.orNull)
      .enhancedMonitoring(enhancedMonitoring.orNull)
      .build()
}
