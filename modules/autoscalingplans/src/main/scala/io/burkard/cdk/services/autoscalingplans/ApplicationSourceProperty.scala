package io.burkard.cdk.services.autoscalingplans

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ApplicationSourceProperty {

  def apply(
    tagFilters: Option[List[_]] = None,
    cloudFormationStackArn: Option[String] = None
  ): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ApplicationSourceProperty =
    (new software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ApplicationSourceProperty.Builder)
      .tagFilters(tagFilters.map(_.asJava).orNull)
      .cloudFormationStackArn(cloudFormationStackArn.orNull)
      .build()
}
