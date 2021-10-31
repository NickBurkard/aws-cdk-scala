package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MetricProperty {

  def apply(
    metricName: Option[String] = None,
    dimensions: Option[List[_]] = None,
    namespace: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricProperty =
    (new software.amazon.awscdk.services.cloudwatch.CfnAlarm.MetricProperty.Builder)
      .metricName(metricName.orNull)
      .dimensions(dimensions.map(_.asJava).orNull)
      .namespace(namespace.orNull)
      .build()
}
