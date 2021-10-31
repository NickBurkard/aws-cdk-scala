package io.burkard.cdk.services.autoscalingplans

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CustomizedScalingMetricSpecificationProperty {

  def apply(
    statistic: Option[String] = None,
    metricName: Option[String] = None,
    dimensions: Option[List[_]] = None,
    unit: Option[String] = None,
    namespace: Option[String] = None
  ): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedScalingMetricSpecificationProperty =
    (new software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.CustomizedScalingMetricSpecificationProperty.Builder)
      .statistic(statistic.orNull)
      .metricName(metricName.orNull)
      .dimensions(dimensions.map(_.asJava).orNull)
      .unit(unit.orNull)
      .namespace(namespace.orNull)
      .build()
}
