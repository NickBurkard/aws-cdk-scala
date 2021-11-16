package io.burkard.cdk.services.mediastore

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricPolicyProperty {

  def apply(
    containerLevelMetrics: String,
    metricPolicyRules: Option[List[_]] = None
  ): software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyProperty =
    (new software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyProperty.Builder)
      .containerLevelMetrics(containerLevelMetrics)
      .metricPolicyRules(metricPolicyRules.map(_.asJava).orNull)
      .build()
}
