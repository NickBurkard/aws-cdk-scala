package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricAlarmConfig {

  def apply(
    metricName: String,
    period: Number,
    namespace: String,
    statistic: Option[software.amazon.awscdk.services.cloudwatch.Statistic] = None,
    dimensions: Option[List[_ <: software.amazon.awscdk.services.cloudwatch.Dimension]] = None,
    unit: Option[software.amazon.awscdk.services.cloudwatch.Unit] = None,
    extendedStatistic: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.MetricAlarmConfig =
    (new software.amazon.awscdk.services.cloudwatch.MetricAlarmConfig.Builder)
      .metricName(metricName)
      .period(period)
      .namespace(namespace)
      .statistic(statistic.orNull)
      .dimensions(dimensions.map(_.asJava).orNull)
      .unit(unit.orNull)
      .extendedStatistic(extendedStatistic.orNull)
      .build()
}
