package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCluster {

  def apply(
    internalResourceId: String,
    configurationInfo: Option[software.amazon.awscdk.services.msk.CfnCluster.ConfigurationInfoProperty] = None,
    kafkaVersion: Option[String] = None,
    tags: Option[AnyRef] = None,
    clientAuthentication: Option[software.amazon.awscdk.services.msk.CfnCluster.ClientAuthenticationProperty] = None,
    openMonitoring: Option[software.amazon.awscdk.services.msk.CfnCluster.OpenMonitoringProperty] = None,
    numberOfBrokerNodes: Option[Number] = None,
    encryptionInfo: Option[software.amazon.awscdk.services.msk.CfnCluster.EncryptionInfoProperty] = None,
    clusterName: Option[String] = None,
    loggingInfo: Option[software.amazon.awscdk.services.msk.CfnCluster.LoggingInfoProperty] = None,
    enhancedMonitoring: Option[String] = None,
    brokerNodeGroupInfo: Option[software.amazon.awscdk.services.msk.CfnCluster.BrokerNodeGroupInfoProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.msk.CfnCluster =
    software.amazon.awscdk.services.msk.CfnCluster.Builder
      .create(stackCtx, internalResourceId)
      .configurationInfo(configurationInfo.orNull)
      .kafkaVersion(kafkaVersion.orNull)
      .tags(tags.orNull)
      .clientAuthentication(clientAuthentication.orNull)
      .openMonitoring(openMonitoring.orNull)
      .numberOfBrokerNodes(numberOfBrokerNodes.orNull)
      .encryptionInfo(encryptionInfo.orNull)
      .clusterName(clusterName.orNull)
      .loggingInfo(loggingInfo.orNull)
      .enhancedMonitoring(enhancedMonitoring.orNull)
      .brokerNodeGroupInfo(brokerNodeGroupInfo.orNull)
      .build()
}
