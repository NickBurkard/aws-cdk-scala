package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricAlarmConfig {

  def apply(
    statistic: Option[software.amazon.awscdk.services.cloudwatch.Statistic] = None,
    metricName: Option[String] = None,
    dimensions: Option[List[_ <: software.amazon.awscdk.services.cloudwatch.Dimension]] = None,
    unit: Option[software.amazon.awscdk.services.cloudwatch.Unit] = None,
    period: Option[Number] = None,
    namespace: Option[String] = None,
    extendedStatistic: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.MetricAlarmConfig =
    (new software.amazon.awscdk.services.cloudwatch.MetricAlarmConfig.Builder)
      .statistic(statistic.orNull)
      .metricName(metricName.orNull)
      .dimensions(dimensions.map(_.asJava).orNull)
      .unit(unit.orNull)
      .period(period.orNull)
      .namespace(namespace.orNull)
      .extendedStatistic(extendedStatistic.orNull)
      .build()
}
