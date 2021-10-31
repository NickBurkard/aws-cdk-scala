package io.burkard.cdk.services.autoscaling

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PredictiveScalingConfigurationProperty {

  def apply(
    maxCapacityBuffer: Option[Number] = None,
    metricSpecifications: Option[List[_]] = None,
    schedulingBufferTime: Option[Number] = None,
    maxCapacityBreachBehavior: Option[String] = None,
    mode: Option[String] = None
  ): software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingConfigurationProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingConfigurationProperty.Builder)
      .maxCapacityBuffer(maxCapacityBuffer.orNull)
      .metricSpecifications(metricSpecifications.map(_.asJava).orNull)
      .schedulingBufferTime(schedulingBufferTime.orNull)
      .maxCapacityBreachBehavior(maxCapacityBreachBehavior.orNull)
      .mode(mode.orNull)
      .build()
}
