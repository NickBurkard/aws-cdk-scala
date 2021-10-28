package io.burkard.cdk.services.iot

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCustomMetricProps {

  def apply(
    displayName: Option[String] = None,
    metricName: Option[String] = None,
    metricType: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.iot.CfnCustomMetricProps =
    (new software.amazon.awscdk.services.iot.CfnCustomMetricProps.Builder)
      .displayName(displayName.orNull)
      .metricName(metricName.orNull)
      .metricType(metricType.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
