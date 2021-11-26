package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAnomalyDetectorProps {

  def apply(
    metricMathAnomalyDetector: Option[software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricMathAnomalyDetectorProperty] = None,
    stat: Option[String] = None,
    metricName: Option[String] = None,
    configuration: Option[software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.ConfigurationProperty] = None,
    dimensions: Option[List[_]] = None,
    singleMetricAnomalyDetector: Option[software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty] = None,
    namespace: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetectorProps =
    (new software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetectorProps.Builder)
      .metricMathAnomalyDetector(metricMathAnomalyDetector.orNull)
      .stat(stat.orNull)
      .metricName(metricName.orNull)
      .configuration(configuration.orNull)
      .dimensions(dimensions.map(_.asJava).orNull)
      .singleMetricAnomalyDetector(singleMetricAnomalyDetector.orNull)
      .namespace(namespace.orNull)
      .build()
}
