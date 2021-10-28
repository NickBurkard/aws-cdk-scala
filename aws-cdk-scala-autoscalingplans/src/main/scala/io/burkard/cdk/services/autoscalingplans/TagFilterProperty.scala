package io.burkard.cdk.services.autoscalingplans

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TagFilterProperty {

  def apply(
    key: Option[String] = None,
    values: Option[List[String]] = None
  ): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TagFilterProperty =
    (new software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TagFilterProperty.Builder)
      .key(key.orNull)
      .values(values.map(_.asJava).orNull)
      .build()
}
