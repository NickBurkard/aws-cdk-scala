package io.burkard.cdk.services.autoscalingplans

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ScalingInstructionProperty {

  def apply(
    maxCapacity: Option[Number] = None,
    predictiveScalingMaxCapacityBuffer: Option[Number] = None,
    predictiveScalingMode: Option[String] = None,
    serviceNamespace: Option[String] = None,
    predefinedLoadMetricSpecification: Option[software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.PredefinedLoadMetricSpecificationProperty] = None,
    minCapacity: Option[Number] = None,
    targetTrackingConfigurations: Option[List[_]] = None,
    disableDynamicScaling: Option[Boolean] = None,
    predictiveScalingMaxCapacityBehavior: Option[String] = None,
    scalableDimension: Option[String] = None,
    resourceId: Option[String] = None,
    scalingPolicyUpdateBehavior: Option[String] = None,
    customizedLoadMetricSpecification: Option[software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedLoadMetricSpecificationProperty] = None,
    scheduledActionBufferTime: Option[Number] = None
  ): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty =
    (new software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ScalingInstructionProperty.Builder)
      .maxCapacity(maxCapacity.orNull)
      .predictiveScalingMaxCapacityBuffer(predictiveScalingMaxCapacityBuffer.orNull)
      .predictiveScalingMode(predictiveScalingMode.orNull)
      .serviceNamespace(serviceNamespace.orNull)
      .predefinedLoadMetricSpecification(predefinedLoadMetricSpecification.orNull)
      .minCapacity(minCapacity.orNull)
      .targetTrackingConfigurations(targetTrackingConfigurations.map(_.asJava).orNull)
      .disableDynamicScaling(disableDynamicScaling.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .predictiveScalingMaxCapacityBehavior(predictiveScalingMaxCapacityBehavior.orNull)
      .scalableDimension(scalableDimension.orNull)
      .resourceId(resourceId.orNull)
      .scalingPolicyUpdateBehavior(scalingPolicyUpdateBehavior.orNull)
      .customizedLoadMetricSpecification(customizedLoadMetricSpecification.orNull)
      .scheduledActionBufferTime(scheduledActionBufferTime.orNull)
      .build()
}
