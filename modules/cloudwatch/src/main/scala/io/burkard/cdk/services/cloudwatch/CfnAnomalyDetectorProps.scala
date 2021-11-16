package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAnomalyDetectorProps {

  def apply(
    stat: String,
    metricName: String,
    namespace: String,
    configuration: Option[software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.ConfigurationProperty] = None,
    dimensions: Option[List[_]] = None
  ): software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetectorProps =
    (new software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetectorProps.Builder)
      .stat(stat)
      .metricName(metricName)
      .namespace(namespace)
      .configuration(configuration.orNull)
      .dimensions(dimensions.map(_.asJava).orNull)
      .build()
}
