package io.burkard.cdk.services.autoscalingplans

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnScalingPlanProps {

  def apply(
    scalingInstructions: List[_],
    applicationSource: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ApplicationSourceProperty
  ): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps =
    (new software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps.Builder)
      .scalingInstructions(scalingInstructions.asJava)
      .applicationSource(applicationSource)
      .build()
}
