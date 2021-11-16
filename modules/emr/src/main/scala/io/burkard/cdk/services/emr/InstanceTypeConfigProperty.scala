package io.burkard.cdk.services.emr

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InstanceTypeConfigProperty {

  def apply(
    instanceType: String,
    ebsConfiguration: Option[software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsConfigurationProperty] = None,
    bidPriceAsPercentageOfOnDemandPrice: Option[Number] = None,
    weightedCapacity: Option[Number] = None,
    configurations: Option[List[_]] = None,
    bidPrice: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty =
    (new software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty.Builder)
      .instanceType(instanceType)
      .ebsConfiguration(ebsConfiguration.orNull)
      .bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice.orNull)
      .weightedCapacity(weightedCapacity.orNull)
      .configurations(configurations.map(_.asJava).orNull)
      .bidPrice(bidPrice.orNull)
      .build()
}
