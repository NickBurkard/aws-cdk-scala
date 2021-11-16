package io.burkard.cdk.services.logs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMetricFilter {

  def apply(
    internalResourceId: String,
    filterPattern: String,
    metricTransformations: List[_],
    logGroupName: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.logs.CfnMetricFilter =
    software.amazon.awscdk.services.logs.CfnMetricFilter.Builder
      .create(stackCtx, internalResourceId)
      .filterPattern(filterPattern)
      .metricTransformations(metricTransformations.asJava)
      .logGroupName(logGroupName)
      .build()
}
