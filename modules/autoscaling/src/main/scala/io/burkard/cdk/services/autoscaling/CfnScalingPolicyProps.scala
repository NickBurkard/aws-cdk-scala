package io.burkard.cdk.services.autoscaling

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
