package io.burkard.cdk.services.logs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnMetricFilter {

  def apply(
    internalResourceId: String,
    filterPattern: Option[String] = None,
    metricTransformations: Option[List[_]] = None,
    logGroupName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.logs.CfnMetricFilter =
    software.amazon.awscdk.services.logs.CfnMetricFilter.Builder
      .create(stackCtx, internalResourceId)
      .filterPattern(filterPattern.orNull)
      .metricTransformations(metricTransformations.map(_.asJava).orNull)
      .logGroupName(logGroupName.orNull)
      .build()
}
