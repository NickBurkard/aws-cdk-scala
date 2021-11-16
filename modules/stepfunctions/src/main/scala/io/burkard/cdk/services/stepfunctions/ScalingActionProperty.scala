package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScalingActionProperty {

  def apply(
    simpleScalingPolicyConfiguration: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SimpleScalingPolicyConfigurationProperty,
    market: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceMarket] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingActionProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingActionProperty.Builder)
      .simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration)
      .market(market.orNull)
      .build()
}
