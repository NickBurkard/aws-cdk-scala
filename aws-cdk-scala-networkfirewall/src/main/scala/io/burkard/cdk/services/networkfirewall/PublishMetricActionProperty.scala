package io.burkard.cdk.services.networkfirewall

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PublishMetricActionProperty {

  def apply(
    dimensions: Option[List[_]] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PublishMetricActionProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PublishMetricActionProperty.Builder)
      .dimensions(dimensions.map(_.asJava).orNull)
      .build()
}
