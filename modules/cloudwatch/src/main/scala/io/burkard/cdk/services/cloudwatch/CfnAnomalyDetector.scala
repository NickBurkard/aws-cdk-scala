package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAnomalyDetector {

  def apply(
    internalResourceId: String,
    stat: String,
    metricName: String,
    namespace: String,
    configuration: Option[software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.ConfigurationProperty] = None,
    dimensions: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector =
    software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.Builder
      .create(stackCtx, internalResourceId)
      .stat(stat)
      .metricName(metricName)
      .namespace(namespace)
      .configuration(configuration.orNull)
      .dimensions(dimensions.map(_.asJava).orNull)
      .build()
}
