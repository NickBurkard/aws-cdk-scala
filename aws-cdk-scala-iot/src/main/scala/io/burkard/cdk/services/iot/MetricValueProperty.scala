package io.burkard.cdk.services.iot

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MetricValueProperty {

  def apply(
    number: Option[Number] = None,
    count: Option[String] = None,
    ports: Option[List[_ <: Number]] = None,
    strings: Option[List[String]] = None,
    cidrs: Option[List[String]] = None,
    numbers: Option[List[_ <: Number]] = None
  ): software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricValueProperty =
    (new software.amazon.awscdk.services.iot.CfnSecurityProfile.MetricValueProperty.Builder)
      .number(number.orNull)
      .count(count.orNull)
      .ports(ports.map(_.asJava).orNull)
      .strings(strings.map(_.asJava).orNull)
      .cidrs(cidrs.map(_.asJava).orNull)
      .numbers(numbers.map(_.asJava).orNull)
      .build()
}
