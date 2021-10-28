package io.burkard.cdk.services.emr

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnInstanceGroupConfigProps {

  def apply(
    ebsConfiguration: Option[software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty] = None,
    name: Option[String] = None,
    market: Option[String] = None,
    instanceRole: Option[String] = None,
    jobFlowId: Option[String] = None,
    instanceCount: Option[Number] = None,
    autoScalingPolicy: Option[software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty] = None,
    configurations: Option[List[_]] = None,
    bidPrice: Option[String] = None,
    instanceType: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps =
    (new software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps.Builder)
      .ebsConfiguration(ebsConfiguration.orNull)
      .name(name.orNull)
      .market(market.orNull)
      .instanceRole(instanceRole.orNull)
      .jobFlowId(jobFlowId.orNull)
      .instanceCount(instanceCount.orNull)
      .autoScalingPolicy(autoScalingPolicy.orNull)
      .configurations(configurations.map(_.asJava).orNull)
      .bidPrice(bidPrice.orNull)
      .instanceType(instanceType.orNull)
      .build()
}
