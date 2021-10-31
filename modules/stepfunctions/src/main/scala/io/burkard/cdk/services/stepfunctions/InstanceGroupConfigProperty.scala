package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InstanceGroupConfigProperty {

  def apply(
    ebsConfiguration: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsConfigurationProperty] = None,
    name: Option[String] = None,
    market: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceMarket] = None,
    instanceRole: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceRoleType] = None,
    instanceCount: Option[Number] = None,
    autoScalingPolicy: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.AutoScalingPolicyProperty] = None,
    configurations: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ConfigurationProperty]] = None,
    bidPrice: Option[String] = None,
    instanceType: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceGroupConfigProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceGroupConfigProperty.Builder)
      .ebsConfiguration(ebsConfiguration.orNull)
      .name(name.orNull)
      .market(market.orNull)
      .instanceRole(instanceRole.orNull)
      .instanceCount(instanceCount.orNull)
      .autoScalingPolicy(autoScalingPolicy.orNull)
      .configurations(configurations.map(_.asJava).orNull)
      .bidPrice(bidPrice.orNull)
      .instanceType(instanceType.orNull)
      .build()
}
