package io.burkard.cdk.services.logs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnMetricFilterProps {

  def apply(
    filterPattern: Option[String] = None,
    metricTransformations: Option[List[_]] = None,
    logGroupName: Option[String] = None
  ): software.amazon.awscdk.services.logs.CfnMetricFilterProps =
    (new software.amazon.awscdk.services.logs.CfnMetricFilterProps.Builder)
      .filterPattern(filterPattern.orNull)
      .metricTransformations(metricTransformations.map(_.asJava).orNull)
      .logGroupName(logGroupName.orNull)
      .build()
}
