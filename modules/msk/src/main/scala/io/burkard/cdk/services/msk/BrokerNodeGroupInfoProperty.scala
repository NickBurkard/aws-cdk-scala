package io.burkard.cdk.services.msk

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BrokerNodeGroupInfoProperty {

  def apply(
    instanceType: String,
    clientSubnets: List[String],
    storageInfo: Option[software.amazon.awscdk.services.msk.CfnCluster.StorageInfoProperty] = None,
    securityGroups: Option[List[String]] = None,
    brokerAzDistribution: Option[String] = None
  ): software.amazon.awscdk.services.msk.CfnCluster.BrokerNodeGroupInfoProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.BrokerNodeGroupInfoProperty.Builder)
      .instanceType(instanceType)
      .clientSubnets(clientSubnets.asJava)
      .storageInfo(storageInfo.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .brokerAzDistribution(brokerAzDistribution.orNull)
      .build()
}
