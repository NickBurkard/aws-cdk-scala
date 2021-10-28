package io.burkard.cdk.services.applicationautoscaling

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CustomizedMetricSpecificationProperty {

  def apply(
    statistic: Option[String] = None,
    metricName: Option[String] = None,
    dimensions: Option[List[_]] = None,
    unit: Option[String] = None,
    namespace: Option[String] = None
  ): software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty =
    (new software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder)
      .statistic(statistic.orNull)
      .metricName(metricName.orNull)
      .dimensions(dimensions.map(_.asJava).orNull)
      .unit(unit.orNull)
      .namespace(namespace.orNull)
      .build()
}
