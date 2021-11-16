package io.burkard.cdk.services.emr

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InstanceGroupConfigProperty {

  def apply(
    instanceCount: Number,
    instanceType: String,
    ebsConfiguration: Option[software.amazon.awscdk.services.emr.CfnCluster.EbsConfigurationProperty] = None,
    name: Option[String] = None,
    market: Option[String] = None,
    autoScalingPolicy: Option[software.amazon.awscdk.services.emr.CfnCluster.AutoScalingPolicyProperty] = None,
    configurations: Option[List[_]] = None,
    bidPrice: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.InstanceGroupConfigProperty.Builder)
      .instanceCount(instanceCount)
      .instanceType(instanceType)
      .ebsConfiguration(ebsConfiguration.orNull)
      .name(name.orNull)
      .market(market.orNull)
      .autoScalingPolicy(autoScalingPolicy.orNull)
      .configurations(configurations.map(_.asJava).orNull)
      .bidPrice(bidPrice.orNull)
      .build()
}
