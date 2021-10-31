package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AggregationTypeProperty {

  def apply(
    name: Option[String] = None,
    values: Option[List[String]] = None
  ): software.amazon.awscdk.services.iot.CfnFleetMetric.AggregationTypeProperty =
    (new software.amazon.awscdk.services.iot.CfnFleetMetric.AggregationTypeProperty.Builder)
      .name(name.orNull)
      .values(values.map(_.asJava).orNull)
      .build()
}
