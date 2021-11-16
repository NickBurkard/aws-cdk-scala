package io.burkard.cdk.services.emr

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnInstanceGroupConfig {

  def apply(
    internalResourceId: String,
    instanceRole: String,
    jobFlowId: String,
    instanceCount: Number,
    instanceType: String,
    ebsConfiguration: Option[software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.EbsConfigurationProperty] = None,
    name: Option[String] = None,
    market: Option[String] = None,
    autoScalingPolicy: Option[software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.AutoScalingPolicyProperty] = None,
    configurations: Option[List[_]] = None,
    bidPrice: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.emr.CfnInstanceGroupConfig =
    software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.Builder
      .create(stackCtx, internalResourceId)
      .instanceRole(instanceRole)
      .jobFlowId(jobFlowId)
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
