package io.burkard.cdk.services.mediastore

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MetricPolicyProperty {

  def apply(
    metricPolicyRules: Option[List[_]] = None,
    containerLevelMetrics: Option[String] = None
  ): software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyProperty =
    (new software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyProperty.Builder)
      .metricPolicyRules(metricPolicyRules.map(_.asJava).orNull)
      .containerLevelMetrics(containerLevelMetrics.orNull)
      .build()
}
