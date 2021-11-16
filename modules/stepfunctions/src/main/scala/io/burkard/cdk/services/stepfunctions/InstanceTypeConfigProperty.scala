package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InstanceTypeConfigProperty {

  def apply(
    instanceType: String,
    ebsConfiguration: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsConfigurationProperty] = None,
    bidPriceAsPercentageOfOnDemandPrice: Option[Number] = None,
    weightedCapacity: Option[Number] = None,
    configurations: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ConfigurationProperty]] = None,
    bidPrice: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceTypeConfigProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceTypeConfigProperty.Builder)
      .instanceType(instanceType)
      .ebsConfiguration(ebsConfiguration.orNull)
      .bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice.orNull)
      .weightedCapacity(weightedCapacity.orNull)
      .configurations(configurations.map(_.asJava).orNull)
      .bidPrice(bidPrice.orNull)
      .build()
}
