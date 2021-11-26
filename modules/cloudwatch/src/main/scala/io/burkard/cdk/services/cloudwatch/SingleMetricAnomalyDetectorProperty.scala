package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SingleMetricAnomalyDetectorProperty {

  def apply(
    stat: Option[String] = None,
    metricName: Option[String] = None,
    dimensions: Option[List[_]] = None,
    namespace: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty =
    (new software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty.Builder)
      .stat(stat.orNull)
      .metricName(metricName.orNull)
      .dimensions(dimensions.map(_.asJava).orNull)
      .namespace(namespace.orNull)
      .build()
}
