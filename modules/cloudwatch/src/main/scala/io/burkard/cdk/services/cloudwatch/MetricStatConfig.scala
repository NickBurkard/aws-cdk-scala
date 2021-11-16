package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricStatConfig {

  def apply(
    statistic: String,
    metricName: String,
    period: software.amazon.awscdk.Duration,
    namespace: String,
    unitFilter: Option[software.amazon.awscdk.services.cloudwatch.Unit] = None,
    account: Option[String] = None,
    dimensions: Option[List[_ <: software.amazon.awscdk.services.cloudwatch.Dimension]] = None,
    region: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.MetricStatConfig =
    (new software.amazon.awscdk.services.cloudwatch.MetricStatConfig.Builder)
      .statistic(statistic)
      .metricName(metricName)
      .period(period)
      .namespace(namespace)
      .unitFilter(unitFilter.orNull)
      .account(account.orNull)
      .dimensions(dimensions.map(_.asJava).orNull)
      .region(region.orNull)
      .build()
}
