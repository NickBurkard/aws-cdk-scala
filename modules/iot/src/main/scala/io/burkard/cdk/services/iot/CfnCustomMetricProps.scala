package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCustomMetricProps {

  def apply(
    metricType: String,
    displayName: Option[String] = None,
    metricName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.iot.CfnCustomMetricProps =
    (new software.amazon.awscdk.services.iot.CfnCustomMetricProps.Builder)
      .metricType(metricType)
      .displayName(displayName.orNull)
      .metricName(metricName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
