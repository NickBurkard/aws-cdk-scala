package io.burkard.cdk.services.emr

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InstanceTypeConfigProperty {

  def apply(
    ebsConfiguration: Option[software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsConfigurationProperty] = None,
    bidPriceAsPercentageOfOnDemandPrice: Option[Number] = None,
    weightedCapacity: Option[Number] = None,
    configurations: Option[List[_]] = None,
    bidPrice: Option[String] = None,
    instanceType: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty =
    (new software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty.Builder)
      .ebsConfiguration(ebsConfiguration.orNull)
      .bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice.orNull)
      .weightedCapacity(weightedCapacity.orNull)
      .configurations(configurations.map(_.asJava).orNull)
      .bidPrice(bidPrice.orNull)
      .instanceType(instanceType.orNull)
      .build()
}
