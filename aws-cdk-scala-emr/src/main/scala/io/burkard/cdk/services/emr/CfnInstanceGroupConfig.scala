package io.burkard.cdk.services.emr

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnInstanceGroupConfig {

  def apply(
    internalResourceId: String,
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
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.emr.CfnInstanceGroupConfig =
    software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.Builder
      .create(stackCtx, internalResourceId)
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
