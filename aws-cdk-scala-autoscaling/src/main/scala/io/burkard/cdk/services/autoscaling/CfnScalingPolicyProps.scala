package io.burkard.cdk.services.autoscaling

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnScalingPolicyProps {

  def apply(
    metricAggregationType: Option[String] = None,
    cooldown: Option[String] = None,
    targetTrackingConfiguration: Option[software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty] = None,
    estimatedInstanceWarmup: Option[Number] = None,
    adjustmentType: Option[String] = None,
    predictiveScalingConfiguration: Option[software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingConfigurationProperty] = None,
    autoScalingGroupName: Option[String] = None,
    stepAdjustments: Option[List[_]] = None,
    minAdjustmentMagnitude: Option[Number] = None,
    scalingAdjustment: Option[Number] = None,
    policyType: Option[String] = None
  ): software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps =
    (new software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps.Builder)
      .metricAggregationType(metricAggregationType.orNull)
      .cooldown(cooldown.orNull)
      .targetTrackingConfiguration(targetTrackingConfiguration.orNull)
      .estimatedInstanceWarmup(estimatedInstanceWarmup.orNull)
      .adjustmentType(adjustmentType.orNull)
      .predictiveScalingConfiguration(predictiveScalingConfiguration.orNull)
      .autoScalingGroupName(autoScalingGroupName.orNull)
      .stepAdjustments(stepAdjustments.map(_.asJava).orNull)
      .minAdjustmentMagnitude(minAdjustmentMagnitude.orNull)
      .scalingAdjustment(scalingAdjustment.orNull)
      .policyType(policyType.orNull)
      .build()
}
