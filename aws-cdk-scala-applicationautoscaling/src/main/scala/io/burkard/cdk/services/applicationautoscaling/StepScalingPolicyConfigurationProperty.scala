package io.burkard.cdk.services.applicationautoscaling

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StepScalingPolicyConfigurationProperty {

  def apply(
    metricAggregationType: Option[String] = None,
    cooldown: Option[Number] = None,
    adjustmentType: Option[String] = None,
    stepAdjustments: Option[List[_]] = None,
    minAdjustmentMagnitude: Option[Number] = None
  ): software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty =
    (new software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty.Builder)
      .metricAggregationType(metricAggregationType.orNull)
      .cooldown(cooldown.orNull)
      .adjustmentType(adjustmentType.orNull)
      .stepAdjustments(stepAdjustments.map(_.asJava).orNull)
      .minAdjustmentMagnitude(minAdjustmentMagnitude.orNull)
      .build()
}
