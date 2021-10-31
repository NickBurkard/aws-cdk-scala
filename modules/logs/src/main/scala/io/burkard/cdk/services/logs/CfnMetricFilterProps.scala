package io.burkard.cdk.services.logs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
