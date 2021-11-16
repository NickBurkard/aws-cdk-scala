package io.burkard.cdk.services.autoscalingplans

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnScalingPlan {

  def apply(
    internalResourceId: String,
    scalingInstructions: List[_],
    applicationSource: software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ApplicationSourceProperty
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan =
    software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.Builder
      .create(stackCtx, internalResourceId)
      .scalingInstructions(scalingInstructions.asJava)
      .applicationSource(applicationSource)
      .build()
}
