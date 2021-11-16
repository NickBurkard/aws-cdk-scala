package io.burkard.cdk.services.autoscaling

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PredictiveScalingConfigurationProperty {

  def apply(
    metricSpecifications: List[_],
    maxCapacityBuffer: Option[Number] = None,
    schedulingBufferTime: Option[Number] = None,
    maxCapacityBreachBehavior: Option[String] = None,
    mode: Option[String] = None
  ): software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingConfigurationProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingConfigurationProperty.Builder)
      .metricSpecifications(metricSpecifications.asJava)
      .maxCapacityBuffer(maxCapacityBuffer.orNull)
      .schedulingBufferTime(schedulingBufferTime.orNull)
      .maxCapacityBreachBehavior(maxCapacityBreachBehavior.orNull)
      .mode(mode.orNull)
      .build()
}
