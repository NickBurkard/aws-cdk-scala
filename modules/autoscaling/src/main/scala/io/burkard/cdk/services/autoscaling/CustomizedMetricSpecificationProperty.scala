package io.burkard.cdk.services.autoscaling

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomizedMetricSpecificationProperty {

  def apply(
    statistic: String,
    metricName: String,
    namespace: String,
    dimensions: Option[List[_]] = None,
    unit: Option[String] = None
  ): software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder)
      .statistic(statistic)
      .metricName(metricName)
      .namespace(namespace)
      .dimensions(dimensions.map(_.asJava).orNull)
      .unit(unit.orNull)
      .build()
}
