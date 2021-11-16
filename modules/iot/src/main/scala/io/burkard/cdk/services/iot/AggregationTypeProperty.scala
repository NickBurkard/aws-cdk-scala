package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AggregationTypeProperty {

  def apply(
    name: String,
    values: List[String]
  ): software.amazon.awscdk.services.iot.CfnFleetMetric.AggregationTypeProperty =
    (new software.amazon.awscdk.services.iot.CfnFleetMetric.AggregationTypeProperty.Builder)
      .name(name)
      .values(values.asJava)
      .build()
}
