package io.burkard.cdk.services.autoscaling

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricsCollectionProperty {

  def apply(
    granularity: Option[String] = None,
    metrics: Option[List[String]] = None
  ): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MetricsCollectionProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MetricsCollectionProperty.Builder)
      .granularity(granularity.orNull)
      .metrics(metrics.map(_.asJava).orNull)
      .build()
}
