package io.burkard.cdk.services.msk

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BrokerNodeGroupInfoProperty {

  def apply(
    storageInfo: Option[software.amazon.awscdk.services.msk.CfnCluster.StorageInfoProperty] = None,
    instanceType: Option[String] = None,
    securityGroups: Option[List[String]] = None,
    brokerAzDistribution: Option[String] = None,
    clientSubnets: Option[List[String]] = None
  ): software.amazon.awscdk.services.msk.CfnCluster.BrokerNodeGroupInfoProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.BrokerNodeGroupInfoProperty.Builder)
      .storageInfo(storageInfo.orNull)
      .instanceType(instanceType.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .brokerAzDistribution(brokerAzDistribution.orNull)
      .clientSubnets(clientSubnets.map(_.asJava).orNull)
      .build()
}
