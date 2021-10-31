package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MetricStatConfig {

  def apply(
    statistic: Option[String] = None,
    metricName: Option[String] = None,
    unitFilter: Option[software.amazon.awscdk.services.cloudwatch.Unit] = None,
    account: Option[String] = None,
    period: Option[software.amazon.awscdk.Duration] = None,
    namespace: Option[String] = None,
    dimensions: Option[List[_ <: software.amazon.awscdk.services.cloudwatch.Dimension]] = None,
    region: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.MetricStatConfig =
    (new software.amazon.awscdk.services.cloudwatch.MetricStatConfig.Builder)
      .statistic(statistic.orNull)
      .metricName(metricName.orNull)
      .unitFilter(unitFilter.orNull)
      .account(account.orNull)
      .period(period.orNull)
      .namespace(namespace.orNull)
      .dimensions(dimensions.map(_.asJava).orNull)
      .region(region.orNull)
      .build()
}
