package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAnomalyDetectorProps {

  def apply(
    stat: Option[String] = None,
    metricName: Option[String] = None,
    configuration: Option[software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.ConfigurationProperty] = None,
    dimensions: Option[List[_]] = None,
    namespace: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetectorProps =
    (new software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetectorProps.Builder)
      .stat(stat.orNull)
      .metricName(metricName.orNull)
      .configuration(configuration.orNull)
      .dimensions(dimensions.map(_.asJava).orNull)
      .namespace(namespace.orNull)
      .build()
}
