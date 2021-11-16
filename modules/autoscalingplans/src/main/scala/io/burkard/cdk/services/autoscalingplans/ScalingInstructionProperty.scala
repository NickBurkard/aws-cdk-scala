package io.burkard.cdk.services.autoscalingplans

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScalingInstructionProperty {

  def apply(
    maxCapacity: Number,
    serviceNamespace: String,
    minCapacity: Number,
    targetTrackingConfigurations: List[_],
    scalableDimension: String,
    resourceId: String,
    predictiveScalingMaxCapacityBuffer: Option[Number] = None,
    predictiveScalingMode: Option[String] = None,
    predefinedLoadMetricSpecification: Option[software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedLoadMetricSpecificationProperty] = None,
    disableDynamicScaling: Option[Boolean] = None,
    predictiveScalingMaxCapacityBehavior: Option[String] = None,
    scalingPolicyUpdateBehavior: Option[String] = None,
    customizedLoadMetricSpecification: Option[software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty] = None,
    scheduledActionBufferTime: Option[Number] = None
  ): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty =
    (new software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder)
      .maxCapacity(maxCapacity)
      .serviceNamespace(serviceNamespace)
      .minCapacity(minCapacity)
      .targetTrackingConfigurations(targetTrackingConfigurations.asJava)
      .scalableDimension(scalableDimension)
      .resourceId(resourceId)
      .predictiveScalingMaxCapacityBuffer(predictiveScalingMaxCapacityBuffer.orNull)
      .predictiveScalingMode(predictiveScalingMode.orNull)
      .predefinedLoadMetricSpecification(predefinedLoadMetricSpecification.orNull)
      .disableDynamicScaling(disableDynamicScaling.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .predictiveScalingMaxCapacityBehavior(predictiveScalingMaxCapacityBehavior.orNull)
      .scalingPolicyUpdateBehavior(scalingPolicyUpdateBehavior.orNull)
      .customizedLoadMetricSpecification(customizedLoadMetricSpecification.orNull)
      .scheduledActionBufferTime(scheduledActionBufferTime.orNull)
      .build()
}
