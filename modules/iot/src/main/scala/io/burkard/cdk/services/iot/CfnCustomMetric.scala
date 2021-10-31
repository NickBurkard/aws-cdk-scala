package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCustomMetric {

  def apply(
    internalResourceId: String,
    displayName: Option[String] = None,
    metricName: Option[String] = None,
    metricType: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot.CfnCustomMetric =
    software.amazon.awscdk.services.iot.CfnCustomMetric.Builder
      .create(stackCtx, internalResourceId)
      .displayName(displayName.orNull)
      .metricName(metricName.orNull)
      .metricType(metricType.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
