package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricMathAnomalyDetectorProperty {

  def apply(
    metricDataQueries: Option[List[_]] = None
  ): software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricMathAnomalyDetectorProperty =
    (new software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.MetricMathAnomalyDetectorProperty.Builder)
      .metricDataQueries(metricDataQueries.map(_.asJava).orNull)
      .build()
}
