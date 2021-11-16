package io.burkard.cdk.services.logs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMetricFilterProps {

  def apply(
    filterPattern: String,
    metricTransformations: List[_],
    logGroupName: String
  ): software.amazon.awscdk.services.logs.CfnMetricFilterProps =
    (new software.amazon.awscdk.services.logs.CfnMetricFilterProps.Builder)
      .filterPattern(filterPattern)
      .metricTransformations(metricTransformations.asJava)
      .logGroupName(logGroupName)
      .build()
}
