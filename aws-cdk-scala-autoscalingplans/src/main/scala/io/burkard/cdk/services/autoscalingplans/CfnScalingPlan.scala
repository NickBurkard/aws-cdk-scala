package io.burkard.cdk.services.autoscalingplans

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnScalingPlan {

  def apply(
    internalResourceId: String,
    scalingInstructions: Option[List[_]] = None,
    applicationSource: Option[software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.ApplicationSourceProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan =
    software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan.Builder
      .create(stackCtx, internalResourceId)
      .scalingInstructions(scalingInstructions.map(_.asJava).orNull)
      .applicationSource(applicationSource.orNull)
      .build()
}
