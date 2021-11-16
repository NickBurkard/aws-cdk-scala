package io.burkard.cdk.services.autoscalingplans

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TagFilterProperty {

  def apply(
    key: String,
    values: Option[List[String]] = None
  ): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TagFilterProperty =
    (new software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.TagFilterProperty.Builder)
      .key(key)
      .values(values.map(_.asJava).orNull)
      .build()
}
