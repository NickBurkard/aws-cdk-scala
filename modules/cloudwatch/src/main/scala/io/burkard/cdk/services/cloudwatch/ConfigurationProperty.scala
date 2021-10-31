package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConfigurationProperty {

  def apply(
    excludedTimeRanges: Option[List[_]] = None,
    metricTimeZone: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.ConfigurationProperty =
    (new software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.ConfigurationProperty.Builder)
      .excludedTimeRanges(excludedTimeRanges.map(_.asJava).orNull)
      .metricTimeZone(metricTimeZone.orNull)
      .build()
}
