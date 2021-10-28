package io.burkard.cdk.services.dynamodb

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SystemErrorsForOperationsMetricOptions {

  def apply(
    operations: Option[List[_ <: software.amazon.awscdk.services.dynamodb.Operation]] = None,
    statistic: Option[String] = None,
    label: Option[String] = None,
    color: Option[String] = None,
    region: Option[String] = None,
    dimensionsMap: Option[Map[String, String]] = None,
    period: Option[software.amazon.awscdk.Duration] = None,
    account: Option[String] = None,
    unit: Option[software.amazon.awscdk.services.cloudwatch.Unit] = None
  ): software.amazon.awscdk.services.dynamodb.SystemErrorsForOperationsMetricOptions =
    (new software.amazon.awscdk.services.dynamodb.SystemErrorsForOperationsMetricOptions.Builder)
      .operations(operations.map(_.asJava).orNull)
      .statistic(statistic.orNull)
      .label(label.orNull)
      .color(color.orNull)
      .region(region.orNull)
      .dimensionsMap(dimensionsMap.map(_.asJava).orNull)
      .period(period.orNull)
      .account(account.orNull)
      .unit(unit.orNull)
      .build()
}
