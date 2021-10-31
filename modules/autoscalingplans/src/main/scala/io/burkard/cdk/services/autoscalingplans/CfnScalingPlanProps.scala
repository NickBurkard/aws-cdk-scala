package io.burkard.cdk.services.autoscalingplans

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnScalingPlanProps {

  def apply(
    scalingInstructions: Option[List[_]] = None,
    applicationSource: Option[software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ApplicationSourceProperty] = None
  ): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps =
    (new software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps.Builder)
      .scalingInstructions(scalingInstructions.map(_.asJava).orNull)
      .applicationSource(applicationSource.orNull)
      .build()
}
